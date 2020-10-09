package jp.ac.shohoku.osisikakatan;

import android.content.Context;
4 import android.content.res.Resources;
5 import android.graphics.Bitmap;
6 import android.graphics.BitmapFactory;
7 import android.graphics.Canvas;
8 import android.graphics.Color;
9 import android.graphics.Paint;
10 import android.graphics.Paint.Style;
11 import android.graphics.Rect;
12 import android.util.AttributeSet;
13 import android.view.View;
14
        15 public class CustomView extends View {
16 private Context context;

         public CusotomView(Context context, AttributeSet attrs){
         super(context, attrs);
         }



 protected void onDraw(Canvas canvas){
         super.onDraw(canvas);
         canvas.drawColor(Color.WHITE); //キャンバスの背景を白にする

         int w = this.getWidth(); //View の幅を取得