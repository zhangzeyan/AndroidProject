package com.yuechaoze.module.request.retrofit.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.yuechaoze.module.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.zhy.http.okhttp.OkHttpUtils.TAG;

/**
 * Created by zhangzeyan on 16/10/8.
 */

public class RetrofitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://demo.zhixueyun.com/zxy-adapter-new/user/loadSiteAddr/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        IUserBiz userBiz = retrofit.create(IUserBiz.class);
      //  Call<List<ConfiguerResultBean>> call = userBiz.getUsers();

//

        Call<List<String>> call = userBiz.addUser(new User("zhangzeyan","Android 4.3","NyWYiW4LjsA=","SM-N9008V","6","知学云"));


        call.enqueue(new Callback<List<String>>()
        {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response)
            {
                Log.e(TAG, "normalGet:" + response.body() + "");
                Toast.makeText(RetrofitActivity.this,"成功",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t)
            {
                Toast.makeText(RetrofitActivity.this,"出错",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
