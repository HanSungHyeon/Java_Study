class Print{
    public String delimeter;
    public void  b() {
        System.out.println(delimeter);
        System.out.println("b");
        System.out.println("b");
    }

    public void  a() {
        System.out.println(delimeter);
        System.out.println("a");
        System.out.println("a");
    }

    public static void c(String delimeter) {
        System.out.println(delimeter);
        System.out.println("c");
        System.out.println("c");
    }
}
public class staticMethod {
    public static void main(String[] args) {
        Print t1 = new Print();
        t1.delimeter = "-";
        t1.a();
        t1.b();
        Print.c("$");

    }


}
