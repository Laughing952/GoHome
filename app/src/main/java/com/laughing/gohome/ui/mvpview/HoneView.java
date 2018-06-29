package com.laughing.gohome.ui.mvpview;

import android.support.v4.app.Fragment;

/**
 * Created by Water on 2018/3/28.
 */

public interface HoneView {
    /**
     * 选中的fragment
     * @param fragment
     */
    void selectFragment(Fragment fragment);

    void addTabView(int res, String text);

    void alterTabState(int position, int res, int color);
}
