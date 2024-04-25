//math
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int[] len = new int[3];
            for(int i = 0; i < 3; i++){
                len[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(len);
            
            if(len[0] == 0 && len[1] == 0 && len[2] == 0){
                break;
            }
            if(len[0]*len[0] + len[1]*len[1] == len[2]*len[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
