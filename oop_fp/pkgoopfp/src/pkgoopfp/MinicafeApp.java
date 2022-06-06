/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgoopfp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author christopheralexander
 */
public class MinicafeApp {
    public static void main(String[] args)throws Exception {
        String usr, psw, my_user, my_password;
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        //instance of class 
        Loginpage user1 = new Loginpage();
        System.out.println("===============LOGIN===============");
        System.out.println("  Please enter your username = "); my_user = br.readLine(); //Gets input from user and returns a String value. 
                                                                                        //The value will be stored in the variable name that has been declared, 
                                                                                        //which will be used in the final statement to display the value of the variable name
        System.out.println("  Please enter your password = "); my_password = br.readLine(); //Same but this time the value will be stored in variable password.
        System.out.println("===================================");
        
        if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) 
            {
          System.out.println("===================================");
          System.out.println("        ** Login Success **        ");
          System.out.println("          Welcome " + user1.getName());
          System.out.println("===================================");
            } 
            else 
            {
          System.out.println("===================================");
          System.out.println("        ** Login Failed **        ");
          System.out.println("===================================");
          do{
            System.out.println("===============LOGIN===============");
            System.out.println("  Please enter your username = "); my_user = br.readLine();
            System.out.println("  Please enter your password = "); my_password = br.readLine();
            System.out.println("===================================");
          } while(!my_user.equals(user1.getUsername()) && !my_password.equals(user1.getPassword())); 
            }
        
        Scanner sc = new Scanner (System.in);
        int choose = 0, choose3 = 0, choose4 = 0, choose5 = 0, choose6 = 0;
        Customerpage cus = new Customerpage();
        int totalmenu = 0;
        
        //data of food menu
        Foodpage Foodmenu[] = new Foodpage[10];
        Foodmenu[0] = new Foodpage("Indomie",6000);
        Foodmenu[1] = new Foodpage("Pisang_Bakar",6000);
        Foodmenu[2] = new Foodpage("Roti_Bakar",9000);
        Foodmenu[3] = new Foodpage("Gorengan",1000);    
        //data of drink menu        
        Drinkpage Drinkmenu[] = new Drinkpage[10];
        Drinkmenu[0] = new Drinkpage("Nutrisari",3000);
        Drinkmenu[1] = new Drinkpage("Pop_Ice",3000);
        Drinkmenu[2] = new Drinkpage("Teh",2000);
        Drinkmenu[3] = new Drinkpage("Soda",4000);
        
