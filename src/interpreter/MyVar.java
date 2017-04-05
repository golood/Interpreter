package interpreter;

/**
 *
 * @author admin
 */
public class MyVar {
   Object[][] var; 
   /*
   1 столбец - тип переменной
   2 столбец - имя переменной
   3 столбец - значение переменной
   */
   void setNameVar(String s){
        for(int i = 0; i<var.length; i++){
            if(var[i][1] == null){
                var[i][1] = s;
                break;
            }
        }
   }
   
   void setValueVar(String s){
       for(int i = 0; i<var.length; i++){
            if(var[i][2] == null){
                var[i][2] = s;
                break;
            }
        }
   }
   
   void setValueOnNameVar(String nameVar, String valueVar){
       for(int i = 0; i < var.length; i++)
           if(nameVar.equals((String)var[i][1]))
               var[i][2] = valueVar;
   }
           
   String getValueVar(String s){
       String gVar = "";
       for(int i = 0; i < var.length; i++)
           if(s.equals((String)var[i][1]))
               gVar = (String)var[i][2];
       return gVar;
   }
   
   String getTypeVar(String s){
       String gType = "";
       for(int i = 0; i < var.length; i++)
           if(s.equals((String)var[i][1]))
               gType = (String)var[i][0];
       return gType;
   }
   
   boolean nameVarTrue(String s){
       boolean f = false;
       for(int i = 0; i < var.length; i++)
           if(s.equals((String)var[i][1]))
               f = true;   
       return f;
   }
}
