import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int count =0;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            uf.union(p, q);
            count++;
            if (allConected(uf,N)) {
                System.out.println(count);
                break;
            }
            if(!allConected(uf,N)) System.out.println("Failed");
        }
    }
     public static boolean allConected(UF uf,int n){
        for(int i=0;i<n-1;i++){
            if(!uf.connected(i,i+1))return false;
        }
        return true;
     }
}