package com.library.frame.include.http.okhttp;

import android.util.Log;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 请求网络数据
 * Created by zhangzeyan on 16/3/17.
 */
public class RequestData {

    public static void Post(final String strParam){

    }


    public static void Post(final RequestParam requestParam){
        Post(requestParam,null);
    }


    /**
     * Post请求方式
     *
     * @param requestParam 请求参数
     * @param callBack     回调操作
     */
    public static void Post(final RequestParam requestParam, final ResponseCallBack callBack) {

        String requestUrl = requestParam.getUrl();
        Log.i("RequestUrl : ", requestUrl); //打印请求的链接

        String jsonParam = RequestParse.toJson(requestParam);
        Log.i("ResponseParam : ", jsonParam); //打印请求的参数

        OkHttpUtils
                .post()
                .url(requestUrl)
                .addHeader(RequestConfigure.headerKey, RequestConfigure.headerValue)
                .addParams(RequestConfigure.paramsKey, jsonParam)
                .build()
                .execute(new Callback() {
                    @Override
                    public Object parseNetworkResponse(Response response) throws Exception {
                        String strResponse = response.body().string();
                        Log.d("ResponseData", strResponse); //打印成功返回的json
                        return null;
                    }

                    @Override
                    public void onError(Call call, Exception e) {
                        Log.e("ResponseError : ", e.getMessage()); //打印错误日志
                        if (callBack != null)
                            callBack.failResponse();
                    }

                    @Override
                    public void onResponse(Object response) {
                        if (callBack != null)
                            callBack.successResponse(response);
                    }
                });
    }

}
