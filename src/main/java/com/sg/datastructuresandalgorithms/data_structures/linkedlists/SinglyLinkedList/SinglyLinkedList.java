/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.datastructuresandalgorithms.data_structures.linkedlists.SinglyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author jonat
 */
public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    
    public SinglyLinkedList(int value) {
        this.head = new Node(value);
        this.tail = head;
        length = 1;
    }

    public SinglyLinkedList append(int value) {
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        return this;
    }
    
    public SinglyLinkedList prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        return this;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int[] printList() {
        int[] myList = new int[this.length];
        Node current = this.head;
        int i = 0;
        while(current != null) {
            myList[i] = current.value;
            current = current.next;
            i++;
        }
        return myList;
    }
    
    public void insert(int index, int value) {
        if(index < 0 || index > this.length) {
            System.err.println("Index Out of Bounds for Length " + this.length);
        } else if(index == 0) {
            prepend(value);
        } else if(index == this.length) {
            append(value);
        } else {
            Node current = this.head;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
            this.length++;
        }
    }
   
    public void remove(int index) {
        if(index < 0 || index > length) {
            System.err.println("Index Out of Bounds for Length " + this.length);
        } else if(index == 0) {
            this.head = this.head.next;
            this.length--;
        } else {
            Node current = head;
            int i;
            for(i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            this.length--;
            if(i == this.length - 1) {
                this.tail = current;
            }
        }
    }
    
    public SinglyLinkedList reverse(SinglyLinkedList linkedList) {
        if(linkedList.length == 1) return this;
        
        SinglyLinkedList newList = new SinglyLinkedList(linkedList.head.value);
        Node current = linkedList.head;
        
        while(current.next != null) {
            current = current.next;
            Node newNode = new Node(current.value);
            newNode.next = newList.head;
            newList.head = newNode;
            newList.length++;
        }
        return newList;
    }
    
    public SinglyLinkedList reverse2() {
        if(this.length == 1) return this;
        
        Node first = this.head;
        this.tail = this.head;
        Node second = first.next;
        while(second != null) {
            Node temp = second.next; // "third" node
            second.next = first;
            first = second;
            second = temp;
        }
        this.head.next = null;
        this.head = first;
        return this;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(10);
        // append
        myLinkedList.append(12);
        myLinkedList.append(16);
        // prepend
        myLinkedList.prepend(20);
        myLinkedList.prepend(50);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        // insert
        myLinkedList.insert(2, 25);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        // remove
        myLinkedList.remove(4);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));        
        // reserve
        SinglyLinkedList linkedList2 = myLinkedList.reverse(myLinkedList);
        System.out.println("reverse linkedList " + Arrays.toString(linkedList2.printList()));
        
        System.out.println("reverse 2 linkedList " + Arrays.toString(myLinkedList.printList()));
        System.out.println("reverse 2 head: " + myLinkedList.head.value);
        System.out.println("reverse 2 tail: " + myLinkedList.tail.value);
    }
}
