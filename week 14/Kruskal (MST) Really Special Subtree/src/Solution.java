import java.io.*;
import java.util.*;

public class Solution {
    static private class Node{
        int id;
        ArrayList<Edge> edges = new ArrayList<Edge>();
        int bestEdge = Integer.MAX_VALUE;

        public Node(int id) {
            this.id = id;
        }
    }

    static private class Edge{
        Node node;
        int weight;

        public Edge(Node node, int weight) {
            this.weight = weight;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(null);

        for(int i=0; i<v; i++) {
            nodes.add(new Node(i+1));
        }

        for(int i=0; i<e; i++) {
            Node a = nodes.get(sc.nextInt());
            Node b = nodes.get(sc.nextInt());
            int weight = sc.nextInt();

            a.edges.add(new Edge(b, weight));
            b.edges.add(new Edge(a, weight));
        }

        Node start = nodes.get(sc.nextInt());
        start.bestEdge = 0;

        PriorityQueue<Node> q = new PriorityQueue<Node>(nodes.size(), new Comparator<Node>() {
            public int compare(Node a, Node b) {
                if(a.bestEdge == b.bestEdge) {
                    return 0;
                }

                return a.bestEdge > b.bestEdge ? 1 : -1;
            }
        });

        for(int i=1; i<=v; i++) {
            q.add(nodes.get(i));
        }

        int sum = 0;

        while(!q.isEmpty()) {
            Node node = q.poll();;
            if(node.bestEdge != Integer.MAX_VALUE) {
                sum+=node.bestEdge;
            }

            for(Edge edge:node.edges) {
                if(!q.contains(edge.node)) {
                    continue;
                }

                Node neighbour = edge.node;
                if(edge.weight < neighbour.bestEdge) {

                    neighbour.bestEdge = edge.weight;
                    q.remove(neighbour);
                    q.add(neighbour);
                }

            }
        }

        System.out.println(sum);
    }
