import java.util.Scanner;

public class Statistical {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in); //scanner function method

        //Ask user for the input (x1,x2,x3)
        System.out.print("Input your first number: ");
        double x1 = input.nextDouble();

        System.out.print("Input your second number: ");
        double x2 = input.nextDouble();

        System.out.print("Input your third number: ");
        double x3 = input.nextDouble();

        //Displaying the formula
        double mean =((x1+x2+x3) / 3);

        double variance =(((x1 - mean)*(x1 - mean)) + ((x2-mean)*(x2-mean)) + ((x3 - mean)*(x3 - mean)))/ 3; 
        
        double deviation=Math.sqrt(variance);

        //Print the results
        System.out.println("The mean of this data is " + mean);
        System.out.println("The Variance of the data is " + variance);
        System.out.println("The standard deviation is "+deviation);
    }
}