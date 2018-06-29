package com.laughing.gohome;

import android.os.Bundle;

import com.login.ui.activity.A_Login;
import com.waterbase.ui.BaseActivity;

public class A_Welcome extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A_Login.startActivity(this,false);
        finish();
    }
}
