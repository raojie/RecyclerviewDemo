package com.raoj.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Method: RecyclerViewHolder
 * Decription:
 * Author: raoj
 * Date: 2018/2/11
 **/
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView tvName;
    public ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
//        imageView = (ImageView) itemView.findViewById(R.id.iv);
        tvName = (TextView) itemView.findViewById(R.id.tvName);
    }
}
