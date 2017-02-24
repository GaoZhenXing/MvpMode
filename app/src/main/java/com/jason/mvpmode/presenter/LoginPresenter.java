package com.jason.mvpmode.presenter;

import android.os.Handler;
import android.view.View;

import com.jason.mvpmode.bean.User;
import com.jason.mvpmode.model.IUserBiz;
import com.jason.mvpmode.model.OnLoginListener;
import com.jason.mvpmode.model.UserBiz;
import com.jason.mvpmode.view.ILoginView;


/**
 * 项目名称：MvpMode
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/23.19:39
 */

public class LoginPresenter implements ILoginPresenter {
    private IUserBiz userBiz;
    private ILoginView loginView;


    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;

        userBiz = new UserBiz();
    }

    @Override
    public void doLogin() {
        loginView.onSetProgressBarVisibility(View.VISIBLE);
        userBiz.doLogin(loginView.getUser(), new OnLoginListener() {
            @Override
            public void onLoginSuccess(User user) {
                loginView.onSetProgressBarVisibility(View.GONE);
                loginView.onLoginSuccess(user);
            }

            @Override
            public void onLoginFail(String msg) {
                loginView.onSetProgressBarVisibility(View.GONE);
                loginView.onLoginFail(msg);
            }
        });

    }

    @Override
    public void clearText() {
        loginView.onClearText();
    }
}
