package com.example.pc.resepmakananfauzi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Data extends AppCompatActivity {

    ImageView citra;
    TextView perintah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Intent in = getIntent();

        citra = (ImageView) findViewById(R.id.data_image);
        citra.setImageResource(in.getIntExtra("gambar",0));

        perintah = (TextView) findViewById(R.id.perintah);
        perintah.setText(in.getStringExtra("langkah"));

        getSupportActionBar().setTitle(in.getStringExtra("judul"));
    }
}