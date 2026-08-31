import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        long faces = 0;
        for(int i=0;i<t;i++){
            String phedron = sc.nextLine();
            switch(phedron){
                case "Tetrahedron": faces += 4; break;
                case "Cube": faces += 6; break;
                case "Octahedron": faces += 8; break;
                case "Dodecahedron": faces += 12; break;
                case "Icosahedron": faces += 20; break;
            }
        }
        System.out.println(faces);
        sc.close();
    }
}