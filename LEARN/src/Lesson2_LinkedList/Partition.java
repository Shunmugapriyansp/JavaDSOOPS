package Lesson2_LinkedList;

public class Partition {

    public static void main(String[] args) {
        node x = new node(3);
        x.append(5);
        x.append(8);
        x.append(5);
        x.append(10);
        x.append(1);
        x.append(2);
        //x.printnode();
    partitionNode(x,5).printnode();
    }
    public static node partitionNode( node n, int a){
        node head = n;
        node tail= n;
        while(n!= null){
            node next= n.next;
            if(n.val<a){
                n.next= head;
                head= n;
            }else{
                tail.next= n;
                tail=n;
            }
            //System.out.println("node n");
            //n.printnode();
            //System.out.println("node head");
            //head.printnode();
            //System.out.println("node tail");
            //tail.printnode();

            n=next;

        }



        tail.next=null;
        return head;
    }
}
class node {
    int val;
    node next = null;

    public node(int val) {
        this.val = val;
    }

    public void printnode() {
        node n = this;
        while (n != null) {
            System.out.print(n.val +  "-->");
            n = n.next;
        }
        System.out.println("null");
    }

    public void append(int d) {
        node endNode = new node(d);
        node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = endNode;
        printnode();
    }
}