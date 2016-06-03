package pt.isel.poo.counterlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView counterView;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        counter = 0;

        inc = (Button) findViewById(R.id.inc);
        dec = (Button) findViewById(R.id.dec);
        counterView = (TextView) findViewById(R.id.counter);

        inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ++counter;
                counterView.setText(Integer.toString(counter));
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                --counter;
                counterView.setText(Integer.toString(counter));
            }
        });
    }
}
