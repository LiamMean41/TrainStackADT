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
        System.out.println("Add blocks or items called: 1st, 2nd, 3rd");
        si.push("1st");
        System.out.println("Peek: "+si.peek());
        si.push("2nd");
        System.out.println("Peek: "+si.peek());
        si.push("3rd");
        System.out.println("Size: " +si.size());
        System.out.println("Peek: "+si.peek());
        System.out.println("Stack now from top to bottom: " +si.displayStack());
        System.out.println("Take top brick off stack: " +si.pop());
        System.out.println("Take top brick off stack: " +si.pop());
        System.out.println("Take top brick off stack: " +si.pop());
        System.out.println("Size: " +si.size());
        
        System.out.println("Peek: "+si.peek());
        
    }
    
}
