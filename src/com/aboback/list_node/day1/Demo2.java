package com.aboback.list_node.day1;

import com.aboback.list_node.ListNode;

/**
 * 反转链表前 N 个节点
 *
 * @author jhb
 * @date 2020/12/17
 */
public class Demo2 {

    ListNode successor = null;// 后驱节点

    // 将链表的前 n 个节点反转（n <= 链表长度）
    ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            // 记录第 n + 1 个节点
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, n - 1);

        head.next.next = head;

        // 让反转之后的 head 节点和后面的节点连起来
        head.next = successor;

        return last;

    }


    //反转链表的一部分
    ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseN(head, n);
        }

        // 前进到反转的起点触发
        head.next = reverseBetween(head.next, m - 1, n - 1);

        return head;
    }

}
