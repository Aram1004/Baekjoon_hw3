import java.util.Scanner;

public class Baekjoon1912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int input[] = new int[N];
        int sum[] = new int[N];

        for(int i=0; i<N; i++) {
            input[i] = sc.nextInt();
        }

        sum[0] = input[0];
        int max = input[0];

        for(int i=1; i<N; i++) {
            sum[i] = Math.max(input[i], sum[i-1] + input[i]);
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }
}
