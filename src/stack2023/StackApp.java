/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack2023;

/**
 *
 * @author EThornbury
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackInterface si = new MyStack();
        System.out.println("SYSTEM TEST:");
        System.out.println("EMPTY? " +si.isEmpty());
        System.out.println("ADDING BLOCKS: Iron, Coal, Dirt");
        si.push("Iron");
        System.out.println("ADD: "+si.add());
        si.push("Coal");
        System.out.println("ADD: "+si.add());
        si.push("Dirt");
        System.out.println("SIZE: " +si.size());
        System.out.println("ADD: "+si.add());
        System.out.println("STACK SHOWING FROM TOP TO BOTTOM: " +si.displayStack());
        System.out.println("TAKING FROM TOP OF STACK: " +si.remove());
        System.out.println("TAKING FROM TOP OF STACK: " +si.remove());
        System.out.println("TAKING FROM TOP OF STACK: " +si.remove());
        System.out.println("SIZE: " +si.size());
        
        System.out.println("ADD: "+si.add());
        
        
        
    }
    
}
