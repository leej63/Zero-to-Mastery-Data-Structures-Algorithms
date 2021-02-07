/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.trees.priority_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jonat
 */
public class PriorityQueue {
    private final List<Node> queueArray = new ArrayList<>();
    
//    public PriorityQueue(List<Node> queueArray) {
//        this.queueArray = new ArrayList<>();
//    }
    
    public void enqueue(String value, int priority) {
        Node newNode = new Node(value, priority);
        boolean contain = false;
        
        for(int i = 0; i < this.queueArray.size(); i++) {
            if(this.queueArray.get(i).priority > newNode.priority) {
                this.queueArray.add(i, newNode);
                contain = true;
                break;
            }
        }
        if(!contain) {
            this.queueArray.add(newNode);
        }
    }
    
    public String dequeue() {
        if(this.queueArray.isEmpty()) {
            return "empty array";
        }
        Node toRemove = this.queueArray.get(0);
        this.queueArray.remove(0);
        return toRemove.value;
    }
    
    public Node front() {
        if(this.queueArray.isEmpty()) {
            return null;
        }
        return this.queueArray.get(0);
    }
    
    public Node rear() {
        if(this.queueArray.isEmpty()) {
            return null;
        }
        return this.queueArray.get(this.queueArray.size() - 1);
    }
    
    public boolean isEmpty() {
        return queueArray.isEmpty();
    }
    
    public String[] printQueue() {
        String[] array = new String[this.queueArray.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = this.queueArray.get(i).value;
        }
        return array;
    }
    
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue("Jonathan", 3);
        queue.enqueue("Ben", 1);
        queue.enqueue("Ryan", 2);
        queue.enqueue("Roy", 5);
        queue.enqueue("Frank", 4);
        System.out.println(Arrays.toString(queue.printQueue()));
        System.out.println(queue.dequeue());
        System.out.println(Arrays.toString(queue.printQueue()));
        System.out.println(queue.front().value);
        System.out.println(queue.rear().value);
        System.out.println(queue.isEmpty());
    }
}
