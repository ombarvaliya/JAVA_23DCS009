import java.util.*;

    public class Prac_08 {
        public static int array_count9(int[] nums) {
         
            String arrayAsString = Arrays.toString(nums);
            
            int count = arrayAsString.length() - arrayAsString.replace("9", "").length();
            return count;
        }
    
        public static void main(String[] args) {
            System.out.println(array_count9(new int[]{1, 2, 9})); 
            System.out.println(array_count9(new int[]{1, 9, 9})); 
            System.out.println(array_count9(new int[]{1, 9, 9, 3, 9}));
            System.out.print("\nName : OM BARVALIYA \nID : 23DCS009 "); 
        }
    }
