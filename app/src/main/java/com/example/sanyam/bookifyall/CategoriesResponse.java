package com.example.sanyam.bookifyall;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sanyam on 29/7/16.
 */
public class CategoriesResponse {
    //String categories;
    @SerializedName("categories")
    ArrayList<perCategoriesData> mPerCategoriesData;

    public CategoriesResponse(ArrayList<perCategoriesData> mPerCategoriesData) {
        this.mPerCategoriesData = mPerCategoriesData;
    }

    public ArrayList<perCategoriesData> getmPerCategoriesData() {
        return mPerCategoriesData;
    }

    public void setmPerCategoriesData(ArrayList<perCategoriesData> mPerCategoriesData) {
        this.mPerCategoriesData = mPerCategoriesData;
    }
}
