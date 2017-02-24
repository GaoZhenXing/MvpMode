package com.jason.mvpmode.presenter;

import com.jason.mvpmode.bean.User;
import com.jason.mvpmode.model.OnLoginListener;

/**
 * 项目名称：MvpMode
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * 创建人：JasonGao
 * 创建日期：2017/2/24.17:52
 */

public interface ILoginPresenter {
    void doLogin( );
    void  clearText();
}
