/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.trees.trie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class Node {
    Map<Character, Node> children = new HashMap<>();
    boolean isWord = false;
}
