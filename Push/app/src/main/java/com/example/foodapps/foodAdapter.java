package com.example.foodapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.foodViewHolder>{
//    menampung data
    private ArrayList<food>foodArrayList;

    public foodAdapter(ArrayList<food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    @NonNull
    @Override
    public foodAdapter.foodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.myitem,parent,false);
        return new foodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodAdapter.foodViewHolder holder, int position) {

        holder.judul.setText(foodArrayList.get(position).getJudul());
        holder.lokasi.setText(foodArrayList.get(position).getLokasi());
        holder.ig.setText(foodArrayList.get(position).getIg());
        holder.gambar.setImageResource(foodArrayList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
//        melakukan perulangan untuk menampilkan data hingga akhir
        return (foodArrayList != null)? foodArrayList.size():0;
    }

    public class foodViewHolder extends RecyclerView.ViewHolder {
//        variabel penampung data
        private TextView judul,lokasi,ig;
        private ImageView gambar;
        public foodViewHolder(@NonNull View itemView) {
            super(itemView);
//            ambil nilai dan letakkan pada variabel penampung
            judul = itemView.findViewById(R.id.judul);
            lokasi = itemView.findViewById(R.id.lokasi);
            ig = itemView.findViewById(R.id.ig);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
