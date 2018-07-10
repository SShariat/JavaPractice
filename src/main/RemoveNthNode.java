package main;

public class RemoveNthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //Declaring a Dummy Object to start
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        ///increment the first "pointer"
        for (int i = 1; i < n + 1; i++){
            first = first.next;
        }

        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        //Skip the node provided by second
        second.next = second.next.next;

        return dummy.next;
    }
}
