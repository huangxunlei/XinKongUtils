package com.xinkong.multiadapter.interfaces;

import android.view.View;

/**
 * Created by hxl65 on 2017/02/26.
 */

public interface onLongItemClickListener {

    /**
     * itemView的长按事件
     *
     * @param view
     * @param postion
     */
    void onLongItemClick(View view, int postion);
}
