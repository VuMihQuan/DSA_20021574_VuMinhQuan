import java.util.*;
import java.io.*;
class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
    this.data =data;
    left=null;
    right=null;
    }
}
class Solution{
    public static Node insert(Node root,int data){
        if(root==null)return new Node(data);
        else {
            Node curr;
            if (data <= root.data) {
                curr = insert(root.left, data);
            } else {
                curr = insert(root.right, data);
                root.right = curr;
            }
            return root;
        }
    }
    public static Node lca(Node root,int v1,int v2){
        if(v1<root.data && v2<root.data)return lca(root.left,v1,v2);
        else if(v1>root.data && v2>root.data)return lca(root.right,v1,v2);
        else return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        Node root= null;
        for(int i=0;i<n;i++){
            int data = scanner.nextInt();
            root = insert(root,data);
        }
        int v1= scanner.nextInt();
        int v2 = scanner.nextInt();
        System.out.println(lca(root,v1,v2).data);
    }
}