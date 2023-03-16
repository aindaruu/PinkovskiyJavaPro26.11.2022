package com.hillel.pinkovskiy.homeworks.homework14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        FileData file1 = new FileData("file1.txt", 100, "/path/to/file");
        FileData file2 = new FileData("file2.txt", 200, "/path/to/file");
        navigator.add("/path/to/file", file1);
        navigator.add("/path/to/file", file2);

        List<FileData> files = navigator.find("/path/to/file");
        for (FileData file : files) {
            System.out.println(file.getName());
        }
        List<FileData> filteredFiles = navigator.filterBySize("/path/to/file", 150);
                for (FileData file : filteredFiles) {
                    System.out.println(file.getName());
                }
                navigator.remove("/path/to/file");
                List<FileData> sortedFiles = navigator.sortBySize();
                for (FileData file : sortedFiles) {
                    System.out.println(file.getName() + "" + file.getSize());
                }
    }
}
