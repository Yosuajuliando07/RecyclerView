package com.yosuajuliando.newrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    private TextView tvnama, tvnim;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        tvnama = (TextView) findViewById(R.id.detail_student_nama_id);
        tvnim = (TextView) findViewById(R.id.detail_student_nim_id);
        img = (ImageView) findViewById(R.id.detail_student_img_id);

        Intent intent = getIntent();
        String Nama = intent.getExtras().getString("Nama");
        String Nim = intent.getExtras().getString("Nim");
        int Avatar = intent.getExtras().getInt("Avatar");

        //atur nilai
        tvnama.setText(Nama);
        tvnim.setText(Nim);
        img.setImageResource(Avatar);
    }
}
