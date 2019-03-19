package AdamDovciak.napier.ac.uk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class ActivitySixGetPlayerInfo extends AppCompatActivity implements View.OnClickListener {

    private DatabaseManipulator dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_get_player_info);

        View saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_button:
                String namePlayer1 = ((EditText) findViewById(R.id.add_name_player_1)).getText().toString();
                String namePlayer2 = ((EditText) findViewById(R.id.add_name_player_2)).getText().toString();
                String scorePlayer1 = (findViewById(R.id.text_view_points2)).toString();
                String scorePlayer2 = (findViewById(R.id.text_view_points2)).toString();
                this.dm = new DatabaseManipulator(this);
                this.dm.insert(namePlayer1, scorePlayer1, namePlayer2, scorePlayer2);

                break;
        }
    }
}
