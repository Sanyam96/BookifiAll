package com.example.sanyam.bookifyall;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sanyam on 29/7/16.
 */
public interface CategoriesApiClientInterface {

    @GET("categories")
    Call<CategoriesResponse>
}
