package com.hillel.pinkovskiy.homeworks.homework14;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> filesMap;
    public FileNavigator() {
        filesMap = new HashMap<>();

    }
    public void add(String path, FileData fileData) {
        if (!filesMap.containsKey(path)) {
            filesMap.put(path, new ArrayList<>());
        }
        if (!path.equals(fileData.getPath())) {
            System.out.println("Помилка, шлях-ключ і шлях не співподають");
            return;
        }
        List<FileData> files = filesMap.get(path);
        if (!files.contains(fileData)) {
            files.add(fileData);
        }
    }
    public List<FileData> find(String path) {
        return filesMap.getOrDefault(path,new ArrayList<>());
    }
    public List<FileData> filterBySize(String path,long size) {
        List<FileData> result = new ArrayList<>();
        List<FileData> files = find(path);

        for (FileData file : files ) {
            if (file.getSize() <= size) {
                result.add(file);
            }
        }
        return result;

    }
    public void remove(String path) {
        filesMap.remove(path);

    }
    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> files : filesMap.values()) {

        }
        Collections.sort(result, Comparator.comparing(FileData::getSize));
        return result;
    }

}
