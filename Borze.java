// https://codeforces.com/problemset/problem/32/B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Borze {
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
        String input = sc.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='-'){
                if(input.charAt(i+1)=='.'){
                    ans.append('1');
                } else {
                    ans.append('2');
                }
                i++;
            } else {
                ans.append('0');
            }
        }
        out.println(ans);
    }
}
