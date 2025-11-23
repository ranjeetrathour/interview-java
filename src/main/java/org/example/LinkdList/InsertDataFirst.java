package org.example.LinkdList;

public class InsertDataFirst {
    static Node head;

    public void insertData(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

}
