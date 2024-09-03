public class Prac_25 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.print("\nName : OM BARVALIYA \nID : 23DCS009 ");

    }
}