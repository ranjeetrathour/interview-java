package org.example.LinkdList;

import java.util.concurrent.atomic.AtomicInteger;

import static org.example.LinkdList.InsertDataFirst.head;

public class PrintLinkListData {

    public void printAllNodeData() {
        Node temp = head;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        while (temp != null) {
            System.out.println("node " + atomicInteger.getAndIncrement() + " ----> " + temp.value);
            temp = temp.next;
        }
    }
}
