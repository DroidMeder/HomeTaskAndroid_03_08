package com.example.hometaskandroid_03_08.models;

public class FirstFrag extends JustClass{
    private final int path;
    private final String status;
    private final String  name;

    public FirstFrag(int path, String status, String name) {
        this.path = path;
        this.status = status;
        this.name = name;
    }

    public int getPath() {
        return path;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
