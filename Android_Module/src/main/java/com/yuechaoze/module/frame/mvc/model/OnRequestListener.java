package com.yuechaoze.module.frame.mvc.model;

import java.util.List;

/**
 * 请求回调
 * Created by zhangzeyan on 16/9/28.
 */

public interface OnRequestListener {

    void onSuccess(List<String> data);
}
