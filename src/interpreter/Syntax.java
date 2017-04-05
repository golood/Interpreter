
package interpreter;

public class Syntax {
    
    String stringCode;
    MyVar myVar = new MyVar();
    
    Syntax(String s){
        stringCode = s;
    }
    
    boolean setSyntax(){
        int state = 0;
        boolean f = true;
        for(int i = 0;f & i<stringCode.length(); i++){
            switch (state){
                case 6:
                    f = false;
                    errorSyntax(i);
                    break;
                case 0:
                    switch (stringCode.charAt(i)){
                        case 'm':
                            state = 1;
                            break;
                        case ' ':
                            break;
                        case '%':
                            state = 114;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 1:
                    if (stringCode.charAt(i) == 'a'){
                        state = 2;
                    }else{
                        state = 6; 
                        break;
                    }
                    break;
                case 2:
                    if (stringCode.charAt(i) == 'i'){
                        state = 3;
                    }else{
                        state = 6; 
                        break;
                    }
                    break;
                case 3:
                    if (stringCode.charAt(i) == 'n'){
                        state = 4;
                    }else{
                        state = 6; 
                        break;
                    }
                    break;
                case 4:
                    if (stringCode.charAt(i) == '('){
                        state = 5;
                    }else{
                        state = 6; 
                        break;
                    }
                    break;
                case 5:
                    if (stringCode.charAt(i) == ')'){
                        state = 7;
                    }else{
                        state = 6; 
                        break;
                    }
                    break;
                case 7:
                    switch(stringCode.charAt(i)){
                        case 'i':
                            state = 13;
                            break;
                        case 'b':
                            state = 15;
                            break;
                        case 'd':
                            state = 8;
                            break;
                        case 'e':
                            state = 63;
                            break;
                        case 'w':
                            state = 21;
                            break;
                        case 'r':
                            state = 76;
                            break;
                        case ' ':
                        case '}':
                                break;
                        case '%':
                            state = 113;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
                        case 's':
                        case 'h':
                        case 'o':
                        case 'u':
                        case 'q':
                        case 'y':
                        case 'p':
                        case 'g':
                        case 'j':
                        case 'k':
                        case 'z':
                        case 'x':
                        case 'v':
                            state  = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 8:
                    switch(stringCode.charAt(i)){
                        case 'o':
                            state = 9;
                            break;
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
                        case 'd':
                        case 'e':
                        case 'w':
                            state = 67;
                            break;
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 9:
                    switch(stringCode.charAt(i)){
                        case 'u':
                            state = 10;
                            break;
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
                        case 'o':
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
                        case 'd':
                        case 'e':
                        case 'w':
                            state = 67;
                            break;
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 10:
                    switch(stringCode.charAt(i)){
                        case 'b':
                            state = 11;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 11:
                    switch(stringCode.charAt(i)){
                        case 'l':
                            state = 12;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 12:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'e':
                            state = 28;
                            break;
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
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 13:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'n':
                            state = 14;
                            break;
                        case 'f':
                            state = 48;
                            break;
                        case 'm':
                        case 'a':
                        case 't':
                        case 'c':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 14:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 't':
                            state = 36;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 15:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'o':
                            state = 16;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 16:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'o':
                            state = 17;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 17:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'l':
                            state = 18;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 18:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'e':
                            state = 19;
                            break;
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
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 19:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'a':
                            state = 20;
                            break;
                        case 'm':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 20:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'n':
                            state = 42;
                            break;
                        case 'm':
                        case 'a':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 21:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'h':
                            state = 22;
                            break;
                        case 'r':
                            state = 25;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
                        case 's':
                        case 'i':
                        case 'u':
                        case 'q':
                        case 'y':
                        case 'p':
                        case 'g':
                        case 'j':
                        case 'k':
                        case 'z':
                        case 'x':
                        case 'v':
                        case 'b':
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 22:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'i':
                            state = 23;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
                        case 's':
                        case 'h':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 23:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'l':
                            state = 24;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 24:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'e':
                            state = 48;
                            break;
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
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 25:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'i':
                            state = 26;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
                        case 's':
                        case 'h':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 26:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 't':
                            state = 27;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 27:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
                        case 'e':
                            state = 55;
                            break;
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
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 28:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 29;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 29:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 30;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 30:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 34;
                            break;
                        case '=':
                            state = 31;
                            break;
                        case ';':
                            state = 7;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 31:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 32;
                            break;
                        case '0':
                            state = 85;
                            break;
                        case '-':
                            state = 84;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 32:
                    switch(stringCode.charAt(i)){
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
                            break;
                        case '.':
                            state = 86;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 33:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 35;
                            break;
                        case ';':
                            state = 7;
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
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 34:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 31;
                            break;
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 35:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 36:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 37;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 37:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 38;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 38:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 39;
                            break;
                        case ' ':
                            state = 41;
                            break;
                        case ';':
                            state = 7;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 39:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 40;
                            break;
                        case '0':
                            state = 35;
                            break;
                        case '-':
                            state = 83;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 40:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 35;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 41:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 39;
                            break;
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 42:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 43;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 43:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 44;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 44:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 45;
                            break;
                        case ' ':
                            state = 47;
                            break;
                        case ';':
                            state = 7;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 45:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '0':
                        case '1':
                            state = 46;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 46:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 47:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 45;
                            break;
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 48:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '(':
                            state = 87;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 49:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 50;
                            break;
                        case ' ':
                            state = 88;
                            break;
                        case '>':
                        case '<':
                            state = 53;
                            break;
                        case '!':
                            state = 50;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        case '0':
                            state = 93;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 92;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 50:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 89;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 51:
                    switch(stringCode.charAt(i)){
                        case ')':
                            state = 52;
                            break;
                        case ' ':
                            state = 90;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        case '0':
                            state = 96;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 95;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 52:
                    switch(stringCode.charAt(i)){
                        case '{':
                            state = 7;
                            break;
                        case ' ':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 53:
                    switch(stringCode.charAt(i)){
                        case ' ':
                        case '=':
                            state = 89;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 51;
                            break;
                        case '0':
                            state = 96;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 95;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
//                case 54:
//                    switch(stringCode.charAt(i)){
//                        case '=':
//                            state = 51;
//                            break;
//                        default:
//                            state = 6; 
//                    }
//                    break;
                case 55:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '(':
                            state = 56;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 56:
                    switch(stringCode.charAt(i)){
                        case '"':
                            state = 59;
                            break;
                        case ' ':
                            state = 100;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 57;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 57:
                    switch(stringCode.charAt(i)){
                        case ')':
                            state = 58;
                            break;
                        case ' ':
                            state = 101;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 58:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 59:
                    switch(stringCode.charAt(i)){
                        case '"':
                            state = 60;
                            break;
                        default:
                    }
                    break;
                case 60:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ')':
                            state = 58;
                            break;
                        case ',':
                            state = 99;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 61:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 62;
                            break;
                        case ')':
                            state = 58;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 62:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ')':
                            state = 58;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 63:
                    switch(stringCode.charAt(i)){
                        case 'l':
                            state = 64;
                            break;
                        case 'n':
                            state = 75;
                            break;
                        case 'm':
                        case 'a':
                        case 't':
                        case 'c':
                        case 'f':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 64:
                    switch(stringCode.charAt(i)){
                        case 's':
                            state = 65;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 65:
                    switch(stringCode.charAt(i)){
                        case 'e':
                            state = 66;
                            break;
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
                        case 'd':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 66:
                    switch(stringCode.charAt(i)){
                        case '{':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 67:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            state = 73;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 68:
                    switch(stringCode.charAt(i)){
                        case ' ':
                        case '(':
                        case '-':
//                        case ')':
                            break;
                        case 'P':
                            state = 112;
                            break;
                        case 'E':
                            state = 69;
                            break;
                        case 'm':
                        case 'a':
                        case 'n':
                        case 't':
                        case 'c':
                        case 'f':
                        case 'l':
                        case 'h':
                        case 'i':
                        case 'u':
                        case 'q':
                        case 'r':
                        case 'y':
                        case 'g':
                        case 'j':
                        case 'k':
                        case 'z':
                        case 'x':
                        case 'v':
                        case 'b':
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            state = 69;
                            break;
                        case 'p':
                            state = 102;
                            break;
                        case 's':
                            state = 108;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            state = 70;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 69:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 74;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                        case 'd':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 70:
                    switch(stringCode.charAt(i)){
                        case ' ':
                        case ')':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case '.':
                            state = 71;
                            break;
                        case '-':
                        case '+':
                        case '*':
                        case '/':
                            state = 68;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 71:
                    switch(stringCode.charAt(i)){
                        case ')':
                            state = 74;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            state = 72;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 72:
                    switch(stringCode.charAt(i)){
                        case ' ':
                        case ')':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case '-':
                        case '+':
                        case '*':
                        case '/':
                            state = 68;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 73:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 68;
                            break;
                        case ' ':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 74:
                    switch(stringCode.charAt(i)){
                        case ' ':
                        case ')':
                            break;
                        case ';':
                            state = 7;
                            break;
                        case '-':
                        case '+':
                        case '*':
                        case '/':
                            state = 68;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 75:
                    switch(stringCode.charAt(i)){
                        case 'd':
                            if(scobki()){
                                System.out.println("Проверка прошла удачно");
                                System.out.println();
                            }else{
                                f = false;
                            }
                            break;
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
                        case 'e':
                        case 'w':
                        case 'o':
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 76:
                    switch(stringCode.charAt(i)){
                        case 'e':
                            state = 77;
                            break;
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
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 77:
                    switch(stringCode.charAt(i)){
                        case 'a':
                            state = 78;
                            break;
                        case 'e':
                        case 'd':
                        case 'm':
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
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 78:
                    switch(stringCode.charAt(i)){
                        case 'd':
                            state = 79;
                            break;
                        case 'e':
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
                            state = 67;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 79:
                    switch(stringCode.charAt(i)){
                        case '(':
                            state = 80;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 80:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                            state = 81;
                            break;
                        default:
                            state = 6;  
                    }
                    break;
                case 81:
                    switch(stringCode.charAt(i)){
                        case ')':
                            state = 82;
                            break;
                        case ' ':
                            state = 98;
                            break;
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
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 82:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ';':
                            state = 7;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 83:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 40;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 84:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 32;
                            break;
                        case '0':
                            state = 85;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 85:
                    if(stringCode.charAt(i) == '.'){
                        state = 86;
                    }else{
                        state = 6; 
                    }
                    break;
                case 86:
                    switch(stringCode.charAt(i)){
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            state = 33;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 87:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                            state = 49;
                            break;
                        case '0':
                            state = 93;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 92;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 88:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case '=':
                            state = 50;
                            break;
                        case '>':
                        case '<':
                            state = 53;
                            break;
                        case '!':
                            state = 50;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 89:
                    switch(stringCode.charAt(i)){
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
                            state = 51;
                            break;
                        case '0':
                            state = 96;
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            state = 95;
                            break;
                        case ' ':
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 90:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ')':
                            state = 52;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 92:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 52;
                            break;
                        case ' ':
                            state = 88;
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
                            break;
                        case '.':
                            state = 94;
                            break;
                        case '<':
                        case '>':
                            state = 53;
                            break;
                        case '!':
                            state = 50;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 93:
                    switch(stringCode.charAt(i)){
                        case '.':
                            state = 92;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 94:
                    switch(stringCode.charAt(i)){
                        case '=':
                            state = 50;
                            break;
                        case ' ':
                            state = 88;
                            break;
                        case '<':
                        case '>':
                            state = 53;
                            break;
                        case '!':
                            state = 50;
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
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 95:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 90;
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
                            break;
                        case ')':
                            state = 52;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 96:
                    switch(stringCode.charAt(i)){
                        case '.':
                            state = 97;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 97:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 90;
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
                            state = 97;
                            break;
                        case ')':
                            state = 52;
                            break;
                        default:
                            state = 6; 
                    }
                    break;
                case 98:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ')':
                            state = 82;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 99:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                            state = 61;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 100:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ',':
                            state = 59;
                            break;
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
                            state = 57;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 101:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ')':
                            state = 58;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 102:
                    switch(stringCode.charAt(i)){
                        case 'o':
                            state = 103;
                            break;
                        case ' ':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;
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
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 103:
                    switch(stringCode.charAt(i)){
                        case 'w':
                            state = 104;
                            break;
                        case ' ':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;
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
                        case 'o':
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 104:
                    switch(stringCode.charAt(i)){
                        case '(':
                            state = 105;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 105:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
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
                            state = 106;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 106:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            state = 107;
                            break;
                        case ',':
                            state = 68;
                            break;
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
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 107:
                    switch(stringCode.charAt(i)){
                        case ' ':
                            break;
                        case ',':
                            state = 68;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 108:
                    switch(stringCode.charAt(i)){
                        case 'q':
                            state = 109;
                            break;
                        case ' ':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;    
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
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 109:
                    switch(stringCode.charAt(i)){
                        case 'r':
                            state = 110;
                            break;
                        case ' ':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;    
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
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 110:
                    switch(stringCode.charAt(i)){
                        case 't':
                            state = 111;
                            break;
                        case ' ':
                            state = 74;
                            break;
                        case ';':
                            state = 7;
                            break;
                        case ')':
                            state = 74;
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            state = 68;
                            break;    
                        case 'e':
                        case 'd':
                        case 'm':
                        case 'a':
                        case 'n':
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
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 111:
                    switch(stringCode.charAt(i)){
                        case '(':
                            state = 68;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 112:
                    switch(stringCode.charAt(i)){
                        case 'I':
                            state = 69;
                            break;
                        default:
                            state = 6;
                    }
                    break;
                case 113:
                    switch(stringCode.charAt(i)){
                        case '%':
                            state = 7;
                            break;
                    }
                    break;
                case 114:
                    switch(stringCode.charAt(i)){
                        case '%':
                            state = 0;
                            break;                           
                    }
                    break;
                
            }   
        }
        return f;
    }
    
    void numberVar(){
        /*
            первый проход, чтитаем кол-во переменных
            второй проход, записываем индексы переменных
        */
        int num = 0;
        int[] indexVar = null;
        int index = 0;
        for(byte k = 0; k < 2;k++){
            int state = 0;
            for(int i = 0; i<stringCode.length(); i++){
                switch(state){
                    case 0:
                        switch(stringCode.charAt(i)){
                            case 'i':
                                state = 1;
                                break;
                            case 'd':
                                state = 3;
                                break;
                            case 'b': 
                                state = 8;
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1:
                        if(stringCode.charAt(i) == 'n'){
                            state = 2;
                        }else{
                            state = 0;
                        }
                        break;
                    case 2:
                        if(stringCode.charAt(i) == 't'){
                            state = 14;
                        }else{
                            state = 0;
                        }
                        break;
                    case 3:
                        if(stringCode.charAt(i) == 'o'){
                            state = 4;
                        }else{
                            state = 0;
                        }
                        break;
                    case 4:
                        if(stringCode.charAt(i) == 'u'){
                            state = 5;
                        }else{
                            state = 0;
                        }
                        break;
                    case 5:
                        if(stringCode.charAt(i) == 'b'){
                            state = 6;
                        }else{
                            state = 0;
                        }
                        break;
                    case 6:
                        if(stringCode.charAt(i) == 'l'){
                            state = 7;
                        }else{
                            state = 0;
                        }
                        break;
                    case 7:
                        if(stringCode.charAt(i) == 'e'){
                            state = 15;
                        }else{
                            state = 0;
                        }
                        break;
                    case 8:
                        if(stringCode.charAt(i) == 'o'){
                            state = 9;
                        }else{
                            state = 0;
                        }
                        break;
                    case 9:
                        if(stringCode.charAt(i) == 'o'){
                            state = 10;
                        }else{
                            state = 0;
                        }
                        break;
                    case 10:
                        if(stringCode.charAt(i) == 'l'){
                            state = 11;
                        }else{
                            state = 0;
                        }
                        break;
                    case 11:
                        if(stringCode.charAt(i) == 'e'){
                            state = 12;
                        }else{
                            state = 0;
                        }
                        break;
                    case 12:
                        if(stringCode.charAt(i) == 'a'){
                            state = 13;
                        }else{
                            state = 0;
                        }
                        break;
                    case 13:
                        if(stringCode.charAt(i) == 'n'){
                            state = 16;
                        }else{
                            state = 0;
                        }
                        break;
                    case 14:
                        if(stringCode.charAt(i) == ' '){
                            if(k == 1){
                                indexVar[index] = i+1;
                                myVar.var[index][0] = "int";
                                index++;
                            }else{
                                num++;
                            }
                            state = 0;
                        }else{
                            state = 0;
                        }
                        break;
                    case 15:
                        if(stringCode.charAt(i) == ' '){
                            state = 0;
                            if(k == 1){
                                indexVar[index] = i+1;
                                myVar.var[index][0] = "double";
                                index++;
                            }else{
                                num++;
                            }
                        }else{
                            state = 0;
                        }
                        break;
                    case 16:
                        if(stringCode.charAt(i) == ' '){
                            state = 0;
                            if(k == 1){
                                indexVar[index] = i+1;
                                myVar.var[index][0] = "boolean";
                                index++;
                            }else{
                                num++;
                            }
                        }else{
                            state = 0;
                        }
                }
            }
            if(k == 0){
                myVar.var = new Object[num][3];
                indexVar = new int[num];
            }
        }
    }
    
    void errorSyntax(int i){
        System.out.println("Ошибка " + (i-2) + "_" + (i-1) + "_" + i);
        System.out.println(stringCode.charAt(i-2) +""+ stringCode.charAt(i-1) +
                ""+stringCode.charAt(i));
        System.out.println(stringCode.charAt(i-1));
    }
    
    boolean scobki(){
        boolean f = true;
        int numSkobka = 0;
        int numZnaki = 0;
        for(int i = 0; f & i < stringCode.length(); i++){
            switch(stringCode.charAt(i)){
                case '(':
                case '{':
                    numSkobka += 1;
                    numZnaki = 0;
                    break;
                case ')':
                case '}':
                    numSkobka -= 1;
                    numZnaki = 0;
                    break;
                case '-':
                case '+':
                case '/':
                case '*':
                    numZnaki += 1;
                case ' ':
                    break;
                default:
                    if(numZnaki == 1 | numZnaki == 0){
                        numZnaki = 0;
                    }else{
                        f = false;
                        System.out.println("Знаки арифм. операций стоят подряд!");
                    }
            }
        }
        
        if(numSkobka != 0){    
            f = false;
            System.out.println("Не все скобки закрыты!");
        }
        
        return f;
    }
    
    String deleteCom(String stringCode){
        String s = "";
        int j = 0;
        for(int i = 0; i < stringCode.length(); i++){
            switch(stringCode.charAt(i)){
                case '%':
                    if(j == 0){
                        j += 1;
                    }else{
                        j -= 1;
                        stringCode = stringCode.replace("%"+s+"%", "");
                        s = "";
                        i = 0;
                    }
                    break;
                default:
                    if(j == 1)
                        s += stringCode.charAt(i);
            }
        }
        return stringCode;
    }
}
