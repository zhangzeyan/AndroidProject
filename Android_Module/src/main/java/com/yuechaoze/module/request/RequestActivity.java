package com.yuechaoze.module.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuechaoze.module.R;
import com.yuechaoze.module.request.asynchttp.activity.AsyncHttpActivity;
import com.yuechaoze.module.request.okhttp.activity.OkhttpActivity;
import com.yuechaoze.module.request.retrofit.activity.RetrofitActivity;
import com.yuechaoze.module.request.volley.activity.VolleyActivity;

/**
 * Created by zhangzeyan on 16/10/7.
 */
public class RequestActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yrequest);
    }

    public void asynchttpClick(View view) {
        Intent intent = new Intent(this, AsyncHttpActivity.class);
        startActivity(intent);
    }

    public void okhttpClick(View view) {
        Intent intent = new Intent(this, OkhttpActivity.class);
        startActivity(intent);
    }


    public void retrofitClick(View view) {
        Intent intent = new Intent(this, RetrofitActivity.class);
        startActivity(intent);
    }

    public void volleyClick(View view) {
        Intent intent = new Intent(this, VolleyActivity.class);
        startActivity(intent);
    }
}
