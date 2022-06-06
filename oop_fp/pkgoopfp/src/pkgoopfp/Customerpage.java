package pkgoopfp;
/**
 *
 * @author christopheralexander
 */
public class Customerpage {
    private String name;
    private String address;
    
    Customerpage() {
        name = "";
        address = "";    
    }
    
    Customerpage(String n, String a) {
        name = n;
        address = a;
        System.out.println("Object" + name + "created..");
    }
    
    //setter method - function to store a data
    public void setName(String n) {
        name = n;
    }
    
    public void setAddress(String a) {
        address = a;
    }
    
    //getter method - function to take or to read a data in class
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String ToString() {
        return name + "{"+address+"}";
    }

}
