package jp.ac.shohoku.osisikakatan;

/**
 * @author カスタムビュー2作成者　19B704 高安咲希
 * @author カスタムビュー2おまけ部分　19B712 宮島由佳
 */

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;


public class CustomView2 extends View {
    private Context context;

    /**
     * コンストラクタ
     *
     * @param context
     * @param attrs
     */

    public CustomView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawColor(Color.WHITE); //キャンバスの背景を白にする
        canvas.drawColor(Color.LTGRAY); //キャンバスの背景をグレーにする
        int w = this.getWidth(); //View の幅を取得
        int h = this.getHeight(); //View の高さを取得
        Paint p = new Paint(); //描画する図形の属性
        p.setStyle(Style.STROKE); //線のみ
        p.setColor(Color.DKGRAY); //ダークグレイで描く
        canvas.drawRect(new Rect(5, 5, w - 10, h - 10), p); //長方形を canvas に描く
        Resources rs = this.getContext().getResources(); //リソースを取得
        Bitmap bmp = BitmapFactory.decodeResource(rs, R.drawable.gazou); //画像を取得
        Bitmap bmp2 = BitmapFactory.decodeResource(rs, R.drawable.dempa);
        canvas.drawBitmap(bmp, 0, 0, p); //画像の左上を Canvas の(0,0)に合わせて表示する
        canvas.drawBitmap(bmp2, 380,140, p);
    }
}
