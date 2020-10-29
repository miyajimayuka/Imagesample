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
     private Paint mPaint1 = new Paint();
     private Paint mPaint2 = new Paint();
     private Paint mPaint3 = new Paint();
     private Paint mPaint4 = new Paint();
     private Bitmap mBmp = null; //表示用の Bitmap
     private Bitmap mBmp1 = null;
     private Bitmap mBmp2 = null;
     private Bitmap mBmp3 = null;
     private Bitmap mBmp4 = null;
     private int mTop, mLeft, mW, mH; //画像の幅と高さ
     private int mTop1,mLeft1,mW1,mH1;
     private int mTop2,mLeft2,mW2,mH2;
     private int mTop3,mLeft3,mW3,mH3;
     private int mTop4,mLeft4,mW4,mH4;

     /**
      * コンストラクタ
      *
      * @param context
      * @param attrs
      */
     public TapView(Context context, AttributeSet attrs) {
         super(context, attrs);
         Resources rs = this.getResources(); //リソースを取得 (R クラスから取得)
         mBmp = BitmapFactory.decodeResource(rs, R.drawable.omoti); //リソースから画像を取得
         mBmp1 = BitmapFactory.decodeResource(rs, R.drawable.baaa); //リソースから画像を取得
         mBmp2 = BitmapFactory.decodeResource(rs, R.drawable.oko); //リソースから画像を取得
         mBmp3 = BitmapFactory.decodeResource(rs, R.drawable.siro); //リソースから画像を取得
         mBmp4 = BitmapFactory.decodeResource(rs, R.drawable.zukyun); //リソースから画像を取得
         mTop = 100;
         mLeft = 100;
         mW = mBmp.getWidth();
         mH = mBmp.getHeight();
         mW1 = mBmp1.getWidth();
         mH1 = mBmp1.getHeight();
         mW2 = mBmp2.getWidth();
         mH2 = mBmp2.getHeight();
         mW3 = mBmp3.getWidth();
         mH3 = mBmp3.getHeight();
         mW4 = mBmp4.getWidth();
         mH4 = mBmp4.getHeight();
     }

     /**
      * このメソッドで描画をします．
      *
      * @param canvas 画像表示用のキャンバス
      */
     protected void onDraw(Canvas canvas) {
         super.onDraw(canvas);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp, mLeft, mTop, mPaint);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp1, mLeft1, mTop1, mPaint1);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp2, mLeft2, mTop2, mPaint2);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp3, mLeft3, mTop3, mPaint3);
         canvas.drawColor(Color.WHITE);
         canvas.drawBitmap(mBmp4, mLeft4, mTop4, mPaint4);
     }

     /*
      * タップされたときに実行されるメソッド<br />
      * タップされたときに，押されたかどうかの状態をチェックし，変化させる．
      */
     @Override
     public boolean onTouchEvent(MotionEvent event) {

         int x = (int) event.getX();
         int y = (int) event.getY();

             mLeft = x - mW; //描画場所を変更
             mTop = y - mH;

             invalidate(); //再描画する

         mLeft1 = x - mW; //描画場所を変更
         mTop1 = y - mH;

         invalidate(); //再描画する
         mLeft2 = x - mW; //描画場所を変更
         mTop2 = y - mH;

         invalidate(); //再描画する
         mLeft3 = x - mW; //描画場所を変更
         mTop3 = y - mH;

         invalidate(); //再描画する
             return super.onTouchEvent(event);


     }
 }