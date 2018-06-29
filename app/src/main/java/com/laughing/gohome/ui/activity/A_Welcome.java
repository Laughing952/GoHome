package com.laughing.gohome.ui.activity;

import android.os.Bundle;

import com.laughing.gohome.R;
import com.login.ui.activity.A_Login;
import com.waterbase.ui.BaseActivity;
import com.waterbase.ui.BaseApplication;
import com.waterbase.utile.PreferencesManager;
import com.waterbase.utile.StrUtil;

public class A_Welcome extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String userid = PreferencesManager.getInstance(BaseApplication.getAppContext()).get("userId");
        if (StrUtil.isEmpty(userid)) {
            A_Login.startActivity(this, false);
        } else
            A_Home.startActivity(this);
        finish();
    }
}
