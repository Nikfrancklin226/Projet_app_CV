package com.example.cvemploiandroid.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cvemploiandroid.R;

public class UsersHolder extends RecyclerView.ViewHolder {

    TextView name, email, address, phone, speciality, Level_of_studies,Professionnal_Experience,age;

    public UsersHolder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.usersListItem_name);
        email=itemView.findViewById(R.id.usersListItem_email);
        address=itemView.findViewById(R.id.usersListItem_address);
        phone=itemView.findViewById(R.id.usersListItem_phone);
        speciality=itemView.findViewById(R.id.usersListItem_Speciality);
        Level_of_studies=itemView.findViewById(R.id.usersListItem_level_of_studies);
        Professionnal_Experience=itemView.findViewById(R.id.usersListItem_professionnal_Experience);
        age=itemView.findViewById(R.id.usersListItem_age);

    }
}
