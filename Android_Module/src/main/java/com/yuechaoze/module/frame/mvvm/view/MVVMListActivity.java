package com.yuechaoze.module.frame.mvvm.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

import com.yuechaoze.module.BR;
import com.yuechaoze.module.R;
import com.yuechaoze.module.frame.mvvm.Food2;
import com.yuechaoze.module.frame.mvvm.MyBaseAdapter;
import com.yuechaoze.module.frame.mvvm.model.OnRequestListener;
import com.yuechaoze.module.frame.mvvm.model.RequestBiz;
import com.yuechaoze.module.frame.mvvm.model.RequestBiziml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzeyan on 16/9/29.
 */


public class MVVMListActivity extends Activity {

    private List<Food2> foods;
    private ListView lv;

    RequestBiz requestBiz;

    private MyBaseAdapter<Food2> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm_list);


        lv = ((ListView) findViewById(R.id.mListView));

        foods = new ArrayList<>();

        adapter = new MyBaseAdapter<>(MVVMListActivity.this,
                R.layout.activity_mvvm_list_item, foods, BR.food);
        lv.setAdapter(adapter);


        requestBiz = new RequestBiziml();

        requestBiz.requestForData(new OnRequestListener() {
            @Override
            public void onSuccess(List<Food2> data) {
                foods.clear();
                foods.addAll(data);
                mHandler.sendEmptyMessage(0);
            }

            @Override
            public void onFailed() {
            }
        });

    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            adapter.notifyDataSetChanged();
        }
    };
}
