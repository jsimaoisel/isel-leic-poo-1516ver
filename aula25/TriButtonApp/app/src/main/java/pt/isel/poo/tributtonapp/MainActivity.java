package pt.isel.poo.tributtonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

class ButtonListener implements OnTriTouch {

    @Override
    public void onClick1() {

    }

    @Override
    public void onClick2() {

    }

    @Override
    public void onClick3() {

    }
}

public class MainActivity extends AppCompatActivity {

    private TextView txtView;
    private TriButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView) findViewById(R.id.txtView);
        txtView.setText("NONE");
        button = (TriButton) findViewById(R.id.view);
        button.setOnTriTouch(new OnTriTouch() {
            @Override
            public void onClick1() {
                txtView.setText("Button 1");
            }

            @Override
            public void onClick2() {
                txtView.setText("Button 2");
            }

            @Override
            public void onClick3() {
                txtView.setText("Button 3");
            }
        });
    }
}
