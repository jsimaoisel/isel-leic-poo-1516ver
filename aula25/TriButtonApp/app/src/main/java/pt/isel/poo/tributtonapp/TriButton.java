package pt.isel.poo.tributtonapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jsimao on 02-06-2016.
 */
public class TriButton extends View {
    Paint p;

    OnTriTouch listener;

    public TriButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        p = new Paint();
    }

    protected void onDraw(Canvas cv){
        int w = cv.getWidth();
        int h = cv.getHeight();
        p.setColor(Color.RED); cv.drawRoundRect(0, 0, w/3-1, h, 40, 40, p);
        p.setColor(Color.GREEN); cv.drawRoundRect(w/3,0, 2*w/3-1, h, 40,40, p);
        p.setColor(Color.BLUE); cv.drawRoundRect(2*w/3, 0, w-1, h, 40, 40, p);
    }

    public void setOnTriTouch(OnTriTouch l) {
        listener = l;
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (listener == null) {
            return false;
        }
        int w = getWidth();
        int a = event.getAction(); // ACTION_DOWN, ACTION_UP, …
        int x = (int) event.getX(), y = (int) event.getY();
        if (a == MotionEvent.ACTION_DOWN) {
            if (x < w/3-1) {
                listener.onClick1();
            } else if (x < 2*w/3-1) {
                listener.onClick2();
            } else {
                listener.onClick3();
            }
        }
        return true;
    }
}
