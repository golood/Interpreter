package interpreter;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Grammar{
    MyVar myVar;
    
        Grammar(MyVar var){
            myVar = var;
        }
    void gMain(){
        
    }
    String test = "";
    String testN = "";
    void gVariable(String strCode){
        String sLetter = "";
        String sDigit = "";
        for(int index = 0; index < strCode.length();index++ ){
            switch(strCode.charAt(index)){
                case 'e':
                case 'd':
                case 'm':
                case 'a':
                case 'n':
                case 't':
                case 'c':
                case 'f':
                case 'l':
                case 's':
                case 'h':
                case 'i':
                case 'u':
                case 'q':
                case 'r':
                case 'y':
                case 'p':
                case 'g':
                case 'j':
                case 'k':
                case 'z':
                case 'x':
                case 'v':
                case 'b':
                case 'w':
                case 'o': 
                    sLetter += strCode.charAt(index);
                    break;
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    sDigit += strCode.charAt(index);
                    break;
                case ';':
                    myVar.setNameVar(sLetter);
                    myVar.setValueVar(sDigit);
            }
        }
    }
    
    //__________________________Arithmetic______________________________________
    
    void gArithmetic(String nameVar, String strCode){
        String s = "";
        for(int i = 0; i < strCode.length(); i++){
            if(strCode.charAt(i) != ';')
                s += strCode.charAt(i);
        }
        String gg;
        int i = 0;
        boolean f = false;
        for(; i < myVar.var.length; i++){
            gg = (String) myVar.var[i][1];
            if(nameVar.equals(gg)){
                f = true;
                break;
            }
        }
        
        while(poiskFunTrueFalse(s))
            s = poiskFun(s);
        
        if(f == true){
            double numVarD;
            numVarD = expressionA(s.trim());
            writeVar(nameVar, numVarD);
        }else{
            System.out.println("Переменная " + nameVar + " не инициализирована.");
        }
        
    }
    
    double expressionA(String s){
        double n = 0;
        String left = "", right = "";
        byte ch = 0;
        int indexZnaka = -1;
        boolean f = true;
        for(int i = s.length()-1; i > 0 & f; i--){
            switch(s.charAt(i)){
                case ')':
                    ch++;
                    break;
                case '(':
                    ch--;
                    break;
                default:
                    if((s.charAt(i) == '+' | s.charAt(i) == '-') & ch == 0){
                        f = false;
                        indexZnaka = i;
                        for(int j = 0; j < i; j++)
                            if(s.charAt(i) != ' ')
                                left += s.charAt(j);
                        for(int j = 0; j+i+1 < s.length();j++)
                            if(s.charAt(i) != ' ')
                                right += s.charAt(j+i+1);
                    }
                    break;
            }
        }
        if(indexZnaka == -1 | left.isEmpty() == true){
            n = summandA(s.trim());
        }else{
            switch(s.charAt(indexZnaka)){
                case '+':
                    n = expressionA(left.trim()) + summandA(right.trim());
                    break;
                case '-':
                    n = expressionA(left.trim()) - summandA(right.trim());
                    break;
            }

        }
        return n;
    }
    
    double summandA(String s){
        double n = 0;
        String left = "", right = "";
        byte ch = 0;
        int indexZnaka = -1;
        boolean f = true;
        for(int i = s.length() - 1; i > 0 & f; i--){
            switch(s.charAt(i)){
                case ')':
                    ch++;
                    break;
                case '(':
                    ch--;
                    break;
                default:
                    if((s.charAt(i) == '*' | s.charAt(i) == '/') & ch == 0){
                        f = false;
                        indexZnaka = i;
                        for(int j = 0; j < i; j++)
                            if(s.charAt(i) != ' ')
                                left += s.charAt(j);
                        for(int j = 0; j+i+1 < s.length() ;j++)
                            if(s.charAt(i) != ' ')
                                right += s.charAt(j+i+1);
                    }
                    break;
            }
        }
        if(indexZnaka == -1){
            n = elementA(s.trim());
        }else{
            switch(s.charAt(indexZnaka)){
                case '*':
                    n = summandA(left.trim()) * elementA(right.trim());
                    break;
                case '/':
                    n = summandA(left.trim()) / elementA(right.trim());
                    break;
            }
        }
        return n;
    }
    
    double elementA(String s){
        String vspomS = "";
        double n = 0;
        boolean f = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                i++;
                for(int j = i-1; j != -1;j--)//проверяем, есть ли пере скобкой минус
                    if(s.charAt(j) == '-')   //
                        f = true;            //
                int k = 0; //счетчик внутренних скобок
                for(;i < s.length() -1;i++)
                    switch(s.charAt(i)){
                        case '(':
                            vspomS += s.charAt(i);
                            k++;
                            break;
                        case ')':
                            if(k != 0)
                                vspomS += s.charAt(i);
                            k--;
                            break;
                        default:
                            vspomS += s.charAt(i);
                    }
            }
        }
        if(vspomS.isEmpty() == false){
            if(f == false){
                n = expressionA(vspomS.trim());
            }else{
                n = - expressionA(vspomS.trim());
            }
        }else{
            for(int i = 0; i<s.length(); i++){
                switch(s.charAt(i)){
                    case ' ':
                    case '-':
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        n = numberA(s);
                        break;
                    default:
                        n = variableA(s);
                        break;
                }
            }
        }
        return n;
    }
    
    double variableA(String s){
        double n = 0;
        s = s.trim();
        String gg = "";
        if(s.charAt(0) != '-'){
            for(int i = 0; i < myVar.var.length ;i++){
                gg = (String) myVar.var[i][1];
                if(s.equals(gg))
                    n = Double.parseDouble((String)myVar.var[i][2]); 
            }
        }else{
            s = s.substring(1);
            for(int i = 0; i < myVar.var.length ;i++){
                gg = (String) myVar.var[i][1];
                if(s.equals(gg))
                    n = Double.parseDouble((String)myVar.var[i][2]) * (-1); 
            }
        }
//        if(n == 0)
//            System.out.println("нету такой переменной!");
        return n;
    }
    
    double numberA(String s){
        double n = 0;
        s = s.trim();
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '.'){
                if(s.charAt(i-1)=='0' & s.charAt(i+1) == '0')
                    break;
                else{
                    n = Double.parseDouble(s);
                    break;
                }   
            }else{
                if(n == 0 & i == s.length())
                    n = Integer.parseInt(s);
            }
        
        return (double)n;
    }
    
    void writeVar(String name, double num){
        switch(myVar.getTypeVar(name)){
            case "int":
                String s;
                s = Integer.toString((int)num);
                myVar.setValueOnNameVar(name, s);
                break;
            case "double":
                String ss;
                ss = Double.toString(num);
                myVar.setValueOnNameVar(name, ss);
                break;
            default:
                System.out.println("Неверный тип переменной! " + name);
        }
    }
    
    //--------вычисление функций в арифметики-----------------------------------
    String poiskFun(String s){  
        if(s.contains("pow(")){
            String strVspom = "";
            int i = s.indexOf("pow(")+3;
            int k = 0;
            boolean f = true;
            for(; f & i < s.length(); i++){
                switch(s.charAt(i)){
                    case '(':
                        k += 1;
                        strVspom += s.charAt(i);
                        break;
                    case ')':
                        k -= 1;
                        strVspom += s.charAt(i);
                        if(k == 0)
                            f = false;
                        break;
                    default:
                        strVspom += s.charAt(i);
                }
            }
            String num = varNumPow(strVspom);
            s = s.replace("pow"+strVspom, num);
        }
        
        if(s.contains("sqrt(")){
            String strVspom = "";
            int i = s.indexOf("sqrt(")+4;
            int k = 0;
            boolean f = true;
            for(; f & i < s.length(); i++){
                switch(s.charAt(i)){
                    case '(':
                        k += 1;
                        strVspom += s.charAt(i);
                        break;
                    case ')':
                        k -= 1;
                        strVspom += s.charAt(i);
                        if(k == 0)
                            f = false;
                        break;
                    default:
                        strVspom += s.charAt(i);
                }
            }
            String num = varNumSqrt(strVspom);
            s = s.replace("sqrt"+strVspom, num);
        }
        
        if(s.contains("PI")){
            String num = Double.toString(PI);
            s = s.replace("PI", num);
        }
        
        if(s.contains("E")){
            String num = Double.toString(E);
            s = s.replace("E", num);
        }
        
        return s;
    }
    boolean poiskFunTrueFalse(String s){
        boolean f = false;
        
        if(s.contains("sqrt("))
                f = true;
        if(s.contains("pow("))
                f = true;
        if(s.contains("PI"))
                f = true;
        if(s.contains("E"))
                f = true;
        return f;
    }
    
    String varNumPow(String s){
        s = s.substring(1, s.length()-1);
        if(poiskFunTrueFalse(s)){
            s = poiskFun(s);
            s = numPow(s);
        }else{
            s = numPow(s);
        }
        return s;
    }
    String numPow(String s){
        
        String var = "", pow = "";
        
        for(int i = 0; s.charAt(i) != ',' & i < s.length(); i++){
                var += s.charAt(i);
            }
            for(int i = s.indexOf(",") + 1; i < s.length(); i++){
                pow += s.charAt(i);
            }
            
            double sD;
            sD = pow(variableA(var.trim()), expressionA(pow.trim()));
            s = Double.toString(sD);
        return s;
    }
    
    String varNumSqrt(String s){
        s = s.substring(1, s.length()-1);
        if(poiskFunTrueFalse(s)){
            s = poiskFun(s);
            s = numSqrt(s);
        }else{
            s = numSqrt(s);
        }
        return s;
    }
    String numSqrt(String s){

        double sD;
        sD = sqrt(expressionA(s));
        s = Double.toString(sD);
        return s;
    }
    //____________________________Write_________________________________________
    
    void gWrite(String strCode){
        strCode = strCode.trim();
        expressionW(strCode);
        System.out.println();
    }
    
    void expressionW(String s){
        boolean f = true;
        for(int i = s.length()-1; i != -1 & f == true; i--){
            switch(s.charAt(i)){
                case '"':
                    textW(s.trim());
                    f = false;
                    break;
                case ',':
                    String text = "";
                    String var = "";
                    for(int j = 0; j != i;j++)
                        text += s.charAt(j);
                    for(int j = i+1; j < s.length();j++)
                        var += s.charAt(j);
                    textW(text.trim());
                    varW(var.trim());
                    f = false;
                    break;
                default:
                    if(i == 0){
                        elementW(s.trim());
                        f = false;
                    }
                    break;
            }
                
        }
    }
    
    void elementW(String s){
        if(s.charAt(0) == '"')
            textW(s);
        else
            varW(s);
    }
    
    void textW(String s){
        s = s.substring(1, s.length()-1);
        System.out.print(s);
    }
    
    void varW(String s){
        String var = "";
        var = myVar.getValueVar(s);
        System.out.print(var);
    }
         
    //____________________________While_________________________________________
    
    void gWhile(String strUslovie, String blokCode){
        strUslovie = strUslovie.substring(1, strUslovie.length()-1);
        String znak = "";
        String chislo1 = "", chislo2 = "";
        boolean f = false;
        for(int i = 0; i<strUslovie.length(); i++)
            switch(strUslovie.charAt(i)){
                case '<':
                    f = true;
                    znak += '<';
                    break;
                case '>':
                    f = true;
                    znak += '>';
                    break;
                case '=':
                    f = true;
                    znak += '=';
                    break;
                case '!':
                    f = true;
                    znak += '!';
                    break;
                default:
                    if(f == false){
                        chislo1 += strUslovie.charAt(i);
                    }else{
                        chislo2 += strUslovie.charAt(i);
                    }
                    break;
            }
        Grammar w = new Grammar(myVar);
        switch(znak){
            case "<":
                while(w.elementA(chislo1) < w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
            case ">":
                while(w.elementA(chislo1) > w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
            case "<=":
                while(w.elementA(chislo1) <= w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
            case ">=":
                while(w.elementA(chislo1) >= w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
            case "==":
                while(w.elementA(chislo1) == w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
            case "!=":  
                while(w.elementA(chislo1) != w.elementA(chislo2)){
                    Analytics aa = new Analytics(blokCode, w, myVar);
                    aa.lexis(0);
                }
                break;
        }
    }
    
    //_____________________________Read_________________________________________
    
    void gRead(String strCode){
        strCode = strCode.trim();
        
        if(myVar.nameVarTrue(strCode) == false){
            System.out.println("Переменная " + strCode + " не объявлена!");
        }else{
            Scanner scan = new Scanner(System.in);
            switch(myVar.getTypeVar(strCode)){
                case "int":
                    int i;
                    if(scan.hasNextInt()){
                        i = scan.nextInt();
                        myVar.setValueOnNameVar(strCode, Integer.toString(i));
                    }else{
                        System.out.println("Вы ввели не целое число");
                    }
                    break;
                case "double":
                    double ii;
                    if(scan.hasNextDouble()){
                        ii = scan.nextDouble();
                        myVar.setValueOnNameVar(strCode, Double.toString(ii));
                    }else{
                        System.out.println("Вы ввели число не верно");
                    }
                    break;
                case "boolean":
                    byte iii;
                    if(scan.hasNextByte()){
                        iii = scan.nextByte();
                        if(iii == 0 | iii == 1)
                            myVar.setValueOnNameVar(strCode, Byte.toString(iii));
                        else
                            System.out.println("Вы ввели число не верно");
                    }else{
                        System.out.println("Вы ввели число не верно");
                    }
                    break;
            }
        }
    }
    
    //_______________________________if_________________________________________
    
    void gIf(String strUslovie, String[] blokCode){
        strUslovie = strUslovie.substring(1, strUslovie.length()-1);
        String znak = "";
        String chislo1 = "", chislo2 = "";
        boolean f = false;
        for(int i = 0; i<strUslovie.length(); i++)
            switch(strUslovie.charAt(i)){
                case '<':
                    f = true;
                    znak += '<';
                    break;
                case '>':
                    f = true;
                    znak += '>';
                    break;
                case '=':
                    f = true;
                    znak += '=';
                    break;
                case '!':
                    f = true;
                    znak += '!';
                    break;
                default:
                    if(f == false){
                        chislo1 += strUslovie.charAt(i);
                    }else{
                        chislo2 += strUslovie.charAt(i);
                    }
                    break;
            }
        Grammar g = new Grammar(myVar);
        switch(znak){
            case "<":
                if(g.elementA(chislo1) < g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
            case ">":
                if(g.elementA(chislo1) > g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
            case "<=":
                if(g.elementA(chislo1) <= g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
            case ">=":
                if(g.elementA(chislo1) >= g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
            case "==":
                if(g.elementA(chislo1) == g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
            case "!=":  
                if(g.elementA(chislo1) != g.elementA(chislo2)){
                    if(blokCode[0].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[0], g, myVar);
                        a.lexis(0);
                    }
                }else{
                    if(blokCode[1].isEmpty() != true){
                        Analytics a = new Analytics(blokCode[1], g, myVar);
                        a.lexis(0);
                    }
                }
                break;
        }
    }
    
    //__________________________________________________________________________
}
