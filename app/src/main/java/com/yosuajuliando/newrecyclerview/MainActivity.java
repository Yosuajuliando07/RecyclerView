package com.yosuajuliando.newrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> lstStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstStudent = new ArrayList<>();
        lstStudent.add(new Student("Yosua Juliando", "H1101171049", R.drawable.yosua));
        lstStudent.add(new Student("mulvi", "H1101171050", R.drawable.mulvi));
        lstStudent.add(new Student("raden", "H1101171041", R.drawable.raden));
        lstStudent.add(new Student("nur", "H1101171042", R.drawable.nur));
        lstStudent.add(new Student("jody", "H1101171046", R.drawable.jody));
        lstStudent.add(new Student("jonathan", "H1101171043", R.drawable.jonathan));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        StudentAdapter myAdapter = new StudentAdapter(this, lstStudent);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
    }
}
