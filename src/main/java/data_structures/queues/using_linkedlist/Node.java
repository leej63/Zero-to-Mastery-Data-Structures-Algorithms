/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.queues.using_linkedlist;

import com.sun.jdi.Value;

/**
 *
 * @author jonat
 */
public class Node {
    String value;
    Node next;
    
    public Node(String value) {
        this.value = value;
        this.next = null;
    }
}
