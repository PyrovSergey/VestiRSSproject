package com.test.vestirssproject.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pyrov on 20.03.2018.
 */

public interface VestiApi {
    @GET("/vesti.rss")
    Call<Rss> getDataVestiRSS();
}
