package com.yuechaoze.module.request.okhttp.lib;

/**
 * 回调操作
 * Created by zhangzeyan on 16/3/21.
 */
public interface ResponseCallBack {

    /**
     * 请求成功，响应成功回调操作
     *
     * @param object
     */
    void successResponse(Object object);


    /**
     * 请求失败回调操作
     */
    void failResponse();
}
