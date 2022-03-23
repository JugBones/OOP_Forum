import java.util.Scanner;
public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student: ");
        int n = sc.nextInt();
        int[] grades = new int[n];
        double sum = 0;
        int max = 0, min = 0;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Grade of Student " + (i+1) + ":");
            grades[i] = sc.nextInt();
            sum = sum + grades[i];
            if(grades[i]>max) max=grades[i];
            if(i==0) min=grades[i];
            if(grades[i]<min) min=grades[i];
        }

        System.out.println("Average of Grades = " + (sum/n));
        System.out.println("Maximum Grade is = " + max);
        System.out.println("Maximum Grade is = " + min);


    }
}