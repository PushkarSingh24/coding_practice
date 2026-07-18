import java.io.*;
import java.util.*;
 
public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] vis;
    static int[] p;
 
    static void dfs(int u, ArrayList<Integer> idx, ArrayList<Integer> val) {
        vis[u] = true;
        idx.add(u);
        val.add(p[u]);
 
        for (int v : graph[u]) {
            if (!vis[v]) {
                dfs(v, idx, val);
            }
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
 
            p = new int[n + 1];
 
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
 
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }
 
            for (int i = 1; i + x <= n; i++) {
                graph[i].add(i + x);
                graph[i + x].add(i);
            }
 
            for (int i = 1; i + y <= n; i++) {
                graph[i].add(i + y);
                graph[i + y].add(i);
            }
 
            vis = new boolean[n + 1];
            boolean ok = true;
 
            for (int i = 1; i <= n && ok; i++) {
                if (!vis[i]) {
                    ArrayList<Integer> idx = new ArrayList<>();
                    ArrayList<Integer> val = new ArrayList<>();
 
                    dfs(i, idx, val);
 
                    Collections.sort(idx);
                    Collections.sort(val);
 
                    if (!idx.equals(val)) {
                        ok = false;
                    }
                }
            }
 
            out.append(ok ? "YES" : "NO").append('
');
        }
 
        System.out.print(out);
    }
}