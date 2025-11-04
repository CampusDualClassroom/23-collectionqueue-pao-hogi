package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
    Queue<String> queue = new LinkedList<>();

    queue.add("Smith");
    queue.add("Montessori");
    queue.add("Peralta");
    queue.add("House");

    return queue;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {
    if (queue == null || queue.isEmpty()){
        System.out.println("La cola está vacía.");
        return;
    }
        System.out.println("Elemento en la cima de la cola (peek): " + queue.peek());
        System.out.println("=============");

        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println("Eliminando elemento: " + element);
        }
    }

    public static void main(String[] args) {
    Queue<String> myQueue = createQueue();
    printAndEmptyQueue(myQueue);
    }

}
