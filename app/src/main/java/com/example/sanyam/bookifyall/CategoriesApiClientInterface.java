package com.example.sanyam.bookifyall;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by sanyam on 29/7/16.
 */
public interface CategoriesApiClientInterface {

    @Headers("Authorization : COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB")
    @GET("categories")
    Call<CategoriesResponse> getCategories();

    @GET("/stories")
    Call<StoriesResponse> getStories();
}
