package com.aboback.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author jhb
 * @date 2020/12/10
 */
public class TaskExecutor extends Thread {


    private BlockingQueue<ITask> taskQueue;

    private volatile boolean isRunning = true;// 或者用 AtomicBoolean isRunning = new AtomicBoolean(true)


    public TaskExecutor(BlockingQueue<ITask> taskQueue) {
        this.taskQueue = taskQueue;
    }


    public void quit() {
        isRunning = false;
        interrupt();
    }

    @Override
    public void run() {

        while (isRunning) {
            ITask iTask;
            try {
                iTask = taskQueue.take();
            } catch (InterruptedException e) {
                if (!isRunning) {
                    interrupt();
                    break;
                }
                continue;
            }

            iTask.run();

        }

    }
}
