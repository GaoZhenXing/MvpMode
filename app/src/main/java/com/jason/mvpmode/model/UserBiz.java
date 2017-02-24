package com.jason.mvpmode.model;

import android.os.Handler;
import android.view.View;

import com.jason.mvpmode.bean.User;

/**
 * 项目名称：MvpMode
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/24.16:32
 */

public class UserBiz implements IUserBiz {


    @Override
    public void doLogin(final User user, final OnLoginListener onLoginListener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user == null || (user.getPassword().equals("") && user.getName().equals(""))) {
                    onLoginListener.onLoginFail("用户名密码不能为空");
                } else if (user.getName().equals("zxgao") && user.getPassword().equals("123456")) {
                    onLoginListener.onLoginSuccess(user);
                } else {
                    onLoginListener.onLoginFail("用户名或密码错误");
                }
            }
        }, 1000);
    }
}
