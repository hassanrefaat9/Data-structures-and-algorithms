
package Trees;

public class BineryTreeDemo {
    public static void main(String[] args) {
        //declartion new node to insert it in tree;
        Node root=new Node(7,null,null);
        BineryTree b=new BineryTree(root); 
        //adding with for loop
        for (int i = 1; i < 10; i++) {
            Node newNode =new Node(i,null,null);
            b.add(newNode, b.Root);
        }
        b.search(11, b.Root);
        b.search(5, b.Root);
        b.search(2, b.Root);
        b.search(141, b.Root);
    }
}
