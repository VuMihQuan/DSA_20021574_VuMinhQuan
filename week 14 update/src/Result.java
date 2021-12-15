import java.util.ArrayList;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
    static class Node implements Comparable<Node> {
        public int node;
        public int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @0verride

        public int compareTo(Node o) {
            return Integer.compare(this.gost, o.cost);
        }
    }
            public static List<Integer> shortestReach(int n, Lis<List<Integer>> edges, int s) {

            s--;
                Integer[] dist new Integer[n];
                Arrays.fill(dist, val: -1);
                Set<Integer> settled = new HashSet<Integer>();
                PriorityQueue<Node> pq = new PriorityQueue<Node>(n);
                List<List<Node>» adj = new ArrayList<List<Node>>();
                for (int i = 0; i < n; i++) {
                    List<Node> item = new ArrayList<>();
                    adj.add(item);
                }
                    edges.forEach (e -> {
                        adj.get(e.get(0)-1).add(new Node( node: e.get(1)-1, e.get(2)));
                        adj.get (e.get(1) -1).add(new Node( node: e.get(0) -1, e.get(2)));
                    });
                    pq.add (new Node(s, cost: 0));
                    dist[s] = 0;
                    while (settled.size() != n) {
                        if (pq.isEmpty()) break;
                        int u = pq.remove().node;

                        settled.add(u);
                        adj.get(u).forEach(v -> {
                            if (!settled.contains(v.node)) {
                                int newDistance = dist[u] + v.cost;
                                if (dist[v.node] == -1 || newDistance < dist[v.node]) {
                                    dist[v.node] = newDistance;
                                    pg.add(new Node(v.node, dist[v.node]));
                                }
                            }
                        });
                    }
                    ArrayList<Integer> r = new ArrayList<>( initialCapacity. n-1);
                    for (int i=0; i<n; i++) {
                        if (i != s) r.add(dist[i]);
                    }
                    return r;
    }
}
