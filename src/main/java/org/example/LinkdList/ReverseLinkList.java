package org.example.LinkdList;

import static org.example.LinkdList.InsertDataFirst.head;

public class ReverseLinkList {

    public void reverseLinkList() {

        Node current = head;   // pointer to iterate through the list
        Node pre = null;       // previous node (initially null, because first reversed link will point to null)
        Node next;             // will be used to temporarily store next node

        while (current != null) {

            next = current.next;   // Step 1: Save the next node before breaking the link

            current.next = pre;    // Step 2: Reverse the link (current will now point to previous instead of next)

            pre = current;         // Step 3: Move 'pre' one step forward to current node

            current = next;        // Step 4: Move 'current' forward to next node (saved earlier)
        }

        head = pre; // After loop, 'pre' becomes the new head of reversed list
    }
}
