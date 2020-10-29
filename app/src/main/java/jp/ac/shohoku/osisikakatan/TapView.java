package jp.ac.shohoku.osisikakatan;

 import android.content.Context;
 import android.content.res.Resources;
 import android.graphics.Bitmap;
 import android.graphics.BitmapFactory;
 import android.graphics.Canvas;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.util.AttributeSet;
 import android.view.MotionEvent;
 import android.view.View;

 /**
 * Created by  on 2015/10/07.
 */
 public class TapView extends View {
     private Paint mPaint = new Paint(); //描画用のスタイル設定など
     private Bitmap mBmp[] = new Bitmap[5]; //表示用の Bitmap
     private int mTop, mLeft, mW, mH; //画像の幅と高さ
     private int i;  //カウント数


     /**
      * コンストラクタ
      *
      * @param context
      * @param attrs
      */
     public TapView(Context context, AttributeSet attrs) {
         super(context, attrs);
         Resources rs = this.getResources(); //リソースを取得 (R クラスから取得)
         mBmp[0] = BitmapFactory.decodeResource(rs, R.drawable.omoti); //リソースから画像を取得
         mBmp[1] = BitmapFactory.decodeResource(rs, R.drawable.baaa); //リソースから画像を取得
         mBmp[2] = BitmapFactory.decodeResource(rs, R.drawable.oko); //リソースから画像を取得
         mBmp[3] = BitmapFactory.decodeResource(rs, R.drawable.siro); //リソースから画像を取得
         mBmp[4] = BitmapFactory.decodeResource(rs, R.drawable.zukyun); //リソースから画像を取得
         mTop = 100;
         mLeft = 100;
         mW = mBmp[i].getWidth();
         mH = mBmp[i].getHeight();
     }

     /**
      * このメソッドで描画をします．
      *
      * @param canvas 画像表示用のキャンバス
      */
     protected void onDraw(Canvas canvas) {
         super.onDraw(canvas);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp[i], mLeft, mTop, mPaint);
     }

     /*
      * タップされたときに実行されるメソッド<br />
      * タップされたときに，押されたかどうかの状態をチェックし，変化させる．
      */
     @Override
     public boolean onTouchEvent(MotionEvent event) {

         int x = (int) event.getX();
         int y = (int) event.getY();

         mLeft = x - mW / 2;//描画場所を変更
         mTop = y - mH / 2;

         if(i>=4) {
             i=0;
         }
         else {
             i++;
         }

         invalidate(); //再描画する

         return super.onTouchEvent(event);


     }
 }