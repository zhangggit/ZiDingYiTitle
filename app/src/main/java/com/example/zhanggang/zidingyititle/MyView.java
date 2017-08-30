package com.example.zhanggang.zidingyititle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 类作用：
 * 时  间：2017/8/30 - 14:22.
 * 创建人：张刚
 */

public class MyView extends View {

    private String title1;
    private float titleSize1;
    private int color1;

    public MyView(Context context) {
        super(context);
        init(context,null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }
    private void init(Context context,AttributeSet attrs) {
        //获取自定义布局属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        title1 = typedArray.getString(R.styleable.MyView_title);
        titleSize1 = typedArray.getDimension(R.styleable.MyView_titleSize, 0);
        color1 = typedArray.getColor(R.styleable.MyView_titleColor, Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔
        Paint paint = new Paint();
        paint.setColor(color1);
        paint.setTextSize(titleSize1);
        canvas.drawText(title1,100,100,paint);



        canvas.drawCircle(400,500,100,paint);
    }


}
