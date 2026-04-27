package bit.practice;

public class BitExercise01 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2)); // 1 0 = 2 0
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(4)); // 1 0 0 = 4 2 1
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(8)); // Por que 8 em binário é 1000? Por que 8 4 2 1 = 1 0 0 0 = 8
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(15)); // 1 1 1 1 = 8 4 2 1
        System.out.println(Integer.toBinaryString(16)); // 1 0 0 0 0 = 16 8 4 2 1
        System.out.println(Integer.toBinaryString(31)); // 1 1 1 1 1 = 16 8 4 2 1
        System.out.println(Integer.toBinaryString(32)); // 1 0 0 0 0 0 = 32 16 8 4 2 1
    }

}