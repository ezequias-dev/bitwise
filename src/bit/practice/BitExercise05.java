package bit.practice;

public class BitExercise05 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("5 << 1 = " + (x << 1) + " | binary: " + Integer.toBinaryString(x << 1));
        System.out.println("5 << 2 = " + (x << 2) + " | binary: " + Integer.toBinaryString(x << 2));
        System.out.println("5 << 3 = " + (x << 3) + " | binary: " + Integer.toBinaryString(x << 3));
        /*
        Por que 5 << 3 é igual a 40?
                32 16 8 4 2 1
                 0 0 0 1 0 1 = 5
                 1 0 1 0 0 0 = 40
        */

        System.out.println("5 >> 1 = " + (x >> 1) + " | binary: " + Integer.toBinaryString(x >> 1));
        System.out.println("5 >> 2 = " + (x >> 2) + " | binary: " + Integer.toBinaryString(x >> 2));
    }
}