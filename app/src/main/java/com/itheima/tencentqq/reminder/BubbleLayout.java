package com.itheima.tencentqq.reminder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：TencentQQ
 * Package_Name：com.itheima.tencentqq
 * Version：1.0
 * time：2016/2/15 16:36
 * des ：To show the end animation(bubble burst)
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/

public class BubbleLayout extends FrameLayout {

	public BubbleLayout(Context context) {
		super(context);
	}
	private int mCenterX, mCenterY;
	public void setCenter(int x, int y){
		mCenterX = x;
		mCenterY = y;
		requestLayout();
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		View child = getChildAt(0);
		// 设置View到指定位置
        if (child != null && child.getVisibility() != GONE) {
            final int width = child.getMeasuredWidth();
            final int height = child.getMeasuredHeight();
            child.layout((int)(mCenterX - width / 2.0f), (int)(mCenterY - height / 2.0f)
            		, (int)(mCenterX + width / 2.0f), (int)(mCenterY + height / 2.0f));
        }
	}

}
