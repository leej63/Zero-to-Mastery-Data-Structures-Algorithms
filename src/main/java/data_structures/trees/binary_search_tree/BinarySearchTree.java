/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.trees.binary_search_tree;

/**
 *
 * @author jonat
 */
public class BinarySearchTree {
    Node root = null;
    
    public BinarySearchTree() {
        this.root = null;
    }
    
    public BinarySearchTree insert(int value) {
        Node newNode = new Node(value);
        if(this.root == null) {
            this.root = newNode;
            return this;
        } else {
            Node currentNode = this.root;
            while(true) {
                // Left
                if(value < currentNode.value) {
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        return this;
                    }
                    currentNode = currentNode.left;
                } else {
                    // Right
                    if(currentNode.right == null) {
                        currentNode.right = newNode;
                        return this;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }
    
    public Node lookup(int value) { // return Node -> false if doesnt exist
        Node currentNode = this.root;
        while(currentNode != null) {
            if(value < currentNode.value) {
                currentNode = currentNode.left;
            } else if(value > currentNode.value) {
                currentNode = currentNode.right;
            } else if(currentNode.value == value) {
                return currentNode;
            }
        }
        return null;
    }
    
    public void remove(int value) {
        if(this.root == null) {
            return;
        }
        Node currentNode = this.root;
        Node parentNode = null;
        while(currentNode != null) {
            if(value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.left;
            } else if(value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            } else if(currentNode.value == value) {
                // We have a match, get to work!
                if(currentNode.right == null) {
                // Option 1: No right child
                    if(parentNode == null) {
                        this.root = currentNode.left;
                    } else {
                        // if parent > current value, make current left child a child of parent
                        if(currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.left;
                        } else if(currentNode.value > parentNode.value) {
                            // if parent < current value, make left child a right child of parent
                            parentNode.right = currentNode.left;
                        }
                    }
                } else if(currentNode.right.left == null) { 
                // Option 2: Right child which doesnt have a left child
                    if(parentNode == null) {
                        this.root = currentNode.right;
                    } else {
                        if(currentNode.value < parentNode.value) {
                        // if parent > current, make right child of the left the parent
                            parentNode.left = currentNode.right;
                        } else if(currentNode.value > parentNode.value) {
                        // if parent < current, make right child a right child of the parent
                            parentNode.right = currentNode.right;
                        }
                    }
                } else { 
                // Option 3: Right child that has a left child
                    // find the right child's left most child
                    Node leftMost = currentNode.right.left;
                    Node leftMostParent = currentNode.right;
                    while(leftMost.left != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.left;
                    }

                    // Parent's left subtree is now leftmost's right subtree
                    leftMostParent.left = leftMost.right;
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;
                    
                    if(parentNode == null) {
                        this.root = leftMost;
                    } else {
                        if(currentNode.value < parentNode.value) {
                            parentNode.left = leftMost;
                        } else if(currentNode.value > parentNode.value) {
                            parentNode.right = leftMost;
                        }
                    }
                }
            return;
            }
        }
    }
    
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        tree.lookup(171);
        tree.lookup(20);
    }
}
