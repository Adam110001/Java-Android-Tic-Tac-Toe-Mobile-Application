package AdamDovciak.napier.ac.uk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startGameButton = (Button) findViewById(R.id.startGameButton);
        startGameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainGame();
            }
        });

        final Button openStatistics = (Button) findViewById(R.id.statisticsButton);
        openStatistics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openStatstics();
            }
        });
    }

    public void openMainGame(){
        Intent gameView = new Intent(this, ActivityTwo.class);
        startActivity(gameView);
    }

    private void openStatstics(){
        Intent statisticsView = new Intent(this, AcitivityFourStatistics.class);
        startActivity(statisticsView);
    }
}
