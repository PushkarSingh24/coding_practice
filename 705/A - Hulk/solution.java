import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                result.append("I hate");
            }else{
                result.append("I love");
            }
            if(i ==n){
                result.append(" it");
            }else{
                result.append(" that ");
            }
        }
        System.out.println(result);
        sc.close();
    }
}