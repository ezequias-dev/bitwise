package bit.practice;

import java.util.Scanner;

public class UserPermissionSystem {
    private static final int READ = 1; // 0001
    private static final int WRITE = 2; // 0010
    private static final int DELETE = 4; // 0100
    private static final int ADMIN = 8; // 1000

    private static int addPermission(int permissions, int permission) {
        return permissions | permission;
    }

    private static int removePermission(int permissions, int permission) {
        return permissions & ~permission;
    }

    private static int togglePermission(int permissions, int permission) {
        return permissions ^ permission;
    }

    private static boolean hasPermission(int permissions, int permission) {
        return (permissions & permission) != 0;
    }

    private static void printPermissions(int permissions) {
        System.out.println("Current permissions value: " + permissions);
        System.out.println("Binary: " + Integer.toBinaryString(permissions));
        System.out.println("READ: " + hasPermission(permissions, READ));
        System.out.println("WRITE: " + hasPermission(permissions, WRITE));
        System.out.println("DELETE: " + hasPermission(permissions, DELETE));
        System.out.println("ADMIN: " + hasPermission(permissions, ADMIN));
    }

    private static void printMenu() {
        System.out.println("\n===== USER PERMISSION SYSTEM =====");
        System.out.println("1. Add READ");
        System.out.println("2. Add WRITE");
        System.out.println("3. Add DELETE");
        System.out.println("4. Add ADMIN");
        System.out.println("5. Remove READ");
        System.out.println("6. Remove WRITE");
        System.out.println("7. Remove DELETE");
        System.out.println("8. Remove ADMIN");
        System.out.println("9. Toggle DELETE");
        System.out.println("10. Check permissions");
        System.out.println("11. Print current permissions");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("Choose option: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int permissions = 0;

        while (true) {
            printMenu();
            int option = scanner.nextInt();

            System.out.println();

            if (option == 1) {

                permissions = addPermission(permissions, READ);
                System.out.println("READ added.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 2) {

                permissions = addPermission(permissions, WRITE);
                System.out.println("WRITE added.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 3) {

                permissions = addPermission(permissions, DELETE);
                System.out.println("DELETE added.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 4) {

                permissions = addPermission(permissions, ADMIN);
                System.out.println("ADMIN added.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 5) {

                permissions = removePermission(permissions, READ);
                System.out.println("READ removed.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 6) {

                permissions = removePermission(permissions, WRITE);
                System.out.println("WRITE removed.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 7) {

                permissions = removePermission(permissions, DELETE);
                System.out.println("DELETE removed.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 8) {

                permissions = removePermission(permissions, ADMIN);
                System.out.println("ADMIN removed.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));
            } else if (option == 9) {

                permissions = togglePermission(permissions, DELETE);
                System.out.println("DELETE toggled.");
                System.out.println("Current permissions: " + permissions + " | binary: " + Integer.toBinaryString(permissions));

            } else if (option == 10) {

                System.out.println("Can READ? " + hasPermission(permissions, READ));
                System.out.println("Can WRITE? " + hasPermission(permissions, WRITE));
                System.out.println("Can DELETE? " + hasPermission(permissions, DELETE));
                System.out.println("Can ADMIN? " + hasPermission(permissions, ADMIN));

            } else if (option == 11) {

                printPermissions(permissions);

            } else if (option == 0) {

                System.out.println("Program closed");
                scanner.close();
                return;

            } else {
                System.out.println("Invalid option.");
            }
        }

    }
}