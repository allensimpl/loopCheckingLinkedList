import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static Node addData(ArrayList<Integer> a){
        Node l = new Node();
        for(Integer i:a){
            l.addNode(i);
        }
        return l;
    }
    public static void loopCreation(Node l, int n){
        Node t = l.getHead();
        for(int i=0;i<=(n-1);i++){
            t = t.getNext();
        }
        Node temp = l.getTail();
        temp.setNext(t);
        //temp.next = l.head;
    }
    public static void checkLoop(Node l){
        Node slowPointer = l.getHead();
        Node fastPointer = l.getHead();
        int flag = 1;
        while(slowPointer!=null && fastPointer!=null){
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if(slowPointer==fastPointer){
                flag = 0;
                System.out.println("Loop Exists");
                break;
            }
        }
        if(flag == 1){
            System.out.println("No Loop Exists");
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> inputNumbers = new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,18));
        Node l = addData(inputNumbers);
        loopCreation(l,4);
        checkLoop(l);
    }
}
