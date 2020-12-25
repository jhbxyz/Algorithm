package com.aboback.list_node.day1;

import com.aboback.list_node.ListNode;

/**
 * 递归反转整个链表
 *
 * @author jhb
 * @date 2020/12/17
 */
public class Demo1 {

    ListNode reverse(ListNode head) {
        if (head == null) return head;

        ListNode last = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return last;
    }


}
