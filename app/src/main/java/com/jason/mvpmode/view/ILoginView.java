package com.jason.mvpmode.view;

import com.jason.mvpmode.bean.User;

/**
 * 项目名称：MvpMode
 * 〈登录页面视图〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/23.17:45
 */

public interface ILoginView {
    /*
    清除账号和密码
     */
    void onClearText();

    User getUser();

    /*
    是否显示ProgressBar
     */
    void onSetProgressBarVisibility(int visibility);


    void onLoginSuccess(User user);

    void onLoginFail(String msg);
}
