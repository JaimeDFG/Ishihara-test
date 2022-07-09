package lord.apps.ishiharatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ZoomButtonsController;

public class MainActivity extends AppCompatActivity {

    private Button instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void instructions(View view) {
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }

    public void start(View view) {
        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }
}
//video 1 de sandip minuto 6

