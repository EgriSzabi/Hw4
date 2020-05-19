package com.example.hw4;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.graphics.Color.rgb;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {

    private List<Student> students;

    public StudentsAdapter(List<Student> students){this.students=students;}
    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentsViewHolder(studentItem);
    }

    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
            Student currentStudent=students.get(position);
            if (position%2==1) {
                holder.itemView.setBackgroundColor(rgb(245,245,245));
            }
            holder.getFirstName().setText(currentStudent.getFirstName());
            holder.getLastName().setText(currentStudent.getLastName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
