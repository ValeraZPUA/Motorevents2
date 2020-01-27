package com.procreation.motorevents;

import android.app.Application;

import com.procreation.motorevents.api.MotoreventsApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static MotoreventsApi motoreventsApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.motorevents.com.au/test_api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        motoreventsApi = retrofit.create(MotoreventsApi.class);
    }

    public static MotoreventsApi getApi() {
        return motoreventsApi;
    }
}
