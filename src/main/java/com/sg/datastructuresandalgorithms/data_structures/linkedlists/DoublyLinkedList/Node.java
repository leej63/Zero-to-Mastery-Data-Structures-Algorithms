/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.datastructuresandalgorithms.data_structures.linkedlists.DoublyLinkedList;

/**
 *
 * @author jonat
 */
public class Node {
    int value;
    Node next;
    Node previous;
    
    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}