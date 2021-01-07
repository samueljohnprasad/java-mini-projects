import java.util.LinkedList;

public class addTwoLinkedLists {

    public static void main(String aa[]){
        LinkedList<Integer> l=new LinkedList<>();
        LinkedList<Integer> ll=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(3);

        int i=0;

     while(i<3){
        System.out.println(l);


         i++;}
        





    }

    public static ListNode addTwoNum(LinkedList<Integer> l,LinkedList<Integer> ll){

        ListNode dum=new ListNode(1);
        ListNode curr=dum;
        int carry=0;

        while(l!=null||ll!=null){
            int sum=carry;
            if(l!=null){
                sum+=l.element();

            }

        }

        
        return new ListNode(0);

    }
    
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int x){
        this.val=x;

    }
}
