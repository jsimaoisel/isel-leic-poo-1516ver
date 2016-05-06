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


class FirstListener implements View.OnClickListener {

    public void onClick(View v) {
        System.out.println("Btn clicked @ FirstListener");
    }
}

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView txtCounter;
    private Button dec, inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        System.out.println("Hello world @ MainActivity.onCreate");
        Button btn = new Button(this);
        btn.setText("Click me!");
        //btn.setOnClickListener(new FirstListener());
        View.OnClickListener listener = new View.OnClickListener(){
            public void onClick(View v) {
                System.out.println("Btn clicked @ FirstListener");
            }
        };
        btn.setOnClickListener(listener);
        */

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
        counter = 0;
        txtCounter.setText(String.valueOf(counter));

        // register listeners
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("@ onClick()");
                if (v == dec)
                    counter --;
                else
                    counter ++;
                txtCounter.setText(String.valueOf(counter));
            }
        };
        inc.setOnClickListener(listener);
        dec.setOnClickListener(listener);

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