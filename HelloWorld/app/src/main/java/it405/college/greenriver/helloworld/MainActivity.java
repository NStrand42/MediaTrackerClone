package it405.college.greenriver.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_try);

        View view = findViewById(R.id.button);
        final Button button = (Button) findViewById(R.id.button);
        final TextView text = (TextView) findViewById(R.id.textView);
        button.setText(getString(R.string.button_text));

        MyButtonClickListener listener = new MyButtonClickListener(getString(R.string.button_change), text);
        button.setOnClickListener(listener);


    }
}
