import java.util.*;
public class Fibseq {
    public static int fib(int num){
        if (num <= 1)
            return num;
        return fib(num-1)+fib(num-2);
    }
    public static void main (String args[]){
        int num;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the Value of N:");

        num = input.nextInt();

        System.out.println("The " + num +"th term of the Fibonacci sequence is " + fib(num));
    }

}
