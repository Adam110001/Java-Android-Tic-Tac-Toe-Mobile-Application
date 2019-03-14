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

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });

        Button backToMainMenu = (Button) findViewById(R.id.backToMainMenu_button);
        backToMainMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainMenu();
            }
        });

        Button backToGame = findViewById(R.id.backToGame_button);
        backToGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGame();
            }
        });
    }

    private void openGame() {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    private void openMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void resetGame() {

    }
}
