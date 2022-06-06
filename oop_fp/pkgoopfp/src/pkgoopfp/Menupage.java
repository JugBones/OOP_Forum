package pkgoopfp;
/**
 *
 * @author christopheralexander
 */
// Mother class of Foodpage and Drinkpage
public class Menupage {
    String name;
    private int price;
    int total;
    
    Menupage() {
        name = ""; price = 0;
    }
    
    Menupage(String n, int p) {
        name = n; price = p;
    }
    
    //setter method - function to store a data
    public void setName(String n) {
        name = n;
    }
    
    public void setPrice(int p) {
        price = p;
    }
    
    public void setTotal(int t) {
        total = t;
    }
    
    
    //getter method - function to take or to read a data in class
    public String getName() {
        return name;
    }
    
    public int getTotal() {
        return total;
    }
    
    public int getPrice() {
        return price;
    }
    
    //ToString method - print a text from a class
    public String ToString() {
        return name + "{"+price+"}";
    }
    
}
