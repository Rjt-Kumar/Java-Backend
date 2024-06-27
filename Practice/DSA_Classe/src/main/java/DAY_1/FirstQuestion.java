package DAY_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
}

class FastWriter {
    PrintWriter pw;

    public FastWriter() {
        pw = new PrintWriter(System.out);
    }

    public void print(Object o) {
        pw.print(o);
    }

    public void println(Object o) {
        pw.println(o);
    }

    public void close() {
        pw.close();
    }

    public void flush() {
        pw.flush();
    }
}
public class FirstQuestion {
    static FastReader reader = new FastReader();
    static  FastWriter writer = new FastWriter();
    public static void main(String[] args) {
          int a = reader.nextInt();
          int b = reader.nextInt();

          if( a == 0 ){
              writer.println("https://www.codechef.com/practice");
          }else{
              if( b == 0 ) writer.println("https://www.codechef.com/contests");
              else writer.println("https://discuss.codechef.com");
          }

          writer.flush();
          writer.close();
    }
}
