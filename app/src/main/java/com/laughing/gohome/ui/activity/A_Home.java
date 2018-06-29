package com.laughing.gohome.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import com.laughing.gohome.R;
import com.laughing.gohome.databinding.AHomeBinding;
import com.laughing.gohome.databinding.HomeTabContentBinding;
import com.laughing.gohome.ui.mvpview.HoneView;
import com.laughing.gohome.ui.presenter.HomePresenter;
import com.waterbase.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 底部导航栏的Activity
 * Created by Water on 2018/3/28.
 */

public class A_Home extends BaseActivity implements HoneView {

    private AHomeBinding binding;
    private HomePresenter presenter;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, A_Home.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.a_home);
        presenter = new HomePresenter(this);
        initListener();
    }

    private void initListener() {
        binding.bottomTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                presenter.onTabItemSelected(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private List<HomeTabContentBinding> bindings = new ArrayList<>();

    @Override
    public void addTabView(int res, String text) {
        HomeTabContentBinding binding = DataBindingUtil.inflate(mInflater
                , R.layout.home_tab_content, null, false);
        bindings.add(binding);
        binding.tabContentImage.setImageResource(res);
        binding.tabContentText.setText(text);
        this.binding.bottomTabLayout.addTab(this.binding.bottomTabLayout.newTab().setCustomView(binding.getRoot()));
    }

    @Override
    public void selectFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_container, fragment).commit();
        }
    }

    @Override
    public void alterTabState(int position, int res, int color) {
        bindings.get(position);
        bindings.get(position).tabContentImage.setImageResource(res);
        bindings.get(position).tabContentText.setTextColor(getResources().getColor(color));
    }


}
