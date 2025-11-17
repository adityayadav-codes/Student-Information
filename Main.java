import java.util.Scanner;

public class Main {

    int idNo;
    String name;
    int phNo;
    String add;

    // constructor
    Main(int idNo, String name, double phNo2, String add) {
        this.idNo = idNo;
        this.name = name;
        this.phNo = (int) phNo2;
        this.add = add;
    }

    // for console
    void display() {
        System.out.println("Student ID        : " + idNo);
        System.out.println("Student Name      : " + name);
        System.out.println("Student Phone No. : " + phNo);
        System.out.println("Student Address   : " + add);
        System.out.println("==============================================");
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        sc.nextLine();

        Main[] students = new Main[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.println("Enter Student ID no.: ");
            int idNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Student Ph. No: ");
            double phNo = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Student Address: ");
            String add = sc.nextLine();

            students[i] = new Main(idNo, name, phNo, add);
        }

        System.out.println("\n--- Student Details ---");
        for (Main s : students) {
            s.display();
        }

        sc.close();
    }
}
