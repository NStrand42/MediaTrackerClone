package it405.college.greenriver.secondclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static it405.college.greenriver.secondclass.R.id.contentImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String gary;

        ImageView imageview = (ImageView) findViewById(contentImage);
        imageview.setImageResource(R.drawable.cheetah);a

    }
}