        do {
            System.out.println("\nMini Cafe App"); //main menu
            System.out.println("1.Management menu");
            System.out.println("2.Transaction menu");
            System.out.println("3.Close");
            System.out.println("Choose = ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                    int choose2=0;
                    do {
                        System.out.println("");//Management menu
                        System.out.println("    1.Add Menu");
                        System.out.println("    2.Change Menu");
                        System.out.println("    3.Delete Menu");
                        System.out.println("    4.Show Menu");
                        System.out.println("    5.Finish");
                        System.out.print("  Choose = ");
                        choose2=sc.nextInt();
                        switch(choose2) {
                            case 1:
                                do {
                                    System.out.println("Add Menu ");
                                    System.out.println("1.Food");
                                    System.out.println("2.Drink");
                                    System.out.println("3.Finish");
                                    System.out.println("Choose = ");
                                    choose3=sc.nextInt();
                                    switch(choose3) {
                                        case 1:
                                            System.out.println("    Name = ");
                                            String n = sc.next();
                                            System.out.println("    Price = ");
                                            int p = sc.nextInt();
                                            System.out.println("Add " + n + " with total " + p + "?");
                                            System.out.println("1. Add");
                                            System.out.println("2. Cancel");
                                            System.out.println("Choose = ");
                                            choose3=sc.nextInt();
                                            Foodmenu[totalmenu] = new Foodpage(n,p);
                                            System.out.println("Sucessfully adding menu..");
                                            System.out.println("");
                                            totalmenu++;
                                            break;
                                        case 2:
                                            System.out.println("    Name = ");
                                            String nd = sc.next();
                                            System.out.println("    Price = ");
                                            int pd = sc.nextInt();
                                            System.out.println("Add " + nd + " with total " + pd + "?");
                                            System.out.println("1. Add");
                                            System.out.println("2. Cancel");
                                            System.out.println("Choose = ");
                                            choose3=sc.nextInt();
                                            Drinkmenu[totalmenu] = new Drinkpage(nd,pd);
                                            System.out.println("Sucessfully adding menu..");
                                            System.out.println("");                                            
                                            break;
                                        case 3:
                                            System.out.println("Go back to Management menu..");
                                            break;
                                    }
                                } while (choose3!=3);
                                break;
                            case 2:
                                do {
                                    System.out.println("Change Menu");
                                    System.out.println("1.Food");
                                    System.out.println("2.Drink");
                                    System.out.println("3.Finish");
                                    System.out.println("Choose = ");
                                    choose4=sc.nextInt();
                                    switch(choose4) {
                                        case 1:
                                            System.out.println("Enter Food name\t = ");
                                            String change = sc.next();
                                            System.out.println("Change the price to = ");
                                            int prices = sc.nextInt();
                                            System.out.println("Change " + change + " to " + prices + "?");
                                            System.out.println("1.Change");
                                            System.out.println("2.Cancel");
                                            System.out.println("Choose = ");
                                            choose4=sc.nextInt();
                                            if (choose4==1) {
                                                for (int i=0; i<Foodmenu.length; i++) {
                                                    if (Foodmenu[i] != null && change.equalsIgnoreCase(Foodmenu[i].getName())) {
                                                        Foodmenu[i].setPrice(prices);
                                                        System.out.println("\tSucessfully change..");
                                                    }
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Enter Drink name\t = ");
                                            String change2 = sc.next();
                                            System.out.println("Change the price to = ");
                                            int price2 = sc.nextInt();
                                            System.out.println("Change " + change2 + " to " + price2 + "?");
                                            System.out.println("1.Change");
                                            System.out.println("2.Cancel");
                                            System.out.println("Choose = ");
                                            choose4=sc.nextInt();
                                            if (choose4==1) {
                                                for (int i=0; i<Drinkmenu.length; i++) {
                                                    if (Drinkmenu[i] != null && change2.equalsIgnoreCase(Drinkmenu[i].getName())) {
                                                        Drinkmenu[i].setPrice(price2);
                                                        System.out.println("\tSucessfully change..");
                                                    }
                                                }
                                            }
                                            System.out.println(""); 
                                            break;
                                        case 3:
                                            System.out.println("Go back to Management menu..");
                                           break;
                                      }                                                          
                                    } while(choose4!=3);
                                    break;
                            case 3:
                                do {
                                    System.out.println("Delete menu");
                                    System.out.println("1.Delete Food");
                                    System.out.println("2.Delete Drink");
                                    System.out.println("Finish");
                                    System.out.println("Choose = ");
                                    choose5=sc.nextInt();
                                    switch(choose5) {
                                        case 1:
                                            int amount_Food=10;
                                            if (amount_Food <= 0) {
                                                System.out.println("Food is empty!");
                                            }else {
                                                System.out.println("What food u want to delete = ");
                                                String fd = sc.next();
                                                System.out.println("Are you sure want to delete " + fd + "?");
                                                System.out.println("1.Delete");
                                                System.out.println("2.Cancel");
                                                System.out.println("Choose = ");
                                                choose5=sc.nextInt();
                                                boolean available = false;
                                                for (int i=0; i<amount_Food; i++) {
                                                    if (fd.equalsIgnoreCase(Foodmenu[i].getName())) {
                                                        available = true;
                                                        Foodmenu[i] = null;
                                                        //moving array
                                                        int p=i;
                                                        for (int j=0; j<amount_Food; j++) {
                                                            if (j == amount_Food-1) {
                                                                Foodmenu[j]=null;
                                                            }else {
                                                                Foodmenu[j]=Foodmenu[j+1];
                                                            }
                                                        }
                                                        amount_Food--;
                                                        System.out.println("Sucessfully Deleting..");
                                                        break;
                                                    }
                                                }
                                                if (available == false) {
                                                    System.out.println("Food is not available");
                                                }
                                            }
                                            break;
                                        case 2:
                                            int amount_Drink=10;
                                            if (amount_Drink <= 0) {
                                                System.out.println("Drink is empty!");
                                            }else {
                                                System.out.println("What drink u want to delete = ");
                                                String fd = sc.next();
                                                System.out.println("Are you sure want to delete " + fd + "?");
                                                System.out.println("1.Delete");
                                                System.out.println("2.Cancel");
                                                System.out.println("Choose = ");
                                                choose5=sc.nextInt();
                                                boolean available = false;
                                                for (int i=0; i<amount_Drink; i++) {
                                                    if (fd.equalsIgnoreCase(Foodmenu[i].getName())) {
                                                        available = true;
                                                        Drinkmenu[i] = null;
                                                        //moving array
                                                        int p=i;
                                                        for (int j=0; j<amount_Drink; j++) {
                                                            if (j == amount_Drink-1) {
                                                                Drinkmenu[j]=null;
                                                            }else {
                                                                Drinkmenu[j]=Drinkmenu[j+1];
                                                            }
                                                        }
                                                        amount_Drink--;
                                                        System.out.println("Sucessfully Deleting..");
                                                        break;
                                                    }
                                                }
                                                if (available == false) {
                                                    System.out.println("Food is not available");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("Go back to Management menu..");
                                            break;
                                            
                                            
                                    }
                                } while(choose5!=3);
                                
                                break;
                            case 4:
                                do {
                                    System.out.println("List of Menu");
                                    System.out.println("1.Food");
                                    System.out.println("2.Drink");
                                    System.out.println("3.Finish");
                                    System.out.println("Choose = ");
                                    choose6=sc.nextInt();
                                    switch(choose6) {
                                        case 1:
                                            System.out.println("List of Foods");
                                            for (int i=0; i<4; i++) {
                                                System.out.println((i+1) + "." + Foodmenu[i].ToString());
                                            }                                            
                                            break;
                                        case 2:
                                            System.out.println("List of Drinks");
                                            for (int i=0; i<4; i++) {
                                                System.out.println((i+1) + "." + Drinkmenu[i].ToString());
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Go back to Management menu");
                                            break;
                                    }
                                }while(choose6!=3);
                                
                                break;
                            case 5:
                                System.out.println("Back to the Main Menu");
                                break;
                        }
                    } while (choose2!=5);
                    break;
                case 2:
                    int choose7=0;
                    System.out.println("");
                    Transactionpage tr = new Transactionpage();
                    tr.addCustomer(cus);
                    do {
                        System.out.println(""); //Transaction menu
                        System.out.println("Transcaction menu");
                        System.out.println("1.Add Customer");
                        System.out.println("2.Add menu");
                        System.out.println("3.Delete menu");
                        System.out.println("4.Show menu");
                        System.out.println("5.Back");
                        System.out.println("Choose = ");
                        choose7 = sc.nextInt();
                        switch(choose7) {
                            case 1:
                                System.out.println("  Name = ");
                                String nm=sc.next();
                                cus.setName(nm);
                                System.out.println("  Address = ");
                                String adr=sc.next();
                                cus.setAddress(adr);
                                break;
                            case 2:
                                int choose8=0;
                                do {
                                    System.out.println("     Add Menu    ");
                                    System.out.println("     1.Food");
                                    System.out.println("     2.Drink");
                                    System.out.println("     3.Back");
                                    System.out.println("    Choose = ");
                                    choose8 = sc.nextInt();  
                                    switch(choose8) {
                                        case 1:
                                            System.out.println("Food = ");
                                            String mn = sc.next();
                                            System.out.println("Portion = ");
                                            int por=sc.nextInt();
                                            
                                            boolean available=false;
                                            for (int i=0; i<Foodmenu.length; i++) {
                                                if (mn.equalsIgnoreCase(Foodmenu[i].getName())) {
                                                    Foodmenu[i].setTotal(por);
                                                    available = true;
                                                    tr.addMenu(Foodmenu[i]);
                                                    break;
                                                }
                                            }
                                            if (available == false) {
                                                System.out.println("Menu doesn't exist!!");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Drink = ");
                                            mn = sc.next();
                                            System.out.println("Portion = ");
                                            por=sc.nextInt();                                         
                                            available=false;
                                            for (int i=0; i<Drinkmenu.length; i++) {
                                                if (mn.equalsIgnoreCase(Drinkmenu[i].getName())) {
                                                    Drinkmenu[i].setTotal(por);
                                                    available = true;
                                                    tr.addMenu(Drinkmenu[i]);
                                                    break;
                                                }
                                            }
                                            if (available == false) {
                                                System.out.println("Menu doesn't exist!!");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Go back to Transaction menu..");
                                            break;
                                    }
                                } while(choose8!=3);
                                break;
                            case 3:
                                System.out.println("Are you sure want to delete menu ?");
                                System.out.println("1. Delete");
                                System.out.println("2. Cancel");
                                System.out.println("Choose = ");
                                choose7 = sc.nextInt();
                                tr.deleteMenu();
                                break;
                            case 4:
                                tr.showTransaction();
                                break;
                            case 5:
                                System.out.println("Go back to the Main Menu..");
                                break;
                        }
                    }while(choose7!=5);
                    break;
                case 3:
                    System.out.println("Thankyou for visiting our Cafe, GBU!");
                    break;
                
            }
        }while (choose!=3);
               
       
    }
}
