package pack;
// if / else  it's some condition for something do  or not do
//if (condition){   ->  if condition is true =>
//statement 1
//statement 2}
//else {
// statement  ->  if condition is false
// }

public class Test {
    public static void main(String[] args) {
        int num = 5; // variable
        if (num == 5 ){ // if num = 5
            System.out.print("The number is valid.");//✔
        }else {
            System.err.print("The number is Invalid.");
        }
        System.out.println("\n");// \n -> new line
        int nume = 3; // variabless
        if (nume == 5 ){ // if num = 5
            System.out.print("The number is valid.");
        }else {
            System.err.print("The number is Invalid."); //✔
        }
    }
}
