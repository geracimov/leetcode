package ru.geracimov.leetcode.top_interview_questions.easy.design;

/**
 * Min Stack
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <ul>
 *     <li>MinStack() initializes the stack object.</li>
 *     <li>void push(val) pushes the element val onto the stack.</li>
 *     <li>void pop() removes the element on the top of the stack.</li>
 *     <li>int top() gets the top element of the stack.</li>
 *     <li>int getMin() retrieves the minimum element in the stack.</li>
 * </ul>
 */
public class MinStack {
    private int[][] storage;
    private int topIndex;

    public MinStack() {
        storage = new int[16][2];
        topIndex = -1;
    }

    public void push(int val) {
        if (storage.length == topIndex + 1) {
            var newStorage = new int[storage.length * 2][2];
            System.arraycopy(storage, 0, newStorage, 0, storage.length);
            storage = newStorage;
        }
        storage[++topIndex][0] = val;
        storage[topIndex][1] = topIndex == 0 ? val : Math.min(val, storage[topIndex - 1][1]);
    }

    public void pop() {
        topIndex--;
    }

    public int top() {
        return storage[topIndex][0];
    }

    public int getMin() {
        return storage[topIndex][1];
    }
}
