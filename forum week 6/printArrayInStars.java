import java.util.Scanner;

public class printArrayInStars{
    public static void main(String[] args) {
        // Declare the scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = in.nextInt();
   
        // Allocate the array
        int[] items = new int[numItems];
      
        // Ask the user to input the value  
        System.out.println("Enter the value of all items (separated by space) : ");   
        for (int i = 0; i < items.length; i++) {
              items[i] = in.nextInt();      
         }

      // Print array in number of stars using a nested-loop
        for (int i=0; i<items.length; i++) {  // row
            System.out.print(i + ": ");
            // Print value as the number of stars
            for (int j = 1; j <= items[i]; j++) {  // column
               System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
         }
    }
}