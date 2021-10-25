import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        int a; int b;
        for(a = 0, b = a + 1; b < A.length; a++, b++){
            int temp = A[b];
            int i = a;
            while(i >= 0 && temp < A[i]){
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = temp;
        }
        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}