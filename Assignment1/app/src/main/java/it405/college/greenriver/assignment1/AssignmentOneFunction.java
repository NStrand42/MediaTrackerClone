package it405.college.greenriver.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AssignmentOneFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_one_function);

        View view = findViewById(R.id.SubmitButton);
        final Button button = (Button) findViewById(R.id.SubmitButton);
        final TextView name = (TextView) findViewById(R.id.EditTextName);
        final TextView phone = (TextView) findViewById(R.id.EditTextPhoneNumber);
        final TextView message = (TextView) findViewById(R.id.EditTextMessage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.length() == 0) {
                    Toast toastAssignment = Toast.makeText(getBaseContext(), "Please enter a name!", Toast.LENGTH_LONG);
                    toastAssignment.show();
                } else if (name.length() > 0  && message.length() > 0){
                    Toast toastAssignment = Toast.makeText(getBaseContext(), "Hello " + name.getText().toString() + ", " + message.getText().toString(), Toast.LENGTH_LONG);
                    toastAssignment.show();
                }
            }
        });
    }
}
