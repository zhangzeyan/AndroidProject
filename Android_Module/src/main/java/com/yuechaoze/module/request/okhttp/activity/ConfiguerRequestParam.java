package com.yuechaoze.module.request.okhttp.activity;

import com.yuechaoze.module.request.okhttp.lib.RequestParam;

/**
 * Created by zhangzeyan on 16/10/7.
 */

public class ConfiguerRequestParam extends RequestParam {

    private String company_name;

    public ConfiguerRequestParam(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String getUrl() {
        return "http://demo.zhixueyun.com/zxy-adapter-new/user/loadSiteAddr";
    }

    @Override
    public Class<?> getResultBean() {
        return ConfiguerResultBean.class;
    }
}
