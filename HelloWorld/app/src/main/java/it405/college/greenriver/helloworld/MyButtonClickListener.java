package it405.college.greenriver.helloworld;

import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by natha on 9/28/2017.
 */

public class MyButtonClickListener implements View.OnClickListener {
    String message;
    TextView texting;
    public MyButtonClickListener(String message, TextView text){
        this.message = message;
        this.texting = text;
    }

    @Override
    public void onClick(View view)
    {
        texting.setText(message);
    }
}
