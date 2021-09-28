import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int[] a, int number) {

        int lo = 0, hi = a.length-1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (number < a[mid]) hi = mid - 1;
            else if (number > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        int Number = StdIn.readInt();
        int[] a = new int[N];
        Random rd = new Random();
        binarySearch bi = new binarySearch();
        for (int i = 0; i < N; i++) {
            a[i] = rd.nextInt(100);
        }
        for (int i = 0; i < N; i++) {
            StdOut.println(a[i]);
        }
        Arrays.sort(a);
        int b = bi.binarySearch(a, Number);
        if (b == -1) StdOut.println("Not Found");
        else StdOut.println("Found");

    }
}