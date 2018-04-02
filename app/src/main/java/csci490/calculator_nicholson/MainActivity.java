package csci490.calculator_nicholson;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input;
    Button cButton;
    Button ceButton;
    Button divideButton;
    Button multiplyButton;
    Button minusButton;
    Button addButton;
    Button equalsButton;
    Button decimalButton;
    Button posOrNegButton;
    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button zeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        cButton = findViewById(R.id.c);
        ceButton = findViewById(R.id.ce);
        divideButton = findViewById(R.id.divide);
        multiplyButton = findViewById(R.id.multiply);
        minusButton = findViewById(R.id.minus);
        addButton = findViewById(R.id.add);
        equalsButton = findViewById(R.id.equals);
        decimalButton = findViewById(R.id.decimal);
        posOrNegButton = findViewById(R.id.posOrNeg);
        oneButton = findViewById(R.id.one);
        twoButton = findViewById(R.id.two);
        threeButton = findViewById(R.id.three);
        fourButton = findViewById(R.id.four);
        fiveButton = findViewById(R.id.five);
        sixButton = findViewById(R.id.six);
        sevenButton = findViewById(R.id.seven);
        eightButton = findViewById(R.id.eight);
        nineButton = findViewById(R.id.nine);
        zeroButton = findViewById(R.id.zero);

        /*final Vibrator vibrate = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrate.vibrate(80);//80 represents the milliseconds (the duration of the vibration)

            }
        });*/
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
    }
}


