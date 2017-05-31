package com.vis.thirdtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by XPS13 on 5/30/2017.
 */

public class grid_welcome2 extends AppCompatActivity
{

    GridView androidGridView;

    String[] gridViewString = {
            "Party Planner", "Drinks Library", "Herbs Library",

    } ;
    int[] gridViewImageId = {
            R.drawable.partyhats, R.drawable.tree_library,R.drawable.tree_library,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_welcome2);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(grid_welcome2.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.welcome_grid);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(grid_welcome2.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}
