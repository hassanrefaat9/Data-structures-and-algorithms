
package dfs;

import java.util.Stack;


public class DFS {
int size;
AdjacencyList[]array;
    public DFS(int size) {
        this.size=size;
        array=new AdjacencyList[this.size];
        for (int i = 0; i < size; i++) {
            array[i]=new AdjacencyList();
            array[i].head=null;
        }
    }
    public void addNode(int src,int dest){ 
        Node n=new Node(dest,null);
        n.Next=array[src].head;
        array[src].head=n;
    }
    public void DFSExplor(int startVertex){
        Boolean[]visited=new Boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i]=false;
        }
        Stack<Integer>s=new Stack<Integer>();
        s.push(startVertex);
        while (! s.isEmpty()){
            int n=s.pop();
            s.push(n);
            visited[n]=true;
            Node head=array[n].head;
            Boolean isDone=true;
            while (head!=null) {
                if(visited[head.dest]==false){
                    s.push(head.dest);
                isDone=false;
                break;
                }else
                    head=head.Next;
            }
            if (isDone==true) {
                int outN=s.pop();
                System.out.println("Visit node"+outN);
            }
        }
    }
}
