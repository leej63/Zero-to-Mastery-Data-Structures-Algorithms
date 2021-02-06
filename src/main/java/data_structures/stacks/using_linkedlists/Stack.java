/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.stacks.using_linkedlists;

/**
 *
 * @author jonat
 */
public class Stack {
    private Node top;
    private Node bottom;
    private int length;
    
    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }
    
    public String peek() {
        if(this.length > 0) {
            return this.top.value;
        }
        return null;
    }
    
    public Stack push(String value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            Node temp = this.top;
            this.top = newNode;
            this.top.next = temp;
        }
        this.length++;
        return this;
    }
    
    public Node pop() {
        if(this.top == null) return null;
        
        if(this.top == this.bottom) { // equivalent to 'this.length == 0'
            this.bottom = null;
        }
        Node holdingPointer = this.top;
        this.top = this.top.next;
        this.length--;
        
        return holdingPointer;
    }
    
    public boolean isEmpty() {
        return this.length == 0;
    }
    
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.isEmpty());
    }
}
