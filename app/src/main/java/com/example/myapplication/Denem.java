package com.example.myapplication;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class Denem implements Serializable {

    public Denem(String id, String name, int day,int month,int year) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getName() {
        return this.name;
    }


    private String id;
    private String name;
    private int day;
    private int month;
    private int year;
}