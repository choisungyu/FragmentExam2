package com.csg.fragmentexam2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                ColorFragment colorFragment = ColorFragment.newInstance(Color.WHITE);
                colorFragment.setColor(Color.YELLOW);
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container1, colorFragment)
                        .commit();
                break;
            case R.id.button2:
                ColorFragment colorFragment2 = ColorFragment.newInstance(Color.WHITE);
                colorFragment2.setColor(Color.BLUE);
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container2, colorFragment2)
                        .commit();
                break;
            case R.id.button3:
                ColorFragment colorFragment3 = ColorFragment.newInstance(Color.WHITE);
                colorFragment3.setColor(Color.GREEN);
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container3, colorFragment3)
                        .commit();
                break;

        }
    }
}
