package org.example.LinkdList;

public class MonitorClass {
    public static void main(String[] args) {
        InsertDataFirst insertDataFirst = new InsertDataFirst();
        insertDataFirst.insertData(1);
        insertDataFirst.insertData(2);
        insertDataFirst.insertData(3);
        insertDataFirst.insertData(4);
        insertDataFirst.insertData(5);
        insertDataFirst.insertData(6);
        insertDataFirst.insertData(7);
        insertDataFirst.insertData(8);
        insertDataFirst.insertData(9);
        insertDataFirst.insertData(10);
        insertDataFirst.insertData(11);
        insertDataFirst.insertData(12);
        insertDataFirst.insertData(13);

        System.out.println("mid of ll");
        MidOfLinkdList midOfLinkdList  = new MidOfLinkdList();
        System.out.println("mid of ll is "+midOfLinkdList.midNode().value);


        PrintLinkListData printLinkListData = new PrintLinkListData();
        System.out.println("print ll ");
        printLinkListData.printAllNodeData();

        ReverseLinkList list = new ReverseLinkList();
        list.reverseLinkList();
        System.out.println("print ll after reverse");
        printLinkListData.printAllNodeData();
    }
}
