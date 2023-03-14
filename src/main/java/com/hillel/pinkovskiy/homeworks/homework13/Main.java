package com.hillel.pinkovskiy.homeworks.homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int countOccurance(List<String> list, String str) {
        int count = 0;
        for (String s : list) {
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }
    public static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i : list) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        return uniqueList;
    }
    public static void calcOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, count + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static List<Map<String, Object>> findOccurance(List<String> list) {
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, count + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", entry.getKey());
            item.put("occurrence", entry.getValue());
            result.add(item);
        }
        return result;
    }
}
