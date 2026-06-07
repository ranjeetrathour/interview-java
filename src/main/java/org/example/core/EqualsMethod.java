package org.example.core;

/**
 * object class equal method used for reference check
 * and StringBuilder also not override this method only String override this
 */
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        Student student1 = new Student("ram",1);
        Student student2 = new Student("shyam",1);
        Student student3 = new Student("ram",1);

        System.out.println(student1.equals(student3));

        StringBuilder stringBuilder = new StringBuilder("ram");
        StringBuilder stringBuilder1 = new StringBuilder("ram");
        System.out.println(stringBuilder.equals(stringBuilder1));

    }
}
