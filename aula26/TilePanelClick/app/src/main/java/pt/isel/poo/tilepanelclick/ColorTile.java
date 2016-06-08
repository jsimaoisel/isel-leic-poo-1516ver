package pt.isel.poo.tilepanelclick;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.tile.Tile;

/**
 * Created by jsimao on 07-06-2016.
 */
public class ColorTile implements Tile {

    Paint p;

    public  ColorTile(int color) {
        p = new Paint();
        p.setColor(color);
    }

    public void setColor(int color) {
        p.setColor(color);
    }

    @Override
    public void draw(Canvas canvas, int side) {
        canvas.drawRect(0, 0, side, side, p);
    }

    @Override
    public boolean setSelect(boolean selected) {
        return false;
    }
}
