import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] levels = new boolean[n +1];
        int x= sc.nextInt();
        for(int i=0;i<x;i++){
            int level = sc.nextInt();
            levels[level] = true;
        }
        int y = sc.nextInt();
        for(int i=0;i<y;i++){
            int level = sc.nextInt();
            levels[level] = true;
        }
        for(int i=1;i<=n;i++){
            if(!levels[i]){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
        sc.close();
    }
}