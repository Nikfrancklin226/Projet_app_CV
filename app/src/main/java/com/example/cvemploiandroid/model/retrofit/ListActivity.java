package com.example.cvemploiandroid.model.retrofit;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cvemploiandroid.R;
import com.example.cvemploiandroid.adapter.CvAdapter;
import com.example.cvemploiandroid.model.CvEntities;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList<CvEntities> appcv = new ArrayList<CvEntities>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView) findViewById(R.id.listCv);
        chargerListe();
    }
    public void chargerListe(){

        //Création de l'objet Retrofit pour accéder à l'API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http:// 192.168.1.4:8083") //URL de base de l'API
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Crée une instance de l'interface Api,
        //qui définit les méthodes pour les appels HTTP.
        Api api = retrofit.create(Api.class);

        //creation d'un objet Call pour l'appel à la méthode login() de l'interface Api.
        Call<ArrayList<CvEntities>> call = api.all();

        call.enqueue(new Callback<ArrayList<CvEntities>>() {
            @Override
            public void onResponse(Call<ArrayList<CvEntities>> call, Response<ArrayList<CvEntities>> response) {
                if (response.isSuccessful()) {
                    Log.d("Response :", response.body().get(0).getEmail());
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        response.body().stream().forEach(cv -> appcv.add(cv));
                    }
                    CvAdapter adpt = new CvAdapter(ListActivity.this,appcv);
                    Log.d("Debbugage : " , appcv.get(0).getNom());
                    list.setAdapter(adpt);
                } else {
                    Log.d("error message exception", response.toString());

                }
            }

            @Override
            public void onFailure(Call<ArrayList<CvEntities>> call, Throwable t) {
                Log.d("Error : ", t.getMessage());
                //D/Error :: CLEARTEXT communication to 192.168.90.167 not permitted by network security policy
            }

        });


    }

}