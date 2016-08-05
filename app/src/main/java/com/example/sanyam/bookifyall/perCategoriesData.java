package com.example.sanyam.bookifyall;

/**
 * Created by sanyam on 29/7/16.
 */
public class perCategoriesData {
    int id;
    String name;

    public perCategoriesData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
