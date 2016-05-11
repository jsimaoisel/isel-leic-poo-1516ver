package pt.isel.poo.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import pt.isel.poo.firstapp.model.CounterListener;
import pt.isel.poo.firstapp.model.CounterModel;
import pt.isel.poo.firstapp.view.CircleView;


class IncrementListener implements View.OnClickListener {
    CounterModel model;
    public IncrementListener(CounterModel model) {
        this.model = model;
    }
    @Override
    public void onClick(View v) {
        model.inc();
    }
}

class DecrementListener implements View.OnClickListener {
    CounterModel model;
    public DecrementListener(CounterModel model) {
        this.model = model;
    }
    @Override
    public void onClick(View v) {
        model.dec();
    }
}

public class MainActivity
        extends AppCompatActivity
        implements CounterListener, View.OnClickListener
{
    private final int START=100, STEP=5, MIN=0, MAX=500;

    private int counter = 0;
    private TextView txtCounter;
    private Button dec, inc, stepBtn;
    private CounterModel model;
    private EditText stepTxt;
    private CircleView circleView;

    public void valueChanged(int v) {
        txtCounter.setText(String.valueOf(v));
    }

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

        stepTxt = new EditText(this);
        stepBtn = new Button(this);
        stepBtn.setText("Set step");
        LinearLayout stepLine = new LinearLayout(this);
        stepLine.addView(stepTxt);
        stepLine.addView(stepBtn);

        circleView = new CircleView(this, START);

        LinearLayout allViews = new LinearLayout(this);
        allViews.setOrientation(LinearLayout.VERTICAL);
        allViews.addView(txtCounter);
        allViews.addView(btnLine);
        allViews.addView(stepLine);
        allViews.addView(circleView);

        // end of view setup

        // set initial values
        model = new CounterModel(START, MAX, MIN, STEP);
        //txtCounter.setText(""+START);
        txtCounter.setText(String.valueOf(START));

        // register listeners
        inc.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    model.inc();
                }
            }
        );
        dec.setOnClickListener(new DecrementListener(model));
        stepBtn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String txt = stepTxt.getText().toString();
                    model.setStep(Integer.parseInt(txt));
                }
            }
        );
        model.setListener(
            new CounterListener() {
                @Override
                public void valueChanged(int v) {
                    txtCounter.setText(String.valueOf(v));
                    circleView.setRadius(v);
                }
            }
        );


        // set group view
        setContentView(allViews);
        System.out.println("@ THE END of onCreate()");
    }

    @Override
    public void onClick(View v) {
        if (v == inc) {
            // codigo do inc
        } else if (v == dec) {

        } else if (v == stepBtn) {

        }
    }
}





