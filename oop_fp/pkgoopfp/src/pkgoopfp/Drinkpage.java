/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgoopfp;

/**
 *
 * @author christopheralexander
 */
//child class of Menupage.java
public class Drinkpage extends Menupage { //extends - to call the mother class and has the function from there.
    Drinkpage(String n, int p) {
        super(n,p); // super - special command to access the parent class.
    }
    
    int total;
    public void setTotal(int t) {
        total = t;
    }
    public int getTotal() {
        return total;
    }
    
}