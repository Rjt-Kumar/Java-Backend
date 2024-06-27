package DAY_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class FireAndIce {
    static FastReader reader = new FastReader();
    static FastWriter writer = new FastWriter();

    public static void main(String[] args) {

        int t = reader.nextInt();

        while( t--  > 0 ){

            int n = reader.nextInt() , mod = reader.nextInt();

            writer.println((rec(n)*2)%mod);
        }

        writer.flush();
        writer.close();
    }

    public static int rec(int n){
         if( n == 0 ) return 1;

         if( n < 0 ) return 0;
         int sum = 0;
         for(int i= 1; i <= n ;i+=2 ){
             sum += rec(n-i);
//             sum *= 2;
         }

         return sum;
    }
}
