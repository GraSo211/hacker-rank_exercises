import java.io.*;
import java.math.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger num =new BigInteger(n);
        String res = (num.isProbablePrime(100))? "prime":"not prime";
        System.out.println(res);
        
        bufferedReader.close();
    }
}
