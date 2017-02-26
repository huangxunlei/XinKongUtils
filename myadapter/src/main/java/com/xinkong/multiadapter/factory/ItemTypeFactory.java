package com.xinkong.multiadapter.factory;

import android.view.View;

import com.xinkong.multiadapter.decorate.Visitable;
import com.xinkong.multiadapter.viewholder.BaseViewHolder;


/**
 * Created by hxl65 on 2017/02/17.
 */

public abstract class ItemTypeFactory implements TypeFactory {


    /**
     * 根据返回的不同的bean类实现不同的不同的type
     *
     * @param visitable
     * @param resId
     * @return
     */
    @Override
    public int type(Visitable visitable, int resId) {
        int viewType = 0;
        if (visitable instanceof Visitable) {
            viewType = resId;
        }
        return viewType;
    }

    @Override
    public abstract BaseViewHolder createViewHolder(int type, View itemView);
}