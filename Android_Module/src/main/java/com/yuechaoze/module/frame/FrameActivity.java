package com.yuechaoze.module.frame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuechaoze.module.R;
import com.yuechaoze.module.frame.mvc.control.MVCActivity;
import com.yuechaoze.module.frame.mvp.view.MVPActivity;
import com.yuechaoze.module.frame.mvvm.view.MVVMListActivity;

/**
 * 系统框架
 * Created by zhangzeyan on 16/9/28.
 */

public class FrameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yframe);
    }

    public void mvcClick(View view) {
        Intent intent = new Intent(this, MVCActivity.class);
        startActivity(intent);
    }

    public void mvpClick(View view) {
        Intent intent = new Intent(this, MVPActivity.class);
        startActivity(intent);
    }

    public void mvvmClick(View view) {
        Intent intent = new Intent(this, MVVMListActivity.class);
        startActivity(intent);
    }
}
