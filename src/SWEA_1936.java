import java.util.Scanner;

public class SWEA_1936 {
    public static void main(String[] args) {
        System.out.println(twoTimes("a","-"));
        int num1 =1,num2 = 2,num3 = 3;
        num1 = num1 + num2;
        num1 = num1 + num3;
        System.out.println(num1);



    }

    public static String twoTimes(String text, String a){
        String out = "";
        out = out + a + "\n";   //""-
        out = out + text +"\n";
        out = out + text +"\n";
        return out;
    }
}
