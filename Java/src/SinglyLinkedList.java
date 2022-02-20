import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void lengthOfList(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count = count +1;
            current = current.next;
        }

        System.out.println("Length of List is: "+ count);

    }
    public static void display(ListNode head){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static ListNode reversing(ListNode head){

        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode next = null;
        ListNode previous =null;
        while(current!=null){
        next = current.next;
        current.next=previous;
        previous = current;
        current =next;


        }
    return previous;

    }
    public static void main(String[] args){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        sl.head.next = second;
        second.next = third;
        ListNode current = sl.head;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }

        lengthOfList(sl.head);

        display(sl.head);


        display(reversing(sl.head));

    }

}
