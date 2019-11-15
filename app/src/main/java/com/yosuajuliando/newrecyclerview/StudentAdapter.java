package com.yosuajuliando.newrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter <StudentAdapter.MyViewHolder> {

    private Context mContext;
    private List<Student> mData;


    public StudentAdapter(Context mContext, List<Student> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.student_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv_student_nama.setText(mData.get(position).getNama());
        holder.img_student_avatar.setImageResource(mData.get(position).getAvatar());
        //set Click
        holder.relativeLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //passing data ke StudentActivity(Detail)
                Intent intent = new Intent(mContext, StudentActivity.class);
                intent.putExtra("Nama", mData.get(position).getNama());
                intent.putExtra("Nim", mData.get(position).getNim());
                intent.putExtra("Avatar", mData.get(position).getAvatar());
                //Jalankan Activity
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_student_nama;
        ImageView img_student_avatar;
        RelativeLayout relativeLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            tv_student_nama = (TextView) itemView.findViewById(R.id.student_nama_id);
            img_student_avatar = (ImageView) itemView.findViewById(R.id.student_img_id);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relative_layout);


        }
    }
}
