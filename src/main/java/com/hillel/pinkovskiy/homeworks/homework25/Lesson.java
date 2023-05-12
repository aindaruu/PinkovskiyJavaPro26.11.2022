package com.hillel.pinkovskiy.homeworks.homework25;

public class Lesson {
    private Long id;
    private String name;
    private Homework homework;

    public Lesson() {
        this.name = name;
        this.homework = homework;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }
}
