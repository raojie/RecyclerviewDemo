package com.raoj.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_one;
    //    private RecyclerView.Adapter mAdapter;
    private RecyclerViewAdapter mAdapter;
    private List<String> homeItemsData;
    private LinearLayoutManager mLayoutManager;
    // 2 name1数组
    private String[] names = { "签到", "充值", "查询"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //开始设置RecyclerView
        recyclerView_one = (RecyclerView) this.findViewById(R.id.recyclerView_one);
        //设置固定大小
        recyclerView_one.setHasFixedSize(true);
//        //创建线性布局
//        mLayoutManager = new LinearLayoutManager(this);
//        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        //垂直方向
//        mLayoutManager.setOrientation(OrientationHelper.VERTICAL);
//        //给RecyclerView设置布局管理器
//        recyclerView_one.setLayoutManager(mLayoutManager);
        recyclerView_one.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        // 设置item动画
        recyclerView_one.setItemAnimator(new DefaultItemAnimator());
        //创建适配器，并且设置
        HomeItems homeItems = new HomeItems();
        homeItemsData = new ArrayList<String>();
//        for (int i=0;i<names.length;i++){
//            homeItems.setSign(names[i]);
//            homeItemsData.add(homeItems);
//        }
        homeItemsData.add("签到");
        homeItemsData.add("充值");
        homeItemsData.add("查询");
        homeItems.setSign("签到");
//        homeItemsData.add(homeItems);
        homeItems.setPay("充值");
//        homeItemsData.add(homeItems);
        homeItems.setInquiry("查询");
//        homeItemsData.add(homeItems);
        mAdapter = new RecyclerViewAdapter(getApplicationContext(), homeItemsData);
        recyclerView_one.setAdapter(mAdapter);

    }
}
