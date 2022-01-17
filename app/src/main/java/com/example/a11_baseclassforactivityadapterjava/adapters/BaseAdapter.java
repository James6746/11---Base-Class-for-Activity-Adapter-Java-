package com.example.a11_baseclassforactivityadapterjava.adapters;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.User;
import com.example.a11_baseclassforactivityadapterjava.activities.MainActivity;

import java.util.ArrayList;

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<User> userArrayList;
    MainActivity mainActivity = new MainActivity();


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
