package com.yuechaoze.module.frame.mvp.model;

import java.util.List;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public interface OnRequestListener {

    void onSuccess(List<String> data);
    void onFailed();
}
