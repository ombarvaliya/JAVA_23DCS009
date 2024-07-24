import java.util.*;

public class SEprac04 {
     public static void main(String[] args) {
            String fiction[]={ "Harry Potter", "The Hobbit", "The Lord of the Rings"};
            String[] nonFiction={"The Diary","A Brief History of Time","The Art of War"};

            int a=fiction.length;
            int b=nonFiction.length;
            int c=a+b;
            String[] books=new String[c];
            for(int i=0;i<a;i++){
                books[i]=fiction[i];
            }
            for(int i=0;i<b;i++){
                books[i+a]=nonFiction[i];
            }
            System.out.println("The books are:");
            for(int i=0;i<c;i++){
                System.out.println(books[i]);
            }
            System.out.print("\nName : OM BARVALIYA \nID : 23DCS009 ");   
     }
}
