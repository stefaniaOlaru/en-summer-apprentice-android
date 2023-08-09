package com.example.ticketmanagementsystem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<ModelClass> modelClassArrayList;
    Context context;

    public Adapter(ArrayList<ModelClass> modelClassArrayList, Context context) {
        this.modelClassArrayList = modelClassArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_design, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelClass modelClass = modelClassArrayList.get(position);
        holder.bind(modelClass);
        holder.itemView.setOnClickListener(v -> {
            boolean expanded = modelClass.isExpanded();
            modelClass.setExpanded(!expanded);
            notifyItemChanged(position);
        });
//        holder.tv_title.setText(modelClassArrayList.get(position).title);
//        holder.tv_desc.setText(modelClassArrayList.get(position).description);
//
//        boolean isVisible = modelClassArrayList.get(position).isVisible;
//        holder.itemView.setOnClickListener(view -> {
//            modelClassArrayList.get(position).isVisible = !isVisible;
//
//            notifyItemChanged(position);
//
//        });

    }



    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title;
        TextView tv_desc;
//        RelativeLayout rl_title_line;

        private View subItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_desc = itemView.findViewById(R.id.tv_desc);
//            rl_title_line = itemView.findViewById(R.id.rl_title_line);
            subItem = itemView.findViewById(R.id.sub_item);

//
//            if (isVisible) {
//                tv_desc.setVisibility(View.GONE);
//                rl_desc_line.setVisibility(View.GONE);
//                rl_title_line.setVisibility(View.VISIBLE);
//            } else {
//                tv_desc.setVisibility(View.VISIBLE);
//                rl_desc_line.setVisibility(View.VISIBLE);
//                rl_title_line.setVisibility(View.GONE);
//            }
//
        }

        private void bind(ModelClass modelClass){
            boolean expanded = modelClass.isExpanded();
            subItem.setVisibility(expanded ? View.VISIBLE : View.GONE);
            tv_title.setText(modelClass.getTitle());
            tv_desc.setText(modelClass.getDescription());

        }

    }
}
