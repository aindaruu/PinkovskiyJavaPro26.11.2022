package com.hillel.pinkovskiy.homeworks.homework13.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addRecord(new Record("Tom", "+67551234"));
        phoneBook.addRecord(new Record("Boris", "+15425678"));
        phoneBook.addRecord(new Record("John", "+09559012"));

        Record foundRecord = phoneBook.findRecord("Tom");
        if (foundRecord != null) {
            System.out.println(foundRecord.getPhoneNumber());
        }

        List<Record> foundRecords = phoneBook.findAllRecords("Tom");
        if (foundRecords != null) {
            for (Record record : foundRecords) {
                System.out.println(record.getPhoneNumber());
            }
        }
    }
}
