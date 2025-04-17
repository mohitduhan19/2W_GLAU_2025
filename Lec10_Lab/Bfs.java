
package W.Lec10_Lab;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            ls.add(node);

            for(Integer i : adj.get(node)){
                if(vis[i] == false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return ls;
    }
}
