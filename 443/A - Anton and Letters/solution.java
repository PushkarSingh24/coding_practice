import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        System.out.println(letters.size());
        sc.close();
    }
}