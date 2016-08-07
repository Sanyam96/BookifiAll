package com.example.sanyam.bookifyall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<perCategoriesData> mData;
    perCategoriesDataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO basic UI

        mData = new ArrayList<>();

        CategoriesApiClientInterface apiService = CategoriesClient.getServices();
        Call<CategoriesResponse> call = apiService.getCategories();

        call.enqueue(new Callback<CategoriesResponse>() {
            @Override
            public void onResponse(Call<CategoriesResponse> call, Response<CategoriesResponse> response) {
                if(response.isSuccessful()){
                    ArrayList<perCategoriesData> categoriesData = response.body().getmPerCategoriesData();

                    if( categoriesData == null){
                        return;
                    }
                    mData.clear();
                    for (perCategoriesData p : categoriesData){
                        mData.add(p);
                    }
                    //adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<CategoriesResponse> call, Throwable t) {

            }
        });

    }
}
