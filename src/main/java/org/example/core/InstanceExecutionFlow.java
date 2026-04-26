package org.example.core;

/**
 * if i will not create an object then only main
 * if object created then
 *      - first find instance variable and block from top to bottom
 *      - second it will assign variable and execute method or block
 *      - constructor call
 */
public class InstanceExecutionFlow {
    int i=10;
    {
        m1();
        System.out.println("fist block");
    }

    public InstanceExecutionFlow(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
//        InstanceExecutionFlow instanceExecutionFlow = new InstanceExecutionFlow();
        System.out.println("main");
    }

    public void m1(){
        System.out.println(j);
    }
    {
        System.out.println("second block");
    }
    int j=20;
}
