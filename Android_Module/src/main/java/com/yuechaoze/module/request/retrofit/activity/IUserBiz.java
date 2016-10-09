package com.yuechaoze.module.request.retrofit.activity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by zhangzeyan on 16/10/8.
 */

public interface IUserBiz {

//    @GET("users")
//    Call<List<ConfiguerResultBean>> getUsers();
//
//    @GET("{username}")
//    Call<ConfiguerResultBean> getUser(@Path("username") String username);
//
//    @GET("users")
//    Call<List<ConfiguerResultBean>> getUsersBySort(@Query("sortby") String sort);


    @POST("json")
    Call<List<String>> addUser(@Body User user);

}
