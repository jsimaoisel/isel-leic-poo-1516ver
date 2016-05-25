package pt.isel.poo.firstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

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
        implements CounterListener
{
    private Toast savedInfo;
    private final int START=100, STEP=5, MIN=0, MAX=500;

    private TextView txtCounter;
    private Button dec, inc, stepBtn, load, save;
    private CounterModel model;
    private EditText stepTxt;
    private CircleView circleView;

    public void valueChanged(int v) {
        txtCounter.setText(String.valueOf(v));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        savedInfo = Toast.makeText(this, "Counter saved.", Toast.LENGTH_SHORT);

        // setup of views
        txtCounter = new TextView(this);
        txtCounter.setTextSize(30F);
        txtCounter.setGravity(Gravity.CENTER_HORIZONTAL);

        inc = new Button(this);
        inc.setText("+");
        dec = new Button(this);
        dec.setText("-");
        load = new Button(this);
        load.setText("Load");
        save = new Button(this);
        save.setText("Save");

        LinearLayout btnLine = new LinearLayout(this);
        btnLine.addView(inc);
        btnLine.addView(dec);
        btnLine.addView(load);
        btnLine.addView(save);
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
        load.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                loadCounter();
            }
        });
        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                saveCounter();
            }
        });
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
    protected void onPause() {
        super.onPause();
        System.out.println("@ onPause()");
    }

    protected void onStop() {
        super.onStop();
        System.out.println("@ onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("@ onDestroy()");
    }



    private void loadCounter() {
        try (FileInputStream in =
                     openFileInput("counter.txt")) {
            Scanner scan = new Scanner(in);
            int counter = scan.nextInt();
            model.setCounter(counter);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void saveCounter() {
        try(FileOutputStream out =
                    openFileOutput("counter.txt", Context.MODE_PRIVATE)) {

            PrintStream println = new PrintStream(out);
            println.print(model.read());
            savedInfo.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*
        FileOutputStream out = null;
        try {
            out = openFileOutput("counter.txt", Context.MODE_PRIVATE);
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (out!=null)
                try {
                    out.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        }*/
    }












    /*private void saveCounter() {
        try (OutputStream o = openFileOutput("counter.txt", Context.MODE_PRIVATE)) {
            PrintStream ps = new PrintStream(o);
            ps.println(model.read());
            Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "Error=" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void loadCounter() {
        Scanner in = null;
        try (InputStream i = openFileInput("counter.txt")) {
            in = new Scanner(i);
            model.load(in.nextInt());
        } catch (Exception e) {
            Toast.makeText(this, "Error=" + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }*/


}





