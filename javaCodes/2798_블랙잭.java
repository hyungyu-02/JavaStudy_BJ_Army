//bruteForce
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int maxValue = 0;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int num = cards[i] + cards[j] + cards[k];
                    if(num > maxValue && num <= m){
                        maxValue = num;
                    }
                }
            }
        }
        System.out.println(maxValue);
    }
}
