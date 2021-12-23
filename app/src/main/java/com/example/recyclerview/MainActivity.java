package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Student> studentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter();
    }

    private void setListAdapter() {
        Student s0=new Student("1", "Leena", "Female", R.drawable.f);
        Student s1=new Student("2", "Peeter", "Male", R.drawable.m);
        Student s2=new Student("3", "Roozi", "Female",R.drawable.f);
        Student s3=new Student("4", "Hiba", "Female", R.drawable.f);
        Student s4=new Student("5", "Burhan", "Male", R.drawable.m);
        Student s5=new Student("1", "Leena", "Female",R.drawable.f);
        Student s6=new Student("2", "Peeter", "Male",R.drawable.m);
        Student s7=new Student("3", "Roozi", "Female",R.drawable.f);
        Student s8=new Student("4", "Hiba", "Female", R.drawable.f);
        Student s9=new Student("5", "Burhan", "Male", R.drawable.m);
        Student s10=new Student("1", "Leena", "Female",R.drawable.f);
        Student s11=new Student("2", "Peeter", "Male",R.drawable.m);
        Student s12=new Student("3", "Roozi", "Female",R.drawable.f);
        Student s13=new Student("4", "Hiba", "Female", R.drawable.f);


        studentList.addAll(Arrays.asList(new Student[]{s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13}));
        recyclerView = findViewById(R.id.recycleView);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(studentList,MainActivity.this) {

        };

        recyclerView.setAdapter(adapter);
    }


}