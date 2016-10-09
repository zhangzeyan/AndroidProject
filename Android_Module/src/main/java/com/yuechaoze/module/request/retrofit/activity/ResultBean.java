package com.yuechaoze.module.request.retrofit.activity;

/**
 * Created by zhangzeyan on 16/10/8.
 */

public class ResultBean {


    /**
     * login_id : zhangzeyan
     * org_name : 移动组
     * company_id : 2b071844-dd94-4653-af21-ee1b20060d65
     * sid : 642b2d26-c4d8-4c96-aee1-0744fa6a66b8
     * head_photo : http://demo.zhixueyun.com/mstatic/http/M00/00/63/CqJoMVdVDS2EA4KpAAAAAEOJM8U014.jpg
     * progress_length : 90
     * domain_id : 8a22e8b151edc2b7015210ae77d55899
     * total_playtime : 80
     * my_id : 8a22e8b151edc2b70152110d05d659b9
     * skin_url : http://demo.zhixueyun.com/mstatic/unzip-content/00/18/CqHYwVaExK2EMdBGAAAAAGp3X3s622/skin/
     * email : zhangzeyan@zhixueyun.com
     * job_name :
     * skin_name : CqHYwVaExK2EMdBGAAAAAGp3X3s622
     * description : null
     * name : 张泽彦
     * referer : http://*.zhixueyun.com
     * unread_count : 8
     * mobile : null
     */

    private DataEntity data;
    /**
     * data : {"login_id":"zhangzeyan","org_name":"移动组","company_id":"2b071844-dd94-4653-af21-ee1b20060d65","sid":"642b2d26-c4d8-4c96-aee1-0744fa6a66b8","head_photo":"http://demo.zhixueyun.com/mstatic/http/M00/00/63/CqJoMVdVDS2EA4KpAAAAAEOJM8U014.jpg","progress_length":"90","domain_id":"8a22e8b151edc2b7015210ae77d55899","total_playtime":"80","my_id":"8a22e8b151edc2b70152110d05d659b9","skin_url":"http://demo.zhixueyun.com/mstatic/unzip-content/00/18/CqHYwVaExK2EMdBGAAAAAGp3X3s622/skin/","email":"zhangzeyan@zhixueyun.com","job_name":"","skin_name":"CqHYwVaExK2EMdBGAAAAAGp3X3s622","description":null,"name":"张泽彦","referer":"http://*.zhixueyun.com","unread_count":8,"mobile":null}
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
        private String login_id;
        private String org_name;
        private String company_id;
        private String sid;
        private String head_photo;
        private String progress_length;
        private String domain_id;
        private String total_playtime;
        private String my_id;
        private String skin_url;
        private String email;
        private String job_name;
        private String skin_name;
        private Object description;
        private String name;
        private String referer;
        private int unread_count;
        private Object mobile;

        public String getLogin_id() {
            return login_id;
        }

        public void setLogin_id(String login_id) {
            this.login_id = login_id;
        }

        public String getOrg_name() {
            return org_name;
        }

        public void setOrg_name(String org_name) {
            this.org_name = org_name;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getHead_photo() {
            return head_photo;
        }

        public void setHead_photo(String head_photo) {
            this.head_photo = head_photo;
        }

        public String getProgress_length() {
            return progress_length;
        }

        public void setProgress_length(String progress_length) {
            this.progress_length = progress_length;
        }

        public String getDomain_id() {
            return domain_id;
        }

        public void setDomain_id(String domain_id) {
            this.domain_id = domain_id;
        }

        public String getTotal_playtime() {
            return total_playtime;
        }

        public void setTotal_playtime(String total_playtime) {
            this.total_playtime = total_playtime;
        }

        public String getMy_id() {
            return my_id;
        }

        public void setMy_id(String my_id) {
            this.my_id = my_id;
        }

        public String getSkin_url() {
            return skin_url;
        }

        public void setSkin_url(String skin_url) {
            this.skin_url = skin_url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getJob_name() {
            return job_name;
        }

        public void setJob_name(String job_name) {
            this.job_name = job_name;
        }

        public String getSkin_name() {
            return skin_name;
        }

        public void setSkin_name(String skin_name) {
            this.skin_name = skin_name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public int getUnread_count() {
            return unread_count;
        }

        public void setUnread_count(int unread_count) {
            this.unread_count = unread_count;
        }

        public Object getMobile() {
            return mobile;
        }

        public void setMobile(Object mobile) {
            this.mobile = mobile;
        }
    }
}
