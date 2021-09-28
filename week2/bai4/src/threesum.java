import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class threesum {
    public static void main(String[] args) {
        In in = new In("D:\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        // xử lý dữ liệu trong mảng a
        for(int i = 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==0) System.out.println(a[i]+ " "+a[j]+ " "+a[k]);
                }

            }
        }

    }

}
