package com.methods;

import com.exception.QueueEmptyException;
import com.exception.QueueFullException;

public class CircularQueue {

    private int capacity;
    private Object[] queue;
    private int front;
    private int rear;


    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new Object[capacity];
        this.front = 0;
        this.rear = 0;
    }

    public int size() {
        return (rear > front) ? rear - front : capacity - front + rear;
    }

    public boolean isEmpty() {
        return (rear == front) ? true : false;
    }

    public boolean isFull() {
        int diff = rear - front;
        return (diff == -1 || diff == (capacity - 1)) ? true : false;
    }

    public void enqueue(Object obj) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is Full.");
        } else {
            queue[rear] = obj;
            rear = (rear + 1) % capacity;
        }
    }

    public Object dequeue() throws QueueEmptyException {
        Object item;
        if (isEmpty()) {
            throw new QueueEmptyException();
        } else {
            item = queue[front];
            queue[front] = null;
            front = (front + 1) % capacity;
        }
        return item;
    }
}
