package org.example.LinkdList;

import static org.example.LinkdList.InsertDataFirst.head;

public class MidOfLinkdList {

    Node midNode(){
        if (head==null || head.next==null){
            return head;
        }
        if (head.next.next==null){
           return head.next;
        }
        Node firstNode = head.next;
        Node secondNode = head.next.next;

        while (firstNode.next.next!=null){
            if (secondNode.next==null){
                return firstNode;
            }
            firstNode=firstNode.next;
            if (secondNode.next.next==null){
                return firstNode;
            }
            secondNode=secondNode.next.next;
        }

        return firstNode;
    }
}
