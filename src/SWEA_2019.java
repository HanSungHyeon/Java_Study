import java.util.Scanner;

public class SWEA_2019 {
    public static void main(String[] args) {
        int num,ans = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i =1; i<= num+1; i++){
            System.out.print(ans+ " ");
            ans *=2;
        }
    }
}
