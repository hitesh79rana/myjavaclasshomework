package mypackage;

public class LongData {
    public static void main(String[] args) {
        long a= 987654321123456789L;
        long b= 123456789987654321L;
        long c;
        System.out.println("c="+(a+b));
        System.out.println("c="+(a-b));
        System.out.println("c="+(a*b));
        System.out.println("c="+(a/b));
        System.out.println("c="+(++b));
        System.out.println("c="+(--a));
    }
}
