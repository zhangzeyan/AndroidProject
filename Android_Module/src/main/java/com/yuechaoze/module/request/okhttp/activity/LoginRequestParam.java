package com.yuechaoze.module.request.okhttp.activity;

import com.yuechaoze.module.request.okhttp.lib.RequestParam;

/**
 * Created by zhangzeyan on 16/10/8.
 */

public class LoginRequestParam extends RequestParam {

    private String login_id;
    private String appSystem;
    private String password;
    private String appMachine;
    private String client_type;
    private String company_name;

    public LoginRequestParam(String login_id, String appSystem, String password, String appMachine, String client_type, String company_name) {
        this.login_id = login_id;
        this.appSystem = appSystem;
        this.password = password;
        this.appMachine = appMachine;
        this.client_type = client_type;
        this.company_name = company_name;
    }

    @Override
    public String getUrl() {
        return "http://demo.zhixueyun.com/zxy-mobile-new/user/login";
    }

    @Override
    public Class<?> getResultBean() {
        return null;
    }
}
