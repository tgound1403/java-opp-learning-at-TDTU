import java.util.*;
//Define a Caculator class
public class Calculator {
    //Define a method to check n is prime or not
    public static boolean checkPrime(int n) {
        boolean result = true;
        if ( n <= 1) 
            return false;
        for( int i = 2; i <= n/2; i++)
            if (n % i == 0) {
                result = false;
                break;
            }
        return result;
    }

    //Define a method to sum all prime number less than n
    public static int calSumPrime(int n) {
        int sum = 0;
        for ( int i=2; i < n; i++)
            if(checkPrime(i)) sum += i  ;
        return sum;
    }

    //Main method to verify those methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao mot so: ");
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
        System.out.println(calSumPrime(n));
    }
}