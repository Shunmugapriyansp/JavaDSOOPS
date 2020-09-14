package Lesson2_LinkedList;

public class AddTwoLinkedLists {

    public static void main(String[] args){
        node a = new node(5);
        a.append(8);
        a.append(5);
        node  b = new node(6);
        b.append(7);
        b.append(8);
        b.append(3);
    }

    private static node AddTwoLinkedLists(node a, node b,int carry){
        node resultnode = new node(0);
        node tempnodeA =a;
        node tempnodeB=b;
        if((a.next==null)&&(b.next==null)){
            resultnode.val=  (a.val +b.val)%10;
            resultnode.next=null;
            carry=(a.val + b.val)>=10 ? 1:0;
        }else{
            if(a!==null){
                tempnodeA=a.next;
        }if(b!==null){
                 tempnodeB=b.next;
            }
            AddTwoLinkedLists(tempnodeA,tempnodeB,carry)
    }

}
