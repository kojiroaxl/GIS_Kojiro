package com.example.giskojiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama, dataalamat, datatlfn;
        Button btncall;
        ImageView datagambar, datagambar1;

        public static String id,nama,alamat,tlfn,gambar,gambar1;
        public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama = findViewById(R.id.tv_nama);
        dataalamat = findViewById(R.id.tv_alamat);
        datatlfn = findViewById(R.id.tv_notlfn);
        btncall = findViewById(R.id.btn_call);
        datagambar = findViewById(R.id.image_data);
        datagambar1 = findViewById(R.id.image_data1);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatlfn.setText(tlfn);
        Picasso.get().load(gambar).into(datagambar);
        Picasso.get().load(gambar1).into(datagambar1);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+tlfn));
        startActivity(call);
    }
}