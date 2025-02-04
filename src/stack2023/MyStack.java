/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack2023;

import java.util.ArrayList;

/**
 *
 * @author EThornbury
 */
public class MyStack implements StackInterface{
    ArrayList<String> theStack;
    
    public MyStack() {
        theStack = new ArrayList<>();        
    }
   
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
        
//        if(theStack.size() > 0){
//            return false;
//        }else
//            return true;
        
    }
    
    /*
    *push method uses the arraylist add method at the index of zero as we will consider the top of the stack is at the zero index
    *@param String object
    */
    public void push(Object newItem){
        theStack.add(0, (String)newItem); //need to downcast our Object to a String
    }
    
    /*
    *remove or pop the object off the top of the stack, the zero index
    *@return String object or null
    */
    @Override
    public Object pop(){
        if (!(theStack.isEmpty())){
            return theStack.remove(0);
        }else{
            return null;
        }
    }
    
    /*
    *remove or pop the object off the top of the stack, the zero index
    *@return String object or null
    */
    @Override
    public Object peek() {
      if (theStack.isEmpty()) {
          System.out.println("Empty stack");
          return null;
      } else {    
          return theStack.get(0);
      }
    }
  

    
    /*
    *get the size of our arraylist/blockStack
    *@return integer value of size
    */
    @Override
    public int size(){
        return theStack.size();
    }

    /*
    *@return String of items retrieved from the arraylist
    */
    @Override
    public String displayStack(){
        //using a for loop
       String str = new String(); 
       //String str = ""; will also work and is more familiar
       if(theStack.isEmpty()){
           str = str.concat("EMPTY!");
       }else{
           for (int i = 0; i<theStack.size(); i++){
               str = str.concat(theStack.get(i));
               str = str.concat(" ; ");
           }
       }
       return str;
    }

    
}
