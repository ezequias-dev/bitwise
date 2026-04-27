package bit.practice;

import java.util.Scanner;

public class BitExercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n1 = sc.nextInt();

        System.out.println();

        if (n1 < 0) {
            System.out.println("Invalid number.");
        } else {
            String result;

            if ((n1 & 1) == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }

            System.out.println("Number: " + n1);
            System.out.println("Binary: " + Integer.toBinaryString(n1));
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}