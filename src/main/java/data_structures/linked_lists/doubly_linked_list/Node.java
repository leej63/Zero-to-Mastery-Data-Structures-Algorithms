/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.linked_lists.doubly_linked_list;

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
