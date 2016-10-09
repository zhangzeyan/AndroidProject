package com.yuechaoze.module.frame.mvc.control;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.yuechaoze.module.R;
import com.yuechaoze.module.frame.mvc.model.OnRequestListener;
import com.yuechaoze.module.frame.mvc.model.RequestBiz;
import com.yuechaoze.module.frame.mvc.model.RequestBiziml;

import java.util.List;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public class MVCActivity extends Activity {

    private ListView mvcListView;
    private RequestBiz requestBiz;
    private Handler handler;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mvc);
        mvcListView = (ListView)findViewById(R.id.mListView);
        pb = (ProgressBar) findViewById(R.id.mLoading);
        pb.setVisibility(View.VISIBLE);
        handler = new Handler(Looper.getMainLooper());
        requestBiz = new RequestBiziml();

        requestBiz.requestForData(new OnRequestListener() {
            @Override
            public void onSuccess(final List<String> data) {
                //由于请求开启了新线程，所以用handler去更新界面
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.GONE);
                        ArrayAdapter adapter = new ArrayAdapter(MVCActivity.this,
                                android.R.layout.simple_list_item_1,data);
                        mvcListView.setAdapter(adapter);
                        mvcListView.setOnItemClickListener(itemClickListener);
                    }
                });

            }
        });
    }

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MVCActivity.this,"点击了item"+(position+1),Toast.LENGTH_SHORT).show();
        }
    };


}
