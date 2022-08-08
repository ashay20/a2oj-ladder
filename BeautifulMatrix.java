import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BeautifulMatrix {

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {

                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
//        PrintWriter out=new PrintWriter(System.out);
        int mat[][] = new int[5][5];
        int r=-1,c=-1;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }
        int ans = Math.abs(3-r-1)+Math.abs(3-c-1);
        System.out.println(ans);
    }
}
