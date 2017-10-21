import android.view.View;
        import android.widget.Toast;

/**
 * Created by natha on 10/5/2017.
 */

public class SubmitAMessageButton {


    public class SubmitAMessageButton implements View.OnClickListener {
        String message;
        String name;
        TextView toasting;

        public SubmitAMessageButton(String name, String message, TextView toasting) {
            this.message = message;
            this.name = name;
            this.toasting = toasting;
        }

        @Override
        public void onClick(View view){
            Toast.makeText( getApplicationContext() , name + ", " + message, Toast.LENGTH_SHORT);
        }

    }
}


