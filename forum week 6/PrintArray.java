import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args) {
         // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known


  // Prompt for a non-negative integer for the number of items;
  // and read the input as "int". No input validation.
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of items: ");
  numItems = in.nextInt();


  // Allocate the array
  items = new int[numItems];

  // Prompt and read the items into the "int" array, if array length > 0
  System.out.println("Enter the value of all items (separated by space) : ");   
        for (int i = 0; i < items.length; i++) {
              items[i] = in.nextInt();      
         }

  // Print array contents, need to handle first item and subsequent items differently
  String  values = "" + items[0];
  for (int i = 1; i < items.length; ++i) {
    // Print the subsequent items with a leading commas
    values = values + "," + items[i];
    }

System.out.println("The values are: [" + values + "]");

    }
}


    
