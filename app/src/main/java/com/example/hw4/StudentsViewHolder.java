package com.example.hw4;
import android.view.View;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    private TextView firstName;
    private TextView lastName;
    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName=itemView.findViewById(R.id.firstName);
        lastName=itemView.findViewById(R.id.lastName);
    }
public TextView getFirstName() {return firstName;}
public  TextView getLastName(){return lastName;}
}
