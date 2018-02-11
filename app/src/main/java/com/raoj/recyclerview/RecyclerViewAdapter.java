package com.raoj.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Method: RecyclerViewAdapter
 * Decription:自定义RecyclerView适配器
 * Author: raoj
 * Date: 2018/2/11
 **/
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private Context mContext;
    private List<HomeItems> mDatas;//数据

    public RecyclerViewAdapter(Context context, List<HomeItems> datas) {//构造方法
        mDatas = datas;
        mContext = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { /*加载视图*/
        //一定要加false，不然报错
        View mView = LayoutInflater.from(mContext).inflate(R.layout.layout_recyclerview_item, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(mView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {/*添加数据*/
        ViewGroup.LayoutParams params = holder.itemView.getLayoutParams();
        params.height = (position % 2 == 0 ? 2 : 3) * 100 + 60;   //设置左右视图为不同的高度
        holder.itemView.setLayoutParams(params);//仅仅改变高度
        HomeItems homeItems = mDatas.get(position);
        holder.tvName.setText(homeItems.getSign());
        holder.itemView.setTag(position);
//        holder.tvName.setText(homeItems.getPay());
//        holder.tvName.setText(homeItems.getInquiry());
    }

    @Override
    public int getItemCount() {/*列表数据总数*/
        return mDatas.size();
    }
}
