package com.xinkong.multiadapter.interfaces;

import android.view.View;

/**
 * Created by hxl65 on 2017/02/26.
 */

public interface OnItemClickListener {
    /**
     * itemView的点击事件
     *
     * @param view
     * @param postion
     */
    void onItemClick(View view, int postion);
}
