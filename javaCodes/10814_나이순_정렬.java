//sort
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder[] member = new StringBuilder[201];
        for(int i = 0; i < member.length; i++){
            member[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            member[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder temp : member){
            sb.append(temp);
        }

        System.out.println(sb);
    }
}
