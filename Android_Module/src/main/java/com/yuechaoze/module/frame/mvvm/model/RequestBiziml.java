package com.yuechaoze.module.frame.mvvm.model;

import com.yuechaoze.module.frame.mvvm.Food2;

import java.util.ArrayList;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public class RequestBiziml implements RequestBiz {
    @Override
    public void requestForData(final OnRequestListener listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    ArrayList<Food2> data = new ArrayList<Food2>();
                    for(int i = 1 ; i< 8 ; i++){
                        Food2 food = new Food2();
                        food.setDescription("item"+i);
                        food.setKeywords("科学");
                        food.setImg("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
                        data.add(food);
                    }
                    if(null != listener){
                        listener.onSuccess(data);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
