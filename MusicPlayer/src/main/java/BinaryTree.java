
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class BinaryTree {
   static Node root;
   static ArrayList<String> inf = new ArrayList<String>();
    
    private static Node addRecursive(Node current, Song song) {
        if (current == null) {
            return new Node(song);
        }

        int compared = compareStrings((song.artist + song.code), (current.register.artist + current.register.code));
        if (compared < 0) {
            current.left = addRecursive(current.left, song);
        } else if (compared > 0) {
            current.right = addRecursive(current.right, song);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    
    public static void add(Song song) {
        root = addRecursive(root, song);
    }
    
    public static void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        inf.add(node.register.artist + "|" + node.register.code + "|" + node.register.song_name + "|" + node.register.path + "|" + node.register.transUser + "|" + node.register.creationDate + "|" + node.register.status);
        traverseInOrder(node.right);
    }
}
    
    public static int compareStrings(String s1, String s2) {
        int comparison = 0;
        int c1, c2;
        for(int i = 0; i < s1.length() && i < s2.length(); i++) {
            c1 = (int) s1.toLowerCase().charAt(i);   // See note 1
            c2 = (int) s2.toLowerCase().charAt(i);   // See note 1
            comparison = c1 - c2;   // See note 2

            if(comparison != 0)     // See note 3
                return comparison;
        }
        if(s1.length() > s2.length())    // See note 4
            return 1;
        else if (s1.length() < s2.length())
            return -1;
        else
            return 0;
    }
    
    public static Node search(Node root, String key, String artist)
{
    // Base Cases: root is null or key is present at root
    if (root==null || key.equals(root.register.code))
        return root;
    
    int compared = compareStrings((root.register.artist + root.register.code), (artist + key));
    // Key is greater than root's key
    if (compared<0)
       return search(root.right, key, artist);
 
    // Key is smaller than root's key
    return search(root.left, key, artist);
}
    
    public static String getInfoWithChildren(String key, String artist)
    {
        Node node = search(root, key, artist);
        String leftChild = "-1";
        String rightChild = "-1";
        
        if (node.left != null) {
          leftChild = node.left.register.code; 
        }
        if (node.right != null) {
            rightChild = node.right.register.code;
        }
                
        return node.register.code + "|" + leftChild + "|" + rightChild + "|" + node.register.artist + "|" + node.register.code + "|" + node.register.song_name + "|" + node.register.path + "|" + node.register.transUser + "|" + node.register.creationDate + "|" + node.register.status;
    }
}
