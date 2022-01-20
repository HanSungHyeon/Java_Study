import java.util.Scanner;

public class SWEA_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = sc.nextInt();
            int oddnum = 0, evennum = 0;
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0)
                    evennum += j; //짝수
                else
                    oddnum += j; //홀수
            }
            System.out.println("#" + i + " " + (oddnum - evennum));
        }
    }
}
