public class Node{
    private int data;
    private Node next;

    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }
    public Node(){
        this.next = null;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}