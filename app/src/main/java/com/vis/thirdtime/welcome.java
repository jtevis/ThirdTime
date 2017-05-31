package com.vis.thirdtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.View;

/**
 * Created by XPS13 on 5/8/2017.
 */

public class welcome extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.welcome);


    }


    public void onClickParty(View v)
    {

        if (v.getId() == R.id.BParty)
        {
            Intent i = new Intent(welcome.this, pplanner.class);
            startActivity (i);
        }

    }
    public void onClickLibrary(View v)
    {

        if (v.getId() == R.id.BLibrary)
        {
            Intent i = new Intent(welcome.this, layout_library.class);
            startActivity (i);
        }

    }
}
