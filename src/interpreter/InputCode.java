package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class InputCode {
    private String s = "";
    String reading(){
        Scanner sc = null;
        try {
//            sc = new Scanner(new File("C:\\Users\\admin\\Desktop\\test.txt"));
            sc = new Scanner(new File(getFile()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(sc.hasNext())
            s += sc.nextLine();
//        System.out.println(s);
        return s;
    }
    
    String getFile(){
        String s = "";
        System.out.println("Введите путь к файлу");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        return s;
    }
    
}
