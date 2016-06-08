package pt.isel.poo.tilepanelclick;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import pt.isel.poo.tile.OnTileTouchListener;
import pt.isel.poo.tile.Tile;
import pt.isel.poo.tile.TilePanel;

public class MainActivity extends AppCompatActivity implements OnTileTouchListener {

    private static final String COLOR_TXT = "color.txt";
    private TilePanel panel;
    private ColorTile blue, coloredTile;
    private ImageTile imageTile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        blue = new ColorTile(Color.BLUE);
        int color;
        AssetManager mng = getAssets();
        try(InputStream in = mng.open(COLOR_TXT)) {
            Scanner scan = new Scanner(in);
            color = scan.nextInt();
            coloredTile = new ColorTile(color);
        } catch(IOException ex) {
            Log.e("ERROR", "Error reading from color.txt");
            return;
        }

        Resources res = getResources();
        Bitmap bitmap = BitmapFactory.decodeResource(res, R.drawable.star);
        imageTile = new ImageTile(bitmap);

        setContentView(R.layout.activity_main);
        panel = (TilePanel) findViewById(R.id.panel);
        panel.setListener(this);
        for (int x = 0; x < panel.getWidthInTiles(); ++x) {
            for (int y = 0; y < panel.getHeightInTiles(); ++y) {
                panel.setTile(x, y, blue);
            }
        }
    }

    @Override
    public boolean onClick(int xTile, int yTile) {
        Tile curr = panel.getTile(xTile, yTile), next;
        if (curr == blue) {
            next = coloredTile;
        } else if (curr == coloredTile) {
            next = imageTile;
        } else {
            next = blue;
        }
        panel.setTile(xTile, yTile, next);
        return true;
    }

    @Override
    public boolean onDrag(int xFrom, int yFrom, int xTo, int yTo) {
        return false;
    }

    @Override
    public void onDragEnd(int x, int y) {    }

    @Override
    public void onDragCancel() {    }
}
