import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class QueueAtSchool {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
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
        PrintWriter out = new PrintWriter(System.out,true);
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int t = sc.nextInt();
        StringBuilder queue = new StringBuilder(sc.next());
        while(t-- > 0){
            for (int i = 0; i < n-1; i++) {
                if (queue.charAt(i)=='B' && queue.charAt(i+1)=='G'){
                    queue.setCharAt(i,'G');
                    queue.setCharAt(i+1,'B');
                    i++;
                }
            }
        }
        out.println(queue);
    }
}
