package com.example.foodapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // inisialisasi
    private RecyclerView recyclerView;
    private foodAdapter foodAdapter;
    private ArrayList<food> foodArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// panggil method
        addFood();

//        mengakses recycle view
        recyclerView = findViewById(R.id.reyView);
//        atur adapter
        foodAdapter = new foodAdapter(foodArrayList);
//        atur layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
//        atur adapter
        recyclerView.setAdapter(foodAdapter);
    }

    public void addFood() {
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new food("soto", "@samsulAdi", "Jatitngger", R.drawable.sate));
        foodArrayList.add(new food("bakso", "@Adi01", "Jateng", R.drawable.sate));
        foodArrayList.add(new food("soto", "@samsulAdi", "Jatitngger", R.drawable.sate));
        foodArrayList.add(new food("bakso", "@Adi01", "Jateng", R.drawable.sate));

    }
}
