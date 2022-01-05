import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        char[] arr = word.toCharArray();
        for(int i = 0; i<arr.length; i++){
            System.out.printf(arr[i]-'A'+1+" ");
        }
    }
}
