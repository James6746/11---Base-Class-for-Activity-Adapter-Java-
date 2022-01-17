package com.example.a11_baseclassforactivityadapterjava.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a11_baseclassforactivityadapterjava.R;
import com.example.a11_baseclassforactivityadapterjava.User;
import com.example.a11_baseclassforactivityadapterjava.activities.MainActivity;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {

    public UserAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_user, parent, false);
        return new UserViewHolder(view);

    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = userArrayList.get(position);
        ((UserViewHolder) holder).userName.setText(user.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.showToast(context, position);
            }
        });

    }


    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


    static class UserViewHolder extends RecyclerView.ViewHolder {
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        TextView userName = itemView.findViewById(R.id.item_name);
    }

}
