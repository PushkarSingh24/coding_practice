import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<t; i++){
            int p = sc.nextInt(); 
            sum += p;
        }
        double result = (double)sum/t;
        System.out.println(result);
        sc.close();
    }
}