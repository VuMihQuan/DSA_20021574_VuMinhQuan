import java.util.*;
import java.io.*;
public class Solution {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    boolean checkBST(Node root) {
        return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    private boolean checkBSTUtil(Node root, int minValue, int maxValue) {
        if (root == null) return true;
        return (
                root.data > minValue &&
                        root.data < maxValue &&
                        checkBSTUtil(root.left, minValue, root.data) &&
                        checkBSTUtil(root.right, root.data, maxValue)
        );
    }
}