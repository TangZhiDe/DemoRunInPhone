package com.example.tzd.demoruninphone;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CicleText extends CardView {
    private Paint paint;
    public CicleText(Context context) {
        super(context);
    }

    public CicleText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CicleText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //    重写draw方法
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

//        实例化画笔对象
        paint = new Paint();
//        给画笔设置颜色@color/fafbfc
//        paint.setColor(Color.parseColor("#ffffff"));
        paint.setAntiAlias(true);//抗锯齿
        paint.setDither(true);//防抖动
//        设置画笔属性
        paint.setStyle(Paint.Style.FILL);//画笔属性是实心圆
//        paint.setStyle(Paint.Style.STROKE);//画笔属性是空心圆
        paint.setStrokeWidth(8);//设置画笔粗细

        /*四个参数：
                参数一：圆心的x坐标
                参数二：圆心的y坐标
                参数三：圆的半径
                参数四：定义好的画笔
                */
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getHeight() / 2, paint);

    }

}
