package com.example.myparcial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class productoAdapter extends RecyclerView.Adapter<productoAdapter.ViewHolder> {

    private final Context context;
    private final List<Producto> productoArrayList;

    public productoAdapter(Context context, List<Producto> productoArrayList) {
        this.context = context;
        this.productoArrayList = productoArrayList;
    }

    @NonNull
    @Override
    public productoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productoAdapter.ViewHolder holder, int position) {
        Producto producto = productoArrayList.get(position);
        holder.nombrexTV.setText(producto.getNombre());
        holder.descxTV.setText(producto.getDesc());
        holder.precioxTV.setText(producto.getPrecio());


    }

    @Override
    public int getItemCount() {
        return productoArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombrexTV;
        private final TextView descxTV;
        private final TextView precioxTV;
        private productoAdapter adapter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombrexTV = itemView.findViewById(R.id.nombrexTV);
            descxTV = itemView.findViewById(R.id.descxTV);
            precioxTV = itemView.findViewById(R.id.precioxTV);
            itemView.findViewById(R.id.delbtn).setOnClickListener(view ->{
                adapter.productoArrayList.remove(getAdapterPosition());
                adapter.notifyItemRemoved(getAdapterPosition());
            });

        }
    }
}
