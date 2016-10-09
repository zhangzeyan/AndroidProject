package com.yuechaoze.module.frame.mvvm.model;

import com.yuechaoze.module.frame.mvvm.Food2;

import java.util.List;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public interface OnRequestListener {

    void onSuccess(List<Food2> data);
    void onFailed();
}
