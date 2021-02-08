/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.graphs;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author jonat
 */
public class Graph {
    int numberOfNodes = 0;
    Hashtable<Integer, ArrayList<Integer>> adjacentList = new Hashtable<>();
    
    public void addVertex(int node) {
        this.adjacentList.put(node, new ArrayList<>());
        this.numberOfNodes++;
    }
    
    public void addEdge(int node1, int node2) {
        // undirected Graph - must connect both ways
        this.adjacentList.get(node1).add(node2);
        this.adjacentList.get(node2).add(node1);
    }
    
    // helper function to check work
    public void showConnections() {
        Object[] keys = adjacentList.keySet().toArray();
        for (Object key : keys) {
            System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
        }
    }
    
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addVertex(5);
        myGraph.addVertex(6);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 2);
        myGraph.addEdge(4, 5);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 0);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(6, 5);
        myGraph.showConnections();
    }
}
