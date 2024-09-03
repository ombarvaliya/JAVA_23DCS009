import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter phone number: ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextDouble();
        printsalary();
    }

    public void printsalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String designation;

    void getdata() {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the designation of the employee: ");
        designation = sc.nextLine();
    }
}

class Manager extends Member {
    String department;

    void getdata() {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department of the manager: ");
        department = sc.nextLine();
    }
}
public class Prac_18{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata();
        emp.printsalary();

        Manager mgr = new Manager();
        mgr.getdata();
        mgr.printsalary();
    }
}