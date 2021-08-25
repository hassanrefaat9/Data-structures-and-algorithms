package Trees;

public class BineryTree {

    Node Root;

    public BineryTree(Node Root) {
        this.Root = Root;
    }

    public void add(Node newNode, Node rootExplor) {
        //we will add in right subTree 
        if (rootExplor == null) {
            return;
        }
        if (newNode.value > rootExplor.value) {
            if (rootExplor.right == null) {
                rootExplor.right = newNode;
            } else {

                add(newNode, rootExplor.right);

            }
        }
        //we will add in left subTree 
        if (newNode.value < rootExplor.value) {
            if (rootExplor.lift == null) {
                rootExplor.lift = newNode;
            } else {

                add(newNode, rootExplor.lift);

            }
        }
    }

    public void search(int value, Node rootExplor) {
        //we will search in right subTree 
        if (rootExplor == null) {
            System.out.println("Value is not founded");
            return;
        }
        if (rootExplor.value == value) {
            System.out.println("Value is founded");
        }

        if (value > rootExplor.value) {

            search(value, rootExplor.right);

        }

        //we will search in left subTree 
        if (value < rootExplor.value) {

            search(value, rootExplor.lift);

        }
    }
}
