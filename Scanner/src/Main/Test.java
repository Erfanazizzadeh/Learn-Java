package Main;

import java.util.Scanner; // from libaray java.util

// Scanner  get somthing like integer , string from user
public class Test {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
         //get number form user
        int num ; //variable
        num = name.nextInt();
        //name.nextint() for integer .
        //name.next() for String .
        //name.nextline() for String .
        //name.nextfloat() for float .
        // and .....
        System.out.println(num);
        // we can use for string or ....
        System.out.println("Now for string => ");
        String str; //variable
        str = name.next(); // get string  form user
        System.out.println(str);
    }

}
