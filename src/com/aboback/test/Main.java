package com.aboback.test;

/**
 * @author jhb
 * @date 2020/12/11
 */
public class Main {

    public static void main(String[] args) {


        new Main().test();

    }

    public void test() {
        String str = "123";
        changeValue(str);
        System.out.println("str值为: " + str);  // str未被改变，str = "123"
    }

    public void changeValue(String str) {
        str = "abc";
    }
}
