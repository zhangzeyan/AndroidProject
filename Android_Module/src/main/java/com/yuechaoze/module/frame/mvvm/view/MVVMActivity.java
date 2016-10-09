package com.yuechaoze.module.frame.mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yuechaoze.module.R;
import com.yuechaoze.module.databinding.ActivityMvvmBinding;
import com.yuechaoze.module.frame.mvvm.UserEntity;


/**
 * Created by zhangzeyan on 16/9/28.
 */

public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding activityMainBinding =
        DataBindingUtil.setContentView(this, R.layout.activity_mvvm);

        UserEntity user = new UserEntity();
        user.setAge(26);
        user.setUsername("张泽彦");
        user.setNickname("雁在鹏城");
        user.setUserface("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
        activityMainBinding.setUser(user);
    }
}
