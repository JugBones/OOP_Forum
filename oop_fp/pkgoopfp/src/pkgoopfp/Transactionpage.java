package pkgoopfp;
import java.util.Scanner;
/**
 *
 * @author christopheralexander
 */
public class Transactionpage {
    //declare variables
    private Customerpage customer;
    private Menupage menu[];
    private int amfood, maxfood;
    private Scanner sc = new Scanner(System.in);
    Transactionpage() {
        maxfood = 5;
        menu = new Menupage[maxfood];
        amfood = 0;
    }
    
    public void addCustomer(Customerpage c) {
        customer = c;
        System.out.println("Successfullly added customer..");
    }
    
    public void addMenu(Menupage m) {
        if(amfood>=maxfood) {
            System.out.println("Sorry, capacity is full!");
        } else{
            menu[amfood] = m;
            System.out.println("Menu has been added..");
            amfood++;
        }
    }
    
    public void deleteMenu() {
        if(amfood<0) {
            System.out.println("Menu is empty!");
        } else {
            System.out.print("remove menu = ");
            String mn = sc.next();
            boolean available = false;
            for (int i = 0; i<amfood; i++) {
                if(mn.equalsIgnoreCase(menu[i].getName())) {
                    available = true;
                    menu[i] = null;
                    //move element in array
                    int c=i;
                    for (int j = c; j<amfood; j++) {
                        if(j==amfood-1) {
                            menu[j]=null;
                        } else {
                            menu[j] = menu[j+1];
                        }
                    }
                    amfood--;
                    System.out.println("Successfully deleting..");
                    break;
                }
            }
            if (available == false) {
                System.out.println("Food is empty..");
            }
        }
    }
    public void showTransaction() {
        System.out.println("Data Transaction");
        System.out.println(customer.ToString());
        int p[]=new int[5];
        int t[]=new int[5];
        int subtotal[]=new int[5];
        int totalbill = 0;
            for (int i=0; i<amfood; i++) {
                p[amfood] = (int)menu[i].getPrice();
                t[amfood] = menu[i].getTotal();
                subtotal[amfood] = p[amfood]*t[amfood];
                System.out.println((i+1)+"."+menu[i].ToString()+"\t"+"X"+t[amfood]+"\t Rp. "+subtotal[amfood]);
                totalbill = totalbill + subtotal[amfood];
            }
            System.out.println("==============================================");
            System.out.println("Total bill is : " + totalbill);
            
        System.out.println("");
    }
    
}
