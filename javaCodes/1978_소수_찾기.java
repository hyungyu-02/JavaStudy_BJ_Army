//prime_num, math
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int primeNumCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()){
            boolean isPrime = true;
            int num = Integer.parseInt(st.nextToken());

            if(num == 1) continue;

            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){isPrime = false; break;}
            }
            if(isPrime) primeNumCount++;
        }
        System.out.println(primeNumCount);
    }
}
