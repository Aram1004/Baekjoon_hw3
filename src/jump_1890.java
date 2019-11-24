import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jump_1890 {

    static int map[][];
    static long dp[][];
    static int cur, cnt, N;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];
        dp = new long[N+1][N+1];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        goDp();
    }

    public static void goDp() {
        dp[1][1] = 1; // 시작점

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {

                if  (i == N && j == N) { // 종착점
                    System.out.println(dp[i][j]);
                } else {
                    if(dp[i][j] > 0) {
                        cur = map[i][j];

                        if(i+cur <= N) { // 아래
                            dp[i+cur][j] = dp[i+cur][j] + dp[i][j];
                        }

                        if(j+cur <= N) { // 오른쪽
                            dp[i][j+cur] = dp[i][j+cur] + dp[i][j];
                        }
                    }
                }
            }
        }
    }
}



