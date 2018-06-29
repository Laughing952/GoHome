package com.laughing.gohome.ui.presenter;

import android.support.v4.app.Fragment;

import com.laughing.gohome.R;
import com.laughing.gohome.ui.mvpview.HoneView;


/**
 * Created by Water on 2018/3/28.
 */

public class HomePresenter {

    public static final int[] mTabRes = new int[]{R.mipmap.navigation_desk_normal, R.mipmap.navigation_project_normal, R.mipmap.navigation_user_normal};
    public static final int[] mTabResPressed = new int[]{R.mipmap.navigation_desk_pressed, R.mipmap.navigation_project_pressed, R.mipmap.navigation_user_pressed};
    public static final String[] mTabTitle = new String[]{"工作台", "项目", "我的"};
    private Fragment fragments[];
    private HoneView honeView;
    private int selected = 0;

    public HomePresenter(HoneView honeView) {
        this.honeView = honeView;
        // 初始化数据
        getFragments();
        addTabData();
    }

    private void addTabData() {
        for (int i = 0; i < mTabTitle.length; i++) {
            honeView.addTabView(mTabRes[i], mTabTitle[i]);
        }
        honeView.selectFragment(fragments[0]);
        honeView.alterTabState(0, mTabResPressed[0], R.color.main_color);
    }

    public void getFragments() {
        fragments = new Fragment[4];
//        fragments[0] = F_Device.newInstance();
//        fragments[1] = F_Store.newInstance();
//        fragments[2] = F_Message.newInstance();
//        fragments[0] = F_Working.newInstance();
//        fragments[1] = F_Project.newInstance();
//        fragments[2] = F_MyCenter.newInstance();
    }

    public void onTabItemSelected(int position) {
        Fragment fragment = null;
        fragment = fragments[position];
        honeView.selectFragment(fragment);
        honeView.alterTabState(position, mTabResPressed[position], R.color.main_color);
        honeView.alterTabState(selected, mTabRes[selected], R.color.black);
        selected = position;
    }
}
