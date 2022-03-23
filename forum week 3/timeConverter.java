import java.util.*;

 public class timeConverter {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");

        // formula to convert the second into hour,minute,second
		int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;

        //print the result (convert the second into hour,minute,second)
        System.out.print( "the result will be = " + p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
    }    
 }