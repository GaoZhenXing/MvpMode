package com.jason.mvpmode.model;

import com.jason.mvpmode.bean.User;

/**
 * 项目名称：MvpMode
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/24.16:34
 */

public interface OnLoginListener {
    void onLoginSuccess(User user);

    void onLoginFail(String msg);
}
