/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Node {
    Song register;   
    Node left;
    Node right;

    Node(Song register) {
        this.register = register;
        right = null;
        left = null;
    }
}
