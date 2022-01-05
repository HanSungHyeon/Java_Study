import java.util.Scanner;

public class Baekjoon_1110 {
    public static void main(String[] args) {
        int count = 0, oldnum, num, num1, num10;;
        Scanner sc = new Scanner(System.in);
        oldnum = sc.nextInt();
        num = oldnum;
        while (true) {
            num10 = num / 10;
            num1 = num % 10;
            num = getNum10(num1) + getNum1(num1, num10);
            count++;
            if (oldnum == num)
                break;
        }
        System.out.println(count);

    }

    public static int getNum10(int a) {
        return a * 10;
    }

    public static int getNum1(int a, int b) {
        return (a + b) % 10;
    }

}
