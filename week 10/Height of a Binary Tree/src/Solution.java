import java.sql.SQLOutput;
import java.util.Scanner;

class Node{
    Node right;
    Node left;
    int data;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Solution {
    public static int height(Node root){
        if(root==null)return -1;
        return Math.max(height(root.left),height(root.right)+1);
    }
    public static Node insert(Node root,int data){
        if(root==null)return new Node(data);
        else{
            Node curr;
            if(data <= root.data){
                curr = insert(root.left,data);
                root.left = curr;
            }
            else{
                curr = insert(root.right,data);
                root.right=curr;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root =null;
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            root = insert(root,data);
        }
        System.out.println(height(root));
    }
}

