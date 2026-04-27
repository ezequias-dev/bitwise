package bit.practice;

public class BitExercise02 {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        System.out.println("a = " + a + " | binary: " + Integer.toBinaryString(a));
        System.out.println("b = " + b + " | binary: " + Integer.toBinaryString(b));

        System.out.println();

        System.out.println("a & b = " + (a & b) + " | binary: " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + (a | b) + " | binary: " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + (a ^ b) + " | binary: " + Integer.toBinaryString(a ^ b));
    }
}