package com.xinkong.multiadapter.decorate;


import com.xinkong.multiadapter.factory.TypeFactory;

/**
 * Created by hxl65 on 2017/02/17.
 * 需要实现不同布局的bean类都去继承此类
 */

public interface Visitable {

    int type(TypeFactory typeFactory);
}
