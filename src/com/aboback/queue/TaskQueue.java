package com.aboback.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jhb
 * @date 2020/12/10
 */
public class TaskQueue {

    private AtomicInteger mAtomicInteger = new AtomicInteger();

    private BlockingQueue<ITask> mTaskQueue;
    private TaskExecutor[] mTaskExecutor;

    public TaskQueue(int size) {
        mTaskQueue = new PriorityBlockingQueue<>();
        mTaskExecutor = new TaskExecutor[size];
    }


    public void start() {
        stop();

        for (int i = 0; i < mTaskExecutor.length; i++) {
            mTaskExecutor[i] = new TaskExecutor(mTaskQueue);
            mTaskExecutor[i].start();
        }

    }

    public void stop() {
        if (mTaskExecutor != null) {
            for (TaskExecutor taskExecutor : mTaskExecutor) {
                if (taskExecutor != null) {
                    taskExecutor.quit();
                }
            }
        }
    }

    public <T extends ITask> int add(T task) {
        if (!mTaskQueue.contains(task)) {
            task.setSequence(mAtomicInteger.incrementAndGet());
            mTaskQueue.add(task);
        }

        return mTaskQueue.size();
    }


}
