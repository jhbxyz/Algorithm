package com.aboback.leetcode.list_node;

import com.aboback.list_node.ListNode;
import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author jhb
 * @date 2020/12/18
 */
public class Demo1 {
    static Demo1 demo1;

    public static void main(String[] args) {

        try {
            demo1.fun();
        } catch (Exception e) {
//            e.printStackTrace();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");


    }

    void fun() {
        System.out.println("fun");
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//    }
}
