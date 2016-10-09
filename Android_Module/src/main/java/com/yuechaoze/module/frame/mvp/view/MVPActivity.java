package com.yuechaoze.module.frame.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.yuechaoze.module.R;
import com.yuechaoze.module.frame.mvp.present.MVPPresenter;

import java.util.List;

/**
 * MVP模式
 * Created by zhangzeyan on 16/9/28.
 */

public class MVPActivity extends Activity implements MvpView, AdapterView.OnItemClickListener {

    ListView mvpListView;
    MVPPresenter mvpPresenter;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        mvpListView = (ListView)findViewById(R.id.mListView);
        mvpListView.setOnItemClickListener(this);
        pb = (ProgressBar) findViewById(R.id.mLoading);

        mvpPresenter = new MVPPresenter(this);
        mvpPresenter.requestForData();
    }

    @Override
    public void showLoading() {
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        pb.setVisibility(View.GONE);
    }

    @Override
    public void setListItem(List<String> data) {
        ArrayAdapter adapter = new ArrayAdapter(MVPActivity.this,
                android.R.layout.simple_list_item_1,data);
        mvpListView.setAdapter(adapter);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mvpPresenter.onItemClick(position);
    }

    @Override
    protected void onDestroy() {
        mvpPresenter.onDestroy();
        super.onDestroy();
    }
}
