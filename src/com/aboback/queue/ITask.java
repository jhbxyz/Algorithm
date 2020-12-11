package com.aboback.queue;

/**
 * @author jhb
 * @date 2020/12/10
 */
public interface ITask extends Comparable<ITask> {

    void run();

    void setPriority(Priority priority);

    Priority getPriority();

    void setSequence(int sequence);

    int getSequence();
}

