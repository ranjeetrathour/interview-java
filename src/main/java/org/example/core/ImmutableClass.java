package org.example.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final int age;
    private List<Integer> list;

    public ImmutableClass(String name, int age,List<Integer> list){
        this.age=age;
        this.name=name;
        this.list = new ArrayList<>(list);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getList(){
        return Collections.unmodifiableList(list);
    }
}
