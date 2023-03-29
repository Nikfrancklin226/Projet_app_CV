package com.example.cvemploiandroid.model.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitServices {
    private Retrofit retrofit;

    public RetrofitServices() {
        initializeRetrofit();
    }
    private void initializeRetrofit() {
            retrofit=new Retrofit.Builder()
                    .baseUrl("http://192.168.1.4:8083")
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .build();
        }



    public Retrofit getRetrofit() {
        return retrofit;
    }
}
