package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

//Collection
//Queue extends Collection
//LinkedList, PriorityQueue and ArrayDeque
//FIFO
//Stack extends Vector -> LIFO
public class QueueMain {

    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();
        //Queue<String> stringQueue1 = new ArrayBlockingQueue<>(10);
        stringQueue.add("Hari");
        stringQueue.add("Ravi");
        stringQueue.offer("Raju");
        System.out.println(stringQueue.peek());//returns head of the queue, returns null if queue is empty
        System.out.println(stringQueue.element());//throws exception is queue is empty
        stringQueue.poll();//removes and return element, returns null if nothing is present
        System.out.println(stringQueue.toString());
        stringQueue.remove();//throws an exception if queue is empty
        System.out.println(stringQueue.toString());


        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.offer("Mani");
        stringArrayDeque.addFirst("Raju");
        System.out.println(stringArrayDeque.toString());
        stringArrayDeque.addFirst("Pranith");
        System.out.println(stringArrayDeque.toString());
        stringArrayDeque.addLast("Ramu");
        System.out.println(stringArrayDeque.toString());
        stringArrayDeque.removeFirst();
        stringArrayDeque.removeLast();
        stringArrayDeque.removeFirstOccurrence("Ramu");


        Stack<String> stringStack = new Stack<>();
        stringStack.push("ramu");
        stringStack.push("raju");
        System.out.println(stringStack.pop());//removes last element from the stack
        System.out.println(stringStack.toString());
    }
}
