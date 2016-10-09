package com.yuechaoze.module.frame.mvp.view;

import java.util.List;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public interface MvpView {

    //显示loading progress
    void showLoading();
    //隐藏loading progress
    void hideLoading();
    //ListView的初始化
    void setListItem(List<String> data);
    //Toast 消息
    void showMessage(String message);
}
