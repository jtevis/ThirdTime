package com.vis.thirdtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.view.Display;



/**
 * Created by XPS13 on 5/8/2017.
 */

public class display3 extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display3);
    }
    public void onClickLogin(View v)
    {
        if(v.getId() == R.id.Blogin)
        {
            EditText a = (EditText) findViewById(R.id.TFusername);
            String str = a.getText().toString();

            Intent i = new Intent(display3.this, grid_welcome2.class);
            i.putExtra("Username",str);
            startActivity (i);

        }
    }

}
