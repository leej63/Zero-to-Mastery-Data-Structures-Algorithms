/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.datastructuresandalgorithms.data_structures.linkedlists.DoublyLinkedList;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    
    public DoublyLinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }
    
    public DoublyLinkedList append(int value) {
        Node newNode = new Node(value);
        newNode.previous = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        length++;
        return this;
    }
    
    public DoublyLinkedList prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head.previous = newNode;
        this.head = newNode;
        length++;
        return this;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int[] printList() {
        int[] myList = new int[this.length];
        Node currNode = this.head;
        int i = 0;
        while(currNode != null) {
            myList[i] = currNode.value;
            currNode = currNode.next;
            i++;
        }
        return myList;
    }
    
    public DoublyLinkedList insert(int index, int value) {
        if(index < 0 || index > this.length) {
            System.err.println("Index Out of Bounds for Length " + this.length);
        } else if(index == 0) {
            prepend(value);
        } else if(index == this.length) {
            append(value);
        } else {
            Node currNode = this.head;
            for(int i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = currNode.next;
            newNode.previous = currNode;
            currNode.next.previous = newNode;
            currNode.next = newNode;
            this.length++;            
        }
        return this;
    }
    
    public DoublyLinkedList remove(int index) {
        if(index < 0 || index > this.length) {
            System.err.println("Index Out of Bounds for Length " + this.length);
        } else if (index == 0) {
            this.head = this.head.next;
            this.head.previous = null;
            this.length--;
        } else {
            Node currNode = this.head;
            int i;
            for(i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
            this.length--;
            if(i == this.length - 1) {
                this.tail = currNode;
            } else {
                currNode.next.previous = currNode;
            }
        }
        return this;
    }
    
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.append(4);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.prepend(1);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        myDoublyLinkedList.remove(0);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        myDoublyLinkedList.insert(2, 200);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
        System.out.println("length: " + myDoublyLinkedList.getLength());
        
        System.out.println("head value: " + myDoublyLinkedList.head.value);
        System.out.println("head.previous: " + myDoublyLinkedList.head.previous);
        
        System.out.println("tail value: " + myDoublyLinkedList.tail.value);
        System.out.println("tail.next: " + myDoublyLinkedList.tail.next);
        System.out.println("tail.previous: " + myDoublyLinkedList.tail.previous.value);
    }
}
