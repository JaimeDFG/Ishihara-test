package lord.apps.ishiharatest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {

    TextView pointsNew;
    TextView finalm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        int p = getIntent().getExtras().getInt("points");
        pointsNew = findViewById(R.id.pointsNew);
        pointsNew.setText("" + p);

        finalm = findViewById(R.id.finalm);

        int six = Integer.parseInt("6");
        int twelve = Integer.parseInt("12");

        if(p < six){
            finalm.setText(R.string.Bad);
        }
        else{
            if(p < twelve){
                finalm.setText(R.string.Medium);
            }
            else{
                finalm.setText(R.string.Good);
            }
        }

    }

    public void restart(View view) {
        Intent intent = new Intent(GameOver.this, Test.class);
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        finish();
    }
}
