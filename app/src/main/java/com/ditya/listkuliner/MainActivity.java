package com.ditya.listkuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Gulali",
                "Belakang udinus",
                "Makanan Paling enak waktu SD loh",
                R.drawable.gulali
        ));

        listKuliner.add(new Kuliner("Nasi Goreng",
                "Belakang udinus",
                "Makanan Paling enak waktu SD loh",
                R.drawable.nasgor
        ));

        listKuliner.add(new Kuliner("Rawon",
                "Belakang udinus",
                "Makanan Paling enak waktu SD loh",
                R.drawable.rawon
        ));

        listKuliner.add(new Kuliner("Rendang",
                "Belakang udinus",
                "Makanan Paling enak waktu SD loh",
                R.drawable.rendang
        ));

        listKuliner.add(new Kuliner("Tumpeng",
                "Belakang udinus",
                "Makanan Paling enak waktu SD loh",
                R.drawable.tumpeng
        ));
    }
}