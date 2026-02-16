package org.example.LinkdList;

public class SortList {
    Node headOfSortLL;
    Node tailOfSortLL;

    public void sortLL(Node head){
        headOfSortLL = head;
        tailOfSortLL = head;
        Node temp = headOfSortLL;
        while (temp!=null){
            Node temp2 = temp.next;
            while (temp2!=null){
                if (temp2.value>temp.value){
                    int tData = temp.value;
                    temp.value  = temp2.value;
                    temp2.value=tData;
                }
                temp2=temp2.next;
            }
            temp=temp.next;
        }

    }
}
