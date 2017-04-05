
package interpreter;

/**
 *
 * @author Shumilov Andrey
 */
public class Interpreter {

    // C:\Users\admin\Desktop\test.txt
    public static void main(String[] args) {
        InputCode input = new InputCode();
        String stringCode = input.reading();
    //    Scanner in = new Scanner(System.in); 
    //    String stringCode = in.nextLine();
        Syntax syntax = new Syntax(stringCode);
        if(syntax.setSyntax()){
            syntax.numberVar();
            stringCode = syntax.deleteCom(stringCode);
//            System.out.println(stringCode);
            Grammar myGram = new Grammar(syntax.myVar);
            Analytics analis = new Analytics(stringCode, myGram, syntax.myVar);
            analis.lexis(0);
        }
    }
}