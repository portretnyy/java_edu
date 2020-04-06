package collections;

public class TreeWrong {
    private Node root;//reference to root node

    public TreeWrong(Integer value) {
        this.root = new Node(value);
    }

    public void addToRight(Integer value) {
        this.root.right = new Node(value);
    }

    public void addToLeft(Integer value) {
        this.root.left = new Node(value);
    }

    public void addToLeftRight(Integer value) {

    }


    private static class Node {
        Integer value;
        Node left;
        Node right;

        Node(Integer value) {
            this.value = value;
        }
    }
}
