package AdamDovciak.napier.ac.uk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        ActivityTwo activityTwo = new ActivityTwo();
        int player1Points = activityTwo.player1Points;

        System.out.println(player1Points);
    }

    public void openGame(View view) {
        Intent gameOpener = new Intent(this, ActivityTwo.class);
        startActivity(gameOpener);
    }

    public void openMainMenu(View view) {
        Intent mainMenuOpener = new Intent(this, MainActivity.class);
        startActivity(mainMenuOpener);
    }

    public void resetGame(View view) {
        Intent scoreQuestion = new Intent(this, ActivityFiveCheckScore.class);
        startActivity(scoreQuestion);
    }
}
