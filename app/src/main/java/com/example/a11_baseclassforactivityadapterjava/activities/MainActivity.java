package com.example.a11_baseclassforactivityadapterjava.activities;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.a11_baseclassforactivityadapterjava.R;
import com.example.a11_baseclassforactivityadapterjava.User;
import com.example.a11_baseclassforactivityadapterjava.adapters.UserAdapter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        userArrayList = new ArrayList<>();
        baseAdapter = new UserAdapter(this, userArrayList);


        for (int i = 0; i < 50; i++) {
            userArrayList.add(new User("James"));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(baseAdapter);
    }


}