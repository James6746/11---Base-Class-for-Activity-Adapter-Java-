package com.example.a11_baseclassforactivityadapterjava.activities;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.adapters.BaseAdapter;
import com.example.a11_baseclassforactivityadapterjava.User;

import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity {
    protected ArrayList<User> userArrayList;
    protected BaseAdapter baseAdapter;
    protected RecyclerView recyclerView;


    public void showToast(Context context, int position){
        Toast.makeText(context, position + "th item clicked!", Toast.LENGTH_SHORT).show();
    }
}
