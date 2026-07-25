import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();
        long tC = k * w * (w + 1) / 2;
        long b = tC - n;
        if (b > 0)
            System.out.println(b);
        else
            System.out.println(0);
        sc.close();
    }
}