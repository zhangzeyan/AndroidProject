package com.yuechaoze.module.frame.mvc.model;


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
                    ArrayList<String> data = new ArrayList<String>();
                    for(int i = 1 ; i< 8 ; i++){
                        data.add("item"+i);
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
