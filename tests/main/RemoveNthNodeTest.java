package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeTest {

    @Test
    public void RemoveNth() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode dummy = RemoveNthNode.removeNthFromEnd(head,2);

        System.out.println(dummy.val);
        System.out.println(dummy.next.val);
        System.out.println(dummy.next.next.val);
        System.out.println(dummy.next.next.next.val);
    }
}