package interpreter;

/**
 *
 * @author Shumilov Andrey
 */
public class MyStack {
    Object[] data;
    int size;
    int head;
    int tail;

    MyStack(){
            data = new Object[1000];
    }

    void add(char value){
        if(++tail == size)
            tail = 0;
        data[size++] = (Object)value;
    }

    char extract(){
        if(++head == size)
            head = 0;
        return (char)data[head];
    }

    boolean isEmpty(){
        return head == tail;
    }
}
