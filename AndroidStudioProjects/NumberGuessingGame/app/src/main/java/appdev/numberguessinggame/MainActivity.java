package appdev.numberguessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int guess;
    private int max;
    private int min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra(NumberGuesser.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main);
        layout.addView(textView);

        Random rndGen = new Random();
        guess = rndGen.nextInt(100);
        min = 1;
        max = 100;
    }

    public void higher(View view) {

    }

    public void lower(View view) {

    }

    public void correct(View view) {

    }
}
