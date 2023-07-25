public class Node{
    private int data;
    private Node next;
    private Node head;
    private Node tail;

    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public void setTail(Node tail){
        this.tail = tail;
    }

    public Node(){
        this.next = null;
        this.head = null;
        this.tail = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.head = null;
        this.tail = null;
    }

    public void addNode(int data){
        Node n = new Node(data);
        if(this.head==null){
            this.head = n;

        }else{
            this.tail.next = n;
        }
        this.tail = n;
        System.out.println("Added: "+n.data+" "+this.head.data+" "+this.tail.data);
    }
}

