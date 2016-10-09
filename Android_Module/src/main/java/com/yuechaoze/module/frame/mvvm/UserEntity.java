package com.yuechaoze.module.frame.mvvm;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by zhangzeyan on 16/9/28.
 */

public class UserEntity {

    private String userface;
    private String username;
    private String nickname;
    private int age;


    public UserEntity() {
    }

    public UserEntity(String userface, String username, String nickname, int age) {
        this.userface = userface;
        this.username = username;
        this.nickname = nickname;
        this.age = age;
    }

    @BindingAdapter("bind:userfaceabc")
    public static void getInternetImage(ImageView iv, String userface) {
        Picasso.with(iv.getContext()).load(userface).into(iv);
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
