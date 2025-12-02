package org.example.LinkdList;

public class MonitorClass {
    public static void main(String[] args) {
        InsertDataFirst insertDataFirst = new InsertDataFirst();
        insertDataFirst.insertData(10);
        insertDataFirst.insertData(20);
        insertDataFirst.insertData(30);

        PrintLinkListData printLinkListData = new PrintLinkListData();
        System.out.println("print ll ");
        printLinkListData.printAllNodeData();

        ReverseLinkList list = new ReverseLinkList();
        list.reverseLinkList();
        System.out.println("print ll after reverse");
        printLinkListData.printAllNodeData();
    }
}
