package com.jason.mvpmode.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jason.mvpmode.R;
import com.jason.mvpmode.bean.User;
import com.jason.mvpmode.model.OnLoginListener;
import com.jason.mvpmode.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements ILoginView, View.OnClickListener, OnLoginListener {
    private EditText mEditName;
    private EditText mEditPassword;
    private Button mBtnCommit;
    private Button mBtnClean;
    private ProgressBar mPbar;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenter(this);
        mEditName = (EditText) findViewById(R.id.edit_name);
        mEditPassword = (EditText) findViewById(R.id.edit_password);
        mBtnClean = (Button) findViewById(R.id.btn_login_clean);
        mBtnCommit = (Button) findViewById(R.id.btn_login_commit);
        mPbar = (ProgressBar) findViewById(R.id.pbar_login_progress);
        mBtnClean.setOnClickListener(this);
        mBtnCommit.setOnClickListener(this);
    }


    @Override
    public void onClearText() {
        mEditName.setText("");
        mEditPassword.setText("");
    }

    @Override
    public User getUser() {
        String name = mEditName.getText().toString().trim();
        String pwd = mEditPassword.getText().toString().trim();
        return new User(name, pwd);
    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
        mPbar.setVisibility(visibility);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login_clean:
                loginPresenter.clearText();
                break;
            case R.id.btn_login_commit:
                loginPresenter.doLogin();
                break;
        }

    }


    @Override
    public void onLoginSuccess(User user) {
        Intent intent = new Intent(this, MainActicity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginFail(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
