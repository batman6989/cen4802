import java.util.*;

/**
 * This branch is to solve the javadoc missing code.
 * <p>
 *This code designed to calculate the terms of the Fibonacci sequence to the user input.
 *</p>
 *@ author Johnny Bienaime
 */
public class Fibseq {
    /**
     *
     * @param num the number of the term the user is searching for
     * @return the value assigned to the term position
     */
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
