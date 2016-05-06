package pt.isel.poo.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView txtCounter;
    private Button dec, inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setup of views
        txtCounter = new TextView(this);
        txtCounter.setTextSize(30F);
        txtCounter.setGravity(Gravity.CENTER_HORIZONTAL);

        inc = new Button(this);
        inc.setText("+");
        dec = new Button(this);
        dec.setText("-");
        LinearLayout btnLine = new LinearLayout(this);
        btnLine.addView(inc);
        btnLine.addView(dec);
        btnLine.setGravity(Gravity.CENTER_HORIZONTAL);

        LinearLayout allViews = new LinearLayout(this);
        allViews.setOrientation(LinearLayout.VERTICAL);
        allViews.addView(txtCounter);
        allViews.addView(btnLine);

        // set initial values
        // TODO

        // TODO
        // register listeners
        // inc.setOnClickListener( ... );
        // dec.setOnClickListener( ... );

        // set group view
        setContentView(allViews);
        System.out.println("@ THE END of onCreate()");
    }
}







/*
        LinearLayout all = new LinearLayout(this);
        all.setOrientation(LinearLayout.VERTICAL);
        LinearLayout buttons = new LinearLayout(this);
        buttons.setOrientation(LinearLayout.HORIZONTAL);
        Button inc = new Button(this); inc.setText("+");
        Button dec = new Button(this); dec.setText("-");
        buttons.addView(inc);
        buttons.addView(dec);
        //buttons.setGravity(Gravity.CENTER_HORIZONTAL);

        final TextView value = new TextView(this);
        value.setText(String.valueOf(counter));
        value.setTextSize(30F);
        //value.setGravity(Gravity.CENTER_HORIZONTAL);

        all.addView(value);
        all.addView(buttons);

        inc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                counter++;
                value.setText(String.valueOf(counter));
            }
        });

 */