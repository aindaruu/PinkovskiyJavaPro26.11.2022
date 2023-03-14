package com.hillel.pinkovskiy.homeworks.homework12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> list;

    public ThreadSafeList() {
        list = Collections.synchronizedList(new ArrayList<T>());
    }

    public void add(T item) {
        synchronized (list) {
            list.add(item);
        }
    }

    public void remove(T item) {
        synchronized (list) {
            list.remove(item);
        }
    }

    public T get(int index) {
        synchronized (list) {
            return list.get(index);
        }
    }



}
