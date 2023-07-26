import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public static Node addNode(int data, Node head, Node tail) {
        Node n = new Node(data);
//        System.out.println("Printing @ addNode ");
//        System.out.println(head.getData()+" "+tail.getData());
        if (head == null) {
            head = n;

        } else {
            tail.setNext(n);
        }
//        System.out.println("@addNodeInnerBefore: " + head + " " + tail);

        tail = n;
//        System.out.println("Head's next" + head.getNext().getData());
//        System.out.println("@addNodeInner: " + head + " " + tail);
        return tail;
//        System.out.println(head.getData()+" "+tail.getData());
//        System.out.println("Done with the addNode");
    }

    public static Node addData(ArrayList<Integer> a, Node head, Node tail) {
//        System.out.println("Starting Add Data");
//        System.out.println("@addDataOuter: " + head + " " + tail);
        for (int element : a) {
//            System.out.println("for: " + element);
//            System.out.println("Checking in the loop");
//            System.out.println("Adding in "+element+" "+head.getData()+" "+tail.getData());
            tail = addNode(element, head, tail);
//            System.out.println("@addDataInner: " + head + " " + tail);
//            System.out.println("@addData Printer:");
//            System.out.println(head.getData()+" "+tail.getData());
        }
        return tail;
//        System.out.println("Ending Add Data");
    }


    public static void loopCreation(int n, Node head, Node tail) {
        Node t = head;
        for (int i = 0; i <= (n - 1); i++) {
            System.out.println("Checking the loop @: "+t.getData());
            t = t.getNext();
        }
        System.out.println("Tail@ "+tail.getData());
        Node temp = tail;
        temp.setNext(t);
//        To make it fully circular list.
//        Node temp = tail;
//        temp.setNext(head);
//        return head;
    }

    public static void checkLoop(Node head, Node tail) {
        Node slowPointer = head;
        Node fastPointer = head;
        int flag = 1;
        while (slowPointer != null && fastPointer != null) {
            System.out.println(slowPointer.getData()+" "+fastPointer.getData());
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer) {
                flag = 0;
                System.out.println("Loop Exists");
                break;
            }
        }
        if (flag == 1) {
            System.out.println("No Loop Exists");
        }

    }

    public static void main(String[] args) {
        Node l = new Node(1);
        Node head = l;
        Node tail = l;
//        System.out.println("@main1: " + head + " " + tail);
//        System.out.println("Printing the head data "+head.getData());
//        System.out.println("Printing the tail data "+tail.getData());
        ArrayList<Integer> inputNumbers = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7));
        tail = addData(inputNumbers, head, tail);
//        System.out.println("@main2: " + head + " " + tail);
        printList(head);
        System.out.println();
//        System.out.println("Printing the head data "+head.getData());
//        System.out.println("Printing the tail data "+tail.getData());
        loopCreation(4, head, tail);
//        printList(head);
        checkLoop(head, tail);
    }
}
