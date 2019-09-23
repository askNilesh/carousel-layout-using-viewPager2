package com.nilu.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvName.setText(String.format("Row number  %d ", position));

        if (position % 2 == 0) {
            holder.imgBanner.setBackgroundColor(Color.RED);
        } else {
            holder.imgBanner.setBackgroundColor(Color.GREEN);
        }
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgBanner;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            imgBanner = itemView.findViewById(R.id.imgBanner);
        }
    }
}
