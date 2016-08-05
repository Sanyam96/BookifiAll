package com.example.sanyam.bookifyall;

import java.util.ArrayList;

/**
 * Created by sanyam on 29/7/16.
 */
public class CategoriesResponse {
    String categories;
    ArrayList<perCategoriesData> mPerCategoriesData;

    public CategoriesResponse(String categories, ArrayList<perCategoriesData> mPerCategoriesData) {
        this.categories = categories;
        this.mPerCategoriesData = mPerCategoriesData;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public ArrayList<perCategoriesData> getmPerCategoriesData() {
        return mPerCategoriesData;
    }

    public void setmPerCategoriesData(ArrayList<perCategoriesData> mPerCategoriesData) {
        this.mPerCategoriesData = mPerCategoriesData;
    }
}
