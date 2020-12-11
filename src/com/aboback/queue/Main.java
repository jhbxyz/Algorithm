package com.aboback.queue;

/**
 * @author jhb
 * @date 2020/12/11
 */
public class Main {

    public static void main(String[] args) {

        TaskQueue taskQueue = new TaskQueue(1);
        taskQueue.start();

        taskQueue.add(new PrintTask(110));
        taskQueue.add(new PrintTask(112));
        taskQueue.add(new PrintTask(122));


        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask(i);
            if (1 == i) {
                task.setPriority(Priority.LOW); // 让第2个进入的人最后办事。
            } else if (8 == i) {
                task.setPriority(Priority.HIGH); // 让第9个进入的人第二个办事。
            } else if (9 == i) {
                task.setPriority(Priority.Immediately); // 让第10个进入的人第一个办事。
            }
            taskQueue.add(task);
        }


    }
}
