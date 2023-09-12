package com.example.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHoder> {
    private List<Cat> catList;
    public MyAdapter(List<Cat> catList){
        this.catList = catList;
    }
    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new MyViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        Cat cat = catList.get(position);
        holder.imageView.setImageResource(cat.getImageID());
        holder.textView.setText(cat.getName());
    }

    @Override
    public int getItemCount() {
        return catList.size();
    }

    class MyViewHoder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView imageView;
        private TextView textView;
        public MyViewHoder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagevNews);
            textView = itemView.findViewById(R.id.tvTitle);
            cardView = itemView.findViewById(R.id.rlNews);
        }
    }
}
