package com.xinkong.multiadapter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinkong.multiadapter.decorate.Visitable;
import com.xinkong.multiadapter.factory.ItemTypeFactory;
import com.xinkong.multiadapter.interfaces.OnItemClickListener;
import com.xinkong.multiadapter.interfaces.onLongItemClickListener;
import com.xinkong.multiadapter.viewholder.BaseViewHolder;

import java.util.List;


/**
 * Created by hxl65 on 2017/02/17.
 */

public class MultiRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private List<Visitable> mData;
    private ItemTypeFactory typeFactory;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private OnItemClickListener mItemClickListener;
    private onLongItemClickListener mLongItemClickListener;

    public MultiRecyclerAdapter(Context context, List<Visitable> mData, ItemTypeFactory mItemTypeFactory) {
        this.mData = mData;
        mContext = context;
        typeFactory = mItemTypeFactory;
        mLayoutInflater = LayoutInflater.from(context);

    }

    /**
     * 更新数据
     *
     * @param data
     */
    public void updateData(List<Visitable> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    /**
     * 加载更多数据
     * <p>
     * 添加数据,保留原有的数据,
     *
     * @param data
     */
    public void addAll(List<Visitable> data) {
        mData.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(viewType, parent, false);
        return typeFactory.createViewHolder(viewType, view);
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, final int position) {
        holder.bindViewData(mContext, mData.get(position));
        if (mItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mItemClickListener.onItemClick(holder.itemView, position);
                }
            });
        }
        if (mLongItemClickListener != null) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mLongItemClickListener.onLongItemClick(holder.itemView, position);
                    return true;
                }
            });
        }
    }

    @Override
    public int getItemViewType(int position) {

        return mData.get(position).type(typeFactory);
    }

    @Override
    public int getItemCount() {
        return (mData != null ? mData.size() : 0);
    }

    /**
     * 需要在调用方法中实现
     *
     * @param listener
     */
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    public void setonLongItemClickListener(onLongItemClickListener listener) {
        this.mLongItemClickListener = listener;
    }

}
