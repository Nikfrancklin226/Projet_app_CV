package com.example.cvemploiandroid.httpconfig;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cvemploiandroid.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class AddActivity extends AppCompatActivity {
    EditText nom, prenom, age, adresse, email, telephone, Specialite, NiveauEtude, experienceProfessionnelle;
    Button ajouter;
    ProgressDialog dialog;
    JSONParser parser = new JSONParser();
    int success;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        age = findViewById(R.id.age);
        adresse = findViewById(R.id.adresse);
        email = findViewById(R.id.email);
        telephone = findViewById(R.id.telephone);
        Specialite = findViewById(R.id.Specialite);
        NiveauEtude = findViewById(R.id.NiveauEtude);
        experienceProfessionnelle = findViewById(R.id.experienceprofessionnelle);
        ajouter = findViewById(R.id.add);

        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Add().execute();

            }
        });

    }

    class Add extends AsyncTask<String, String, String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(AddActivity.this);
            dialog.setMessage("Patientez SVP");
            dialog.show();


        }

        @Override
        protected String doInBackground(String... strings) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("nom", nom.getText().toString());
            map.put("prenom", prenom.getText().toString());
            map.put("age", age.getText().toString());
            map.put("adresse", adresse.getText().toString());
            map.put("email", email.getText().toString());
            map.put("telephone", telephone.getText().toString());
            map.put("Specialite", Specialite.getText().toString());
            map.put("NiveauEtude", NiveauEtude.getText().toString());
            map.put("experienceProfessionnelle", experienceProfessionnelle.getText().toString());


            JSONObject object=parser.makeHttpRequest(  "http://192.168.1.4/user/add.php", "GET",map);
            try {
                success = object.getInt("success");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            dialog.cancel();
            if(success==1){
                Toast.makeText(AddActivity.this, "Ajout effectué", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(AddActivity.this, "Echec !!!!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}