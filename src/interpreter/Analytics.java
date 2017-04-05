package interpreter;
import java.lang.String;
/**
 *
 * @author admin
 */
public class Analytics {
    
    private String stringCode;
    Grammar myGram;
    MyVar myVar;
    
    Analytics(String s, Grammar gram, MyVar var){
        stringCode = s;
        myGram = gram;
        myVar = var;
    }

    void lexis(int index){
        String s = "";
        for(; index < stringCode.length(); index++){
            if(stringCode.charAt(index) != ' ' & stringCode.charAt(index) != '(' &
                    stringCode.charAt(index) != ')' &
                    stringCode.charAt(index) != '{' &
                    stringCode.charAt(index) != '}' &
                    stringCode.charAt(index) != '=' &
                    stringCode.charAt(index) != ';'){
                s += stringCode.charAt(index);
            }else{
                if(s.isEmpty() != true){
                    switch(s){
                        case "main":
                            s = "";
                            break;
                        case "int":
                            myGram.gVariable(setStrCodeArithmetic(index));
                            index = goIndex(index);
                            s = "";
                            break;
                        case "double":
                            myGram.gVariable(setStrCodeArithmetic(index));
                            index = goIndex(index);
                            s = "";
                            break;
                        case "boolean":
                            myGram.gVariable(setStrCodeArithmetic(index));
                            index = goIndex(index);
                            s = "";
                            break;
                        case "while":
                            myGram.gWhile(setStrCodeWhileIfUslovie(index),
                                    setStrCodeWhileIfBlok(index));
                            index = goIndexWI(index);
                            s = "";
                            break;
                        case "if":
                            myGram.gIf(setStrCodeWhileIfUslovie(index),
                                    setStrCodeIfBlok(index));
                            index = goIndexI(index);
                            s = "";
                            break;
                        case "write":
                            myGram.gWrite(setStrCodeWriteRead(index));
                            index = goIndex(index);
                            s = "";
                            break;
                        case "read":
                            myGram.gRead(setStrCodeWriteRead(index));
                            index = goIndex(index);
                            s = "";
                            break;
                        case "end":
                            break;
                        default:
                            myGram.gArithmetic(s, setStrCodeArithmetic(index));
                            index = goIndex(index);
                            s = "";
                            break;
                    }
                }
            }
        }
//        for(int i = 0; i < myVar.var.length; i++){
//            System.out.println(myVar.var[i][0] + "  " + myVar.var[i][1] + "  " +
//                    myVar.var[i][2]);
//        }
    }
    
    //_______________подготовка строки для обработки____________________________
    
    String setStrCodeArithmetic(int index){
        String s = "";
        boolean f = true;
        for(;stringCode.charAt(index) != ';'; index++){
            if(stringCode.charAt(index) != '=')
                s += stringCode.charAt(index);
        }
        s += stringCode.charAt(index++);
        return s;
    }
    
    String setStrCodeWriteRead(int index){
        String s = "";
        for(;stringCode.charAt(index) != ';'; index++){
            s += stringCode.charAt(index);
        }
        s = s.trim();
        s = s.substring(1, s.length()-1);
        return s;
    }
    
    String setStrCodeWhileIfUslovie(int index){
        String s = "";
        for(;stringCode.charAt(index) != '{'; index++)
            s += stringCode.charAt(index);
        s = s.trim();
        return s;
    }
    
    String setStrCodeWhileIfBlok(int index){
        String s = "";
        byte f = 0;
        boolean ff = false;
        for(;;index++){
            if(stringCode.charAt(index) == '{'){
                f++;
                ff = true;
            }
            if(stringCode.charAt(index) == '}'){
                f--;
                if(f == 0)
                    break;
            }
            if(ff){
                s += stringCode.charAt(index);
            }
        }
        
        s = s.trim();
        s = s.substring(1);
        s = s.trim();
        return s;
    }
    
    String[] setStrCodeIfBlok(int index){
        String []s = new String[2];
        s[0] = "";
        s[1] = "";
        byte f = 0;
        boolean ff = false;
        for(;;index++){
            if(stringCode.charAt(index) == '{'){
                f++;
                ff = true;
            }
            if(ff)
                s[0] += stringCode.charAt(index);
            if(stringCode.charAt(index) == '}'){
                f--;
                if(f == 0){
                    ff = false;
                    if(stringCode.charAt(index+1) == 'e')
                        for(;;index++){
                            if(stringCode.charAt(index+1) == '{'){
                                f++;
                                ff = true;
                            }
                            if(ff)
                                s[1] += stringCode.charAt(index+1);
                            if(stringCode.charAt(index+1) == '}'){
                                f--;
                                if(f == 0)
                                    break;
                            }
                        }
                    break;
                }
            } 
        }
        if(s[0].isEmpty() == false){
            s[0] = s[0].trim();
            s[0] = s[0].substring(1);
            s[0] = s[0].trim();
        }
        if(s[1].isEmpty() == false){
            s[1] = s[1].trim();
            s[1] = s[1].substring(1);
            s[1] = s[1].trim();
        }
       
        return s;
    }
    
    //_____________________________go index_____________________________________
    
    int goIndex(int i){
        for(;;i++){
            if(stringCode.charAt(i) == ';')
                break;
        }
        return i;
    }
    int goIndexWI(int i){
        byte f = 0;
        for(;;i++){
            if(stringCode.charAt(i) == '{')
                f++;
            if(stringCode.charAt(i) == '}'){
                f--;
                if(f == 0)
                    break;
            }
        }
        return i;
    }
    int goIndexI(int i){
        byte f = 0;
        for(;;i++){
            if(stringCode.charAt(i) == '{')
                f++;
            if(stringCode.charAt(i) == '}'){
                f--;
                if(f == 0){
                    if(stringCode.charAt(i+1) == 'e')
                        for(i +=5;;i++){
                            if(stringCode.charAt(i) == '{')
                                f++;
                            if(stringCode.charAt(i) == '}'){
                                f--;
                                if(f == 0)
                                    break;
                            }
                        }
                    break;
                }
            }
        }
        return i;
    }
}
