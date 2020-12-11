package com.aboback.queue;

/**
 * @author jhb
 * @date 2020/12/11
 */
public class PrintTask extends BaseTask {

    private int id;

    public PrintTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("我的id是：" + id);
    }

}
