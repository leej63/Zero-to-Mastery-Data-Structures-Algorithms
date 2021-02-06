package data_structures.stacks.using_array;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Stack {
    ArrayList<String> stackArray;
    
    public Stack() {
        this.stackArray = new ArrayList<>();
    }
    
    public String peek() {
        if(this.stackArray.size() == 0) {
            return null;
        } else {
            return this.stackArray.get(this.stackArray.size() - 1);
        }
    }
    
    public Stack push(String value) {
        this.stackArray.add(value);
        return this;
    }
    
    public Stack pop() {
        this.stackArray.remove(this.stackArray.size() - 1);
        return this;
    }
    
    public boolean isEmpty() {
        return this.stackArray.size() == 0;
    }
    
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
