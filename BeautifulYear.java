import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


public class BeautifulYear {
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
        PrintWriter out = new PrintWriter(System.out, true);
        FastScanner sc = new FastScanner();
        int year = sc.nextInt();
        while(year<=9999){
            year++;
            HashSet<Character> set = new HashSet<>(Integer.toString(year).chars().mapToObj(i -> (char)i).collect(Collectors.toList()));
            if(set.size()==4){
                break;
            }
        }
        out.println(year);
    }
}
