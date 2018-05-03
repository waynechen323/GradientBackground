package com.waynechen.gradientbackground;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BottomNavigationView) findViewById(R.id.navigation)).setOnNavigationItemSelectedListener(this);
        ((BottomNavigationView) findViewById(R.id.navigation)).setSelectedItemId(R.id.navigation_sample1);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.navigation_sample1:

                ((ConstraintLayout) findViewById(R.id.container))
                        .setBackgroundResource(R.drawable.background_gradient_0);
                return true;
            case R.id.navigation_sample2:

                ((ConstraintLayout) findViewById(R.id.container))
                        .setBackgroundResource(R.drawable.background_gradient_45);
                return true;
            case R.id.navigation_sample3:

                ((ConstraintLayout) findViewById(R.id.container))
                        .setBackgroundResource(R.drawable.background_gradient_3c);
                return true;
        }
        return false;
    }
}
