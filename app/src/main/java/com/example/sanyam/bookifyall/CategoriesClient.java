package com.example.sanyam.bookifyall;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sanyam on 29/7/16.
 */
public class CategoriesClient {

    private static CategoriesApiClientInterface services;

    public static CategoriesApiClientInterface getServices;

    if( services == null ){
        OkHttpClient client = new OkHttpClient.Builder().build();

        Retrofit r = new Retrofit.Builder().baseUrl("https://api.wattpad.com/v4").
                addConverterFactory(GsonConverterFactory.create(
                        new GsonBuilder().create())).client(client)
                .build();

        services = r.create(CategoriesApiClientInterface.class);

    }

}
