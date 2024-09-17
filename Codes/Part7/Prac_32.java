// using Thread class
class Prac_32 extends Thread {
    public void run() {
        System.out.println("Hello World");
        System.out.print("\nName : OM BARVALIYA \nID : 23DCS009 ");
    }

    public static void main(String[] args) {
        Prac_32 thread = new Prac_32();
        thread.start();
     
    }
}


// using Runnable interface
// class Prac_32 implements Runnable {
//     public void run() {
//         System.out.println("Hello World");
//         System.out.print("\nName : OM BARVALIYA \nID : 23DCS009 ");
//     }

//     public static void main(String[] args) {
//         Thread thread = new Thread(new Prac_32());
//         thread.start();
//     }
// }