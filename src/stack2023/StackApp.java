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
        System.out.println("Empty? " +si.isEmpty());
        System.out.println("Add blocks or items called: Iron, Coal, Dirt");
        si.push("Iron");
        System.out.println("Peek: "+si.add());
        si.push("Coal");
        System.out.println("Peek: "+si.add());
        si.push("Dirt");
        System.out.println("Size: " +si.size());
        System.out.println("Peek: "+si.add());
        System.out.println("Stack now from top to bottom: " +si.displayStack());
        System.out.println("Take top brick off stack: " +si.remove());
        System.out.println("Take top brick off stack: " +si.remove());
        System.out.println("Take top brick off stack: " +si.remove());
        System.out.println("Size: " +si.size());
        
        System.out.println("Peek: "+si.add());
        
    }
    
}
