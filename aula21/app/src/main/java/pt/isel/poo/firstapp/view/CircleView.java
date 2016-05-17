package pt.isel.poo.firstapp.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class CircleView extends View {

    private int radius;
    private Paint paint;

    public CircleView(Context context, int radius) {
        super(context);
        paint = new Paint();
        this.radius = radius;
    }

    public void setRadius(int r) {
        radius = r;
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                System.out.print("Down @");
                break;
            case MotionEvent.ACTION_UP:
                System.out.print("Up @ ");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.print("Move @ ");
                break;
        }
        System.out.println(" x="
                + ev.getX()
                + " y=" + ev.getY());
        return true;
    }

    public void onDraw(Canvas c) {
        int cx = c.getWidth() / 2;
        int cy = c.getHeight() / 2;
        paint.setColor(Color.DKGRAY);
        paint.setStyle(Paint.Style.FILL);
        c.drawCircle(cx, cy, radius, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        c.drawRect(1,1,getWidth()-1,getHeight()-1,paint);
    }
}
