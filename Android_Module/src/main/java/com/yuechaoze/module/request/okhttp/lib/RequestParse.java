package com.yuechaoze.module.request.okhttp.lib;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求数据中Gson转化类
 *  Created by zhangzeyan on 16/3/20.
 */
public class RequestParse {


    /**
     * 将对象转化成json
     * @param object
     * @return
     */
    public static String toJson(Object object){
        try{
           return new Gson().toJson(object);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将json解析成对象
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T toBean(String jsonString, Class<T> cls) {
        T t = null;
        try {
            t = new Gson().fromJson(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 将json解析成集合
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> toListBean(String jsonString, Class<T> cls) {
        ArrayList<T> mList = new ArrayList<T>();

        try {
            JsonArray array = new JsonParser().parse(jsonString).getAsJsonArray();
            Gson mGson = new Gson();
            for(final JsonElement elem : array){
                mList.add(mGson.fromJson(elem, cls));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mList;
    }

}
