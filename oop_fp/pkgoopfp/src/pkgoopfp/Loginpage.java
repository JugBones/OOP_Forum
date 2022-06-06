package pkgoopfp;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author christopheralexander
 */
public class Loginpage {
    //declare variable
    private String username,password,name;
    private Scanner sc = new Scanner(System.in);
    
    //constructor
    public Loginpage() {
        username = "admin";
        password = "112233";
        name = "Alexander";
    }
    
    public Loginpage(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }
    
    
    //setter method - function to store a data
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    //getter method - function to take or to read a data in class
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }
}
