package objects;

public class Node {
    private Carta info;

    private Node next;

    public Node(Carta info){
        this.info = info;
        next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Carta getInfo() {
        return info;
    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof Node){
            Node node = (Node) obj;
            return info.equals(node.info);
        }
        return false;
    }
    @Override
    public String toString(){
        return info+((next!=null)?" "+next:"");
    }
}
