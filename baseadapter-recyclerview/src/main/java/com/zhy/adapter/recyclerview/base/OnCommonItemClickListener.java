package com.zhy.adapter.recyclerview.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

/**
 * author: Tim Chen
 * time  : 2020-03-25
 * desc  :
 * 替代原本的 MultiItemTypeAdapter.OnCommonItemClickListener
 * 讓不常用的 LongClick 不用每次都implement
 * 有需要再 override 即可
 */
public abstract class OnCommonItemClickListener implements MultiItemTypeAdapter.OnItemClickListener {
    @Override
    public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
        return false;
    }
}
