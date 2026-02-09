package org.example.LinkdList;

/**
 * LeetCode 2: Add Two Numbers
 */
public class AddTwoNumberFromTwoLinkdList {

    public static void main(String[] args) {

        // First Linked List: 2 -> 4 -> 3
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        // Second Linked List: 5 -> 6 -> 4
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);
        head1.next.next.next=new Node(2);

        Node res = null;
        Node temp1 = head1;
        Node temp2 = head2;
        int sum=0;
        while (temp1 != null && temp2 != null) {
            int val = temp1.value;
            int val2 = temp2.value;
            int s=val2+val;
            if (s>=10){
               sum=s==10?1:val2+val%10;
               s=0;
            }
            Node newNode = new Node(s);

            if (res == null) {
                res = newNode;
            } else {
                newNode.next = res;
                res = newNode;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1!=null && sum>0){
                temp1.value+=sum;
            }else if (temp2!=null && sum>0){
                temp2.value+=sum;
            }
        }

        while (temp2!=null){
            Node newNode = new Node(temp2.value);
            newNode.next = res;
            res = newNode;
            temp2=temp2.next;

        }
        Node temp3=res;
        while (temp3!=null){
            System.out.println(temp3.value);
            temp3=temp3.next;
        }
    }
}