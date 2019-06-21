package com.example.newspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> studentList;
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        initRecyclerView();
        getStudentList();



    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(studentAdapter);
    }

    private void getStudentList() {
        Student student1  = new Student("kamrujjaman","CSE59","CSE","555B","01733415955",R.drawable.jaman_headshoot);
        Student student2  = new Student("Bannah","CSE59","CSE","666B","01733415955",R.drawable.bannah_portrat);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student1);
        studentList.add(student2);

        studentAdapter.notifyDataSetChanged();
    }

    private void init() {
        studentList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerviewStudentList);
        studentAdapter = new StudentAdapter(studentList);
    }
}
