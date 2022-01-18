import java.util.Scanner;

public class SWEA_1936 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b ==2)
            System.out.print("A");
        else
            System.out.print("B");

    }
}
