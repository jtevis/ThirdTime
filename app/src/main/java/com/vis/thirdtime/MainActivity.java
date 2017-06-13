package com.vis.thirdtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMe (View v)
    {

        if (v.getId() == R.id.Cbutton)
        {
            Intent i = new Intent(MainActivity.this, display3.class);
            startActivity (i);
        }

    }
    public void onClickAccount (View v)
    {

        if (v.getId() == R.id.Cnew_account)
        {
            Intent i = new Intent(MainActivity.this, create_account.class);
            startActivity (i);
        }

    }
    public void onClickTour (View v)
    {

        if (v.getId() == R.id.Ctour)
        {
            Intent i = new Intent(MainActivity.this, tourLayout2.class);
            startActivity (i);
        }

    }

}
