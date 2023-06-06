package com.adrianleslymaking202102324.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {

    public ImageView _imageView1;
    public TextView _deskripsiTextView;
    public TextView _namaTextView;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageView1 = itemView.findViewById(R.id.imageView1);
        _namaTextView = itemView.findViewById(R.id.NamaTextView);
        _deskripsiTextView = itemView.findViewById(R.id.DeskripsiTextView);
    }

}