import java.util.*;
public class Solution {

    static void partition(int[] ar) {
        int pivot = ar[0];
        int i = 0;
        for (int j = 1; j<ar.length; j++){
            if (ar[j] <= pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
//System.out.println(i);
        int temp = ar[i];
        ar[i] = ar[0];
        ar[0] = temp;
        printArray(ar) ;
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}