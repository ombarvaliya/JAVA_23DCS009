public class Prac_17 {

    void print1() {
        System.out.println("This is parent class");
    }

    public static void main(String[] args) {
        Prac_17 obj1 = new Prac_17();
        Child obj2 = new Child();
        obj1.print1();
        obj2.print1();
    }
}

class Child extends Prac_17 {
    void print1() {
        System.out.println("This is child class");
    }
}