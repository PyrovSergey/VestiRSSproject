package com.test.vestirssproject.model;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by pyrov on 20.03.2018.
 */

public class App extends Application {
    private static VestiApi vestiApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.vesti.ru")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        vestiApi = retrofit.create(VestiApi.class);
    }

    public static VestiApi getVestiApi() {
        return vestiApi;
    }
}
