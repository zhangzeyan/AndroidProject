package com.yuechaoze.module.request.okhttp.activity;

/**
 * Created by zhangzeyan on 16/10/7.
 */

public class ConfiguerResultBean {


    /**
     * siteAddr : http://demo.zhixueyun.com/zxy-mobile-new
     */

    private DataEntity data;
    /**
     * data : {"siteAddr":"http://demo.zhixueyun.com/zxy-mobile-new"}
     * code : 0000
     * msg : 操作成功
     */

    private String code;
    private String msg;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataEntity {
        private String siteAddr;

        public String getSiteAddr() {
            return siteAddr;
        }

        public void setSiteAddr(String siteAddr) {
            this.siteAddr = siteAddr;
        }
    }

    @Override
    public String toString() {
        return "ConfiguerResultBean{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
