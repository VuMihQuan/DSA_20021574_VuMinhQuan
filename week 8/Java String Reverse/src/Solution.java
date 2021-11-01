import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length()-1;
        Boolean a = true;
        for(int i =0; i<n/2; i++){
            if(A.charAt(i)==A.charAt(n-i)) continue;
            else{
                a = false;
                System.out.println("No");
                break;
            }
        }
        if(a == true)System.out.println("Yes");
    }
}



