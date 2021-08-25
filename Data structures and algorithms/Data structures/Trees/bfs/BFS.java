package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    int size;
    adjList[] array;

    public BFS(int size) {
        this.size = size;
        array = new adjList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void addNode(int src, int dest) {
        Node n = new Node(dest, null);
        n.Next = array[src].head;
        array[src].head = n;
    }

    public void BFSExplor(int startVertex) {
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }
        Queue<Integer> s = new LinkedList<Integer>();
        s.add(startVertex);
        while (!s.isEmpty()) {
            int n = s.poll();
            System.out.println("Vist:" + n);
            visited[n] = true;
            Node head = array[n].head;

            while (head != null) {
                if (visited[head.dest] == false) {
                    s.add(head.dest);

                } else {
                    head = head.Next;
                }
            }

        }
    }
}
