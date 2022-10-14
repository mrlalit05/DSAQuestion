package AllQuestionArray;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number:");
        int n= sc.nextInt();

        if (isPrime(n)){
            System.out.println(" prime number");
        }
        else {
            System.out.println(" not prime Number");
        }

    }

    static boolean isPrime(int n) {
        for (int i = 2; i*i<n; i++) {
            if (n % i == 0) {
               return false;
            }
        }
        return true;
    }
}