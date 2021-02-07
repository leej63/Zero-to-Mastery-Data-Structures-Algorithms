/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.trees;

/**
 *
 * @author jonat
 */
public class Node {
    int value;
    Node left;
    Node right;
    
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
