package com.test.vestirssproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.vestirssproject.model.App;
import com.test.vestirssproject.model.Rss;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getRequest();
    }

    private void getRequest() {
        App.getVestiApi().getDataVestiRSS().enqueue(new Callback<Rss>() {
            @Override
            public void onResponse(Call<Rss> call, Response<Rss> response) {
                Log.e("MyTAG", "RSS responce: " + response.body().toString());
            }

            @Override
            public void onFailure(Call<Rss> call, Throwable t) {
                Log.e("MyTAG", "Error RSS: " + t.getMessage());
            }
        });
    }
}
