import java.util.Scanner;

public class LabSystem {

    static Scanner sc = new Scanner(System.in);

    static String[] hemaTests = {"CBC", "ESR", "Hemoglobin"};
    static String[] chemTests = {"FBS", "HbA1c", "Lipid Profile"};
    static String[] rapidTests = {"Pregnancy Test"};

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== LAB SYSTEM =====");
            System.out.println("1. Hematology");
            System.out.println("2. Chemistry");
            System.out.println("3. Rapid Test");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> doHema();
                case 2 -> doChem();
                case 3 -> doRapid();
                case 4 -> System.out.println("Program closed.");
                default -> System.out.println("Invalid input.");
            }

        } while (choice != 4);
    }

    // ---------------- HEMATOLOGY ----------------

    static void doHema() {
        int i = chooseTest(hemaTests);
        if (i == -1) return;

        System.out.print("Record ID: ");
        int rid = sc.nextInt();

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Result: ");
        String result = sc.nextLine();

        System.out.print("Remarks: ");
        String remarks = sc.nextLine();

        System.out.print("Blood type checked (true/false): ");
        boolean checked = sc.nextBoolean();
        sc.nextLine();

        HematologyTest t = new HematologyTest(
                rid, pid, hemaTests[i], result, remarks, checked
        );

        System.out.println("\nOUTPUT:");
        System.out.println(t);
    }

    // CHEMISTRY

    static void doChem() {
        int i = chooseTest(chemTests);
        if (i == -1) return;

        System.out.print("Record ID: ");
        int rid = sc.nextInt();

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Result: ");
        String result = sc.nextLine();

        System.out.print("Remarks: ");
        String remarks = sc.nextLine();

        System.out.print("Fasting required (true/false): ");
        boolean fasting = sc.nextBoolean();
        sc.nextLine();

        ChemistryTest t = new ChemistryTest(
                rid, pid, chemTests[i], result, remarks, fasting
        );

        System.out.println("\nOUTPUT:");
        System.out.println(t);
    }

    // RAPID

    static void doRapid() {
        int i = chooseTest(rapidTests);
        if (i == -1) return;

        System.out.print("Record ID: ");
        int rid = sc.nextInt();

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Result: ");
        String result = sc.nextLine();

        System.out.print("Remarks: ");
        String remarks = sc.nextLine();

        System.out.print("Kit type: ");
        String kit = sc.nextLine();

        RapidTest t = new RapidTest(rid, pid, rapidTests[i], result, remarks, kit);

        System.out.println("\nOUTPUT:");
        System.out.println(t);
    }

    // HELPER 

    static int chooseTest(String[] arr) {
        System.out.println("\nSelect test:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }

        System.out.print("Choice: ");
        int c = sc.nextInt();
        sc.nextLine();

        if (c < 1 || c > arr.length) {
            System.out.println("Invalid.");
            return -1;
        }

        return c - 1;
    }
}