package com.yuechaoze.module.request.okhttp.lib;

/**
 * 请求参数
 * Created by zhangzeyan on 16/3/20.
 */
public abstract class RequestParam {

    /**
     * 获取请求链接
     * @return
     */
    public abstract String getUrl();

    /**
     * 获取返回实体类
     * @return
     */
    public abstract Class<?> getResultBean();

}
