import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n= sc.nextInt();
            String s = sc.next();
            int maxLen= 0;
            int curr = 0;
            for (int i =0; i<n ;i++){
                if(s.charAt(i) == '#'){
                    curr++;
                    maxLen = Math.max(maxLen, curr);
                } else {
                    curr =0;
                }
            }
            System.out.println((maxLen +1)/2);
        }
        sc.close();
    }
}