package com.yuechaoze.module;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuechaoze.module.frame.FrameActivity;
import com.yuechaoze.module.request.RequestActivity;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void frameClick(View view){
        Intent intent = new Intent(this, FrameActivity.class);
        startActivity(intent);
    }


    public void netWorkClick(View view) {
        Intent intent = new Intent(this, RequestActivity.class);
        startActivity(intent);
    }
}
