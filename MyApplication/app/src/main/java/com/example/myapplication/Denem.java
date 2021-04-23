package com.example.myapplication;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class Denem implements Serializable {

    public Denem(String id, String name, int data) {
        this.id = id;
        this.data = data;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public int getData() {
        return data;
    }
    public String getName() {
        return this.name;
    }


    private String id;
    private String name;
    private int data;
}