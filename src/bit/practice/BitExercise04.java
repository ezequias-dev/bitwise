package bit.practice;

public class BitExercise04 {
    public static void main(String[] args) {
        int READ = 1; // 001
        int WRITE = 2; // 010
        int DELETE = 4; // 100

        int permissions = 0; // 000

        System.out.println("Initial permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));
        System.out.println();

        permissions = permissions | READ;
        System.out.println("After adding READ:");
        System.out.println("permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));
        System.out.println("can read? " + ((permissions & READ) != 0));
        System.out.println();

        permissions = permissions | WRITE;
        System.out.println("After adding WRITE:");
        System.out.println("permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));
        System.out.println("can delete? " + ((permissions & DELETE) != 0));
        System.out.println();

        permissions = permissions | DELETE;
        System.out.println("After adding DELETE:");
        System.out.println("permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));
        System.out.println("can delete? " + ((permissions & DELETE) != 0));
    }
}