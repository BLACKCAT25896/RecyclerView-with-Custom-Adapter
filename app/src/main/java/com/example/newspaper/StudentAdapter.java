package com.example.newspaper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private ArrayList<Student> studentList;

    public StudentAdapter(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       View itemView =  LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_student_layout,viewGroup,false);



        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder viewHolder, int i) {

        Student currentStudent =  studentList.get(i);
        viewHolder.nameTV.setText(currentStudent.getName());
        viewHolder.idTV.setText(currentStudent.getId());
        viewHolder.batchTV.setText("Batch : " + currentStudent.getBatch());
        viewHolder.deptTV.setText("Dept : " + currentStudent.getDept());
        viewHolder.mobileNumberTV.setText("Cell : " + currentStudent.getMobileNumber());
        viewHolder.profileImageV.setImageResource(currentStudent.getProfileImage());




    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTV, idTV, batchTV, deptTV, mobileNumberTV;
        private ImageView profileImageV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.nameTV);
            idTV = itemView.findViewById(R.id.idTV);
            batchTV = itemView.findViewById(R.id.batchTV);
            deptTV = itemView.findViewById(R.id.deptTV);
            mobileNumberTV = itemView.findViewById(R.id.mobileNumberTV);
            profileImageV = itemView.findViewById(R.id.profileImageIV);





        }
    }
}
