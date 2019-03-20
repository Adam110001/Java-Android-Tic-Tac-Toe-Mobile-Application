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

        View back = findViewById(R.id.back_button);
        back.setOnClickListener(this);
    }


    public void onClick(View v) {

        int player1Points;
        int player2Points;

        String player1PointsToString;
        String player2PointsToString;

        ActivityTwo neededPoints =  new ActivityTwo();

        player1Points = neededPoints.player1Points;
        player1PointsToString = String.valueOf(player1Points);

        player2Points = neededPoints.player2Points;
        player2PointsToString = String.valueOf(player2Points);

        switch (v.getId()) {
            case R.id.back_button:
                Intent gameMenu = new Intent(this, ActivityThree.class);
                startActivity(gameMenu);
                break;
            case R.id.save_button:
                String namePlayer1 = ((EditText) findViewById(R.id.add_name_player_1)).getText().toString();
                String scorePlayer1 = player1PointsToString;
                String namePlayer2 = ((EditText) findViewById(R.id.add_name_player_2)).getText().toString();
                String scorePlayer2 = player2PointsToString;

                this.dm = new DatabaseManipulator(this);
                this.dm.insert(namePlayer1, scorePlayer1, namePlayer2, scorePlayer2);

                Intent backToMainMenu = new Intent(this, MainActivity.class);
                startActivity(backToMainMenu);

                break;
        }

        ActivityTwo scoreReset = new ActivityTwo();

        scoreReset.player1Points = 0;
        scoreReset.player2Points = 0;
    }
}
