/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stack2023;

/**
 * minimal interface for a stack 
 * @author EThornbury
 */
public interface StackInterface{
    //essential methods
    public void push(Object newItem);
    public Object pop();    
    public Object peek();
    
    public boolean isEmpty();
    public int size();
    public String displayStack();
}
