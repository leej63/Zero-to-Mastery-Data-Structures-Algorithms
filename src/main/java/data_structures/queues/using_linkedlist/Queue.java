/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.queues.using_linkedlist;

/**
 *
 * @author jonat
 */
public class Queue {
    private Node first;
    private Node last;
    private int length;
    
    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }
    
    public String peek() {
        if(this.length == 0) return null;
        return this.first.value;
    }
    
    public Queue enqueue(String value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        this.last = newNode;
        this.length++;
        return this;
    }
    
    public Node dequeue() {
        if(this.length == 0) return null;
        if(this.first == this.last) {
            this.last = null;
        }
        Node holdingPointer = this.first;
        this.first = this.first.next;
        this.length--;
        return holdingPointer;
    }
    
    public boolean isEmpty() {
        return this.length == 0;
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Apple");
        myQueue.enqueue("Ball");
        myQueue.enqueue("Cat");
        myQueue.dequeue();
        System.out.println(myQueue.peek());
    }
}
