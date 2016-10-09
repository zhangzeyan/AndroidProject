package com.yuechaoze.module.request.volley.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.yuechaoze.module.R;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangzeyan on 16/10/8.
 */

public class VolleyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_volley);

        RequestQueue mQueue = Volley.newRequestQueue(this);


//        StringRequest stringRequest = new StringRequest(Request.Method.POST,"http://demo.zhixueyun.com/zxy-adapter-new/user/loadSiteAddr",
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.d("TAG", response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.e("TAG", error.getMessage(), error);
//                    }
//                }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> map = new HashMap<String, String>();
//                map.put("json", "{\"company_name\":\"知学云\"}");
//                return map;
//            }
//        };
//
//        mQueue.add(stringRequest);


        Map<String, String> map = new HashMap<>();
        map.put("json", "{\"company_name\":\"知学云\"}");
        JSONObject object = new JSONObject(map);

//        JSONObject object1 = new JSONObject();
//        JSONObject object = new JSONObject();
//        try {
//            object1.put("company_name","知学云");
//            object.put("json",object1);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        final String mRequestBody = appendParameter("http://demo.zhixueyun.com/zxy-adapter-new/user/loadSiteAddr",map);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                "http://demo.zhixueyun.com/zxy-adapter-new/user/loadSiteAddr", object,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        }){
            //JsonObjectRequest不能使用getParams
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> map = new HashMap<String, String>();
//                map.put("json", "{\"company_name\":\"知学云\"}");
//                return map;
//            }

            @Override
            public String getBodyContentType() {
                return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
            }

            @Override
            public byte[] getBody() {
                try {
                    return mRequestBody == null ? null : mRequestBody.getBytes(PROTOCOL_CHARSET);
                } catch (UnsupportedEncodingException uee) {
                    VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                            mRequestBody, PROTOCOL_CHARSET);
                    return null;
                }
            }
        };

        mQueue.add(jsonObjectRequest);
    }

    private String appendParameter(String url,Map<String,String> params){
        Uri uri = Uri.parse(url);
        Uri.Builder builder = uri.buildUpon();
        for(Map.Entry<String,String> entry:params.entrySet()){
            builder.appendQueryParameter(entry.getKey(),entry.getValue());
        }
        return builder.build().getQuery();
    }
}
