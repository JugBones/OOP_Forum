package pkgoopfp;
/**
 *
 * @author christopheralexander
 */
//child class of Menupage.java
public class Foodpage extends Menupage { //extends - to call the mother class and has the function from there.
    Foodpage(String n, int p) {
        super(n,p); //special command to access the parent class.
    }
    
    int total;
    public void setTotal(int t) {
        total = t;
    }
    public int getTotal() {
        return total;
    }
    
}
