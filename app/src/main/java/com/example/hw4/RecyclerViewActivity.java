package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

private List<Student> students;
private RecyclerView recyclerViewStudents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        getStudents();
        recyclerViewStudents=findViewById(R.id.recyclerViewStudents);
        setLayoutManager(recyclerViewStudents);
        setAdapter(recyclerViewStudents);
    }

private void getStudents(){

        students= new ArrayList<>();
        Student student=null;
        for(int i=1; i<30; i++){
            student=new Student();
            student.setFirstName("FristName"+i);
            student.setLastName("LastName"+i);
            students.add(student);
        }
}
    private void setLayoutManager(RecyclerView recyclerViewStudents){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewStudents.setLayoutManager(linearLayoutManager);
    }
    private void setAdapter(RecyclerView recyclerViewStudents){
        StudentsAdapter studentsAdapter= new StudentsAdapter(students);
        recyclerViewStudents.setAdapter(studentsAdapter);
    }


}
