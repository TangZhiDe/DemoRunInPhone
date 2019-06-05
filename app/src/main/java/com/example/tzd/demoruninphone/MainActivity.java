package com.example.tzd.demoruninphone;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {


    private RelativeLayout view1;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = (RelativeLayout) findViewById(R.id.view);
//        img = (ImageView) findViewById(R.id.img);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_contact_image);
//        Bitmap hh = ImageUtil.drawTextToRightBottom(this, bitmap, "李", 100, Color.WHITE, 10, 0);
//        img.setImageBitmap(hh);
//        ImageView viewById = (ImageView) findViewById(R.id.incoming_img_bg);
//        viewById.setImageDrawable(getResources().getDrawable(R.drawable.icon_contact_image));
    }

    public void show(View view) {
        view1.setVisibility(View.VISIBLE);
        view1.setAnimation(makeInAnimation(this,true));
    }

    public void hide(View view) {
        view1.setVisibility(View.INVISIBLE);
        view1.setAnimation(makeOutAnimation(this,true));
    }

    public static Animation makeInAnimation(Context context ,boolean fromLeft){
        Animation a;
        if(fromLeft){
            a = AnimationUtils.loadAnimation(context,R.anim.in_from_left);
        }else {
            a = AnimationUtils.loadAnimation(context,R.anim.in_from_right);
        }
        return a;
    }
    public static Animation makeOutAnimation(Context context ,boolean fromLeft){
        Animation a;
        if(fromLeft){
            a = AnimationUtils.loadAnimation(context,R.anim.out_to_left);
        }else {
            a = AnimationUtils.loadAnimation(context,R.anim.out_to_right);
        }
        return a;
    }


}
