package com.xinkong.multiadapter.factory;

import android.view.View;

import com.xinkong.multiadapter.decorate.Visitable;
import com.xinkong.multiadapter.viewholder.BaseViewHolder;

/**
 * Created by hxl65 on 2017/02/17.
 */

public interface TypeFactory {
    /**
     * 返回每个布局的viewType
     *
     * @param visitable
     * @param resId
     * @return
     */
    int type(Visitable visitable, int resId);

    /**
     * 根据不同的type来加载不同的布局
     *
     * @param type
     * @param itemView
     * @return
     */
    BaseViewHolder createViewHolder(int type, View itemView);
}