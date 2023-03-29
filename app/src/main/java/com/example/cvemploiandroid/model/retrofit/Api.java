package com.example.cvemploiandroid.model.retrofit;

import com.example.cvemploiandroid.model.CvEntities;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("/appcv/all")
    public Call<ArrayList<CvEntities>> all();
}
