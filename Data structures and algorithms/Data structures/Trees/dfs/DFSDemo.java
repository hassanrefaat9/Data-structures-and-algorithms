 
package dfs;
 
public class DFSDemo {
    public static void main(String[] args) {
        DFS g=new DFS(6);
        g.addNode(0, 2);
        g.addNode(0, 1);
        g.addNode(1, 4);
        g.addNode(1, 3);
        g.addNode(1, 0);
        g.addNode(3, 1);
        g.addNode(4, 1);
        g.addNode(2, 5);
        g.addNode(2, 0);
        g.addNode(5, 2);
        g.DFSExplor(0);
        
    }
}
