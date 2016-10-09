package com.yuechaoze.module.request.okhttp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.yuechaoze.module.R;
import com.yuechaoze.module.request.okhttp.lib.RequestData;
import com.yuechaoze.module.request.okhttp.lib.ResponseCallBack;

/**
 * Created by zhangzeyan on 16/10/7.
 */
public class OkhttpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);


        RequestData.Post(new ConfiguerRequestParam("知学云"),
                new ResponseCallBack() {
            @Override
            public void successResponse(Object object) {
                ConfiguerResultBean loginResultBean = (ConfiguerResultBean) object;
                ((TextView)findViewById(R.id.resultTxt)).setText(loginResultBean.toString());
            }

            @Override
            public void failResponse() {

            }
        });
    }
}
