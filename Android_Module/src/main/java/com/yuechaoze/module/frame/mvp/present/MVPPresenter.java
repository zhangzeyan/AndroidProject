package com.yuechaoze.module.frame.mvp.present;

import android.os.Handler;
import android.os.Looper;

import com.yuechaoze.module.frame.mvp.view.MvpView;
import com.yuechaoze.module.frame.mvp.model.OnRequestListener;
import com.yuechaoze.module.frame.mvp.model.RequestBiz;
import com.yuechaoze.module.frame.mvp.model.RequestBiziml;

import java.util.List;

/**
 * Presenter层
 * Created by zhangzeyan on 16/9/28.
 */

public class MVPPresenter {

    private MvpView mvpView;
    RequestBiz requestBiz;
    private Handler mHandler;

    public MVPPresenter(MvpView mvpView) {
        this.mvpView = mvpView;
        requestBiz = new RequestBiziml();
        mHandler = new Handler(Looper.getMainLooper());
    }

    public void requestForData(){
        mvpView.showLoading();
        requestBiz.requestForData(new OnRequestListener() {
            @Override
            public void onSuccess(final List<String> data) {
                //由于请求开启了新线程，所以用handler去更新界面
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mvpView.hideLoading();
                        mvpView.setListItem(data);
                    }
                });

            }

            @Override
            public void onFailed() {
                mvpView.showMessage("请求失败");
            }
        });
    }

    public void onItemClick(int position){
        mvpView.showMessage("点击了item"+position);
    }

    //presenter中添加mvpView 置为null的方法
    public void onDestroy(){
        mvpView = null;
    }
}
