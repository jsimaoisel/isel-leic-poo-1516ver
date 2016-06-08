package pt.isel.poo.tilepanelclick;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import pt.isel.poo.tile.Tile;

/**
 * Created by jsimao on 07-06-2016.
 */
public class ImageTile implements Tile {
    Paint paint;
    Bitmap bitmap;
    Rect src;

    public ImageTile(Bitmap bitmap) {
        paint = new Paint();
        this.bitmap = bitmap;
    }

    @Override
    public void draw(Canvas canvas, int side) {
        canvas.drawBitmap(bitmap, src, new Rect(0,0,side,side), paint);
    }

    @Override
    public boolean setSelect(boolean selected) {
        return false;
    }
}
