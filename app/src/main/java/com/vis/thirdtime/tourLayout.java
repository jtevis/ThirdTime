package com.vis.thirdtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.reflect.Array.getLength;


/**
 * Created by XPS13 on 6/1/2017.
 */

public class tourLayout extends AppCompatActivity
{
        // Array of strings for ListView Titl

        int[] listviewImage = new int[]{
                R.drawable.partyhats, R.drawable.drinks, R.drawable.herb_lib, R.drawable.crop_plan,
                R.drawable.whats_growing, R.drawable.trade,R.drawable.analytics,
        };

        String[] tourTitle = new String[]{
                "Party Planner", "Drinks Library", "Herbs Library", "Plan a Crop",
                "What's Growing", "Herb Trader","Data Analytics"
        };

        String[] listviewShortDescription = new String[]{
                "Ready for a party? Let Social Greens help to make it an event. The first step is to choose the type of party.  This could be a customer event such as a birthday or possibly a national holiday.",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Joe Needs to Write Something",
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tour_layout);

            List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

            for (int i = 0; i < 7; i++) {
                HashMap<String, String> hm = new HashMap<String, String>();
                hm.put("listview_discription", listviewShortDescription[i]);
                hm.put("listview_title", tourTitle[i]);
                hm.put("listview_image", Integer.toString(listviewImage[i]));
                aList.add(hm);
            }

            String[] from = {"listview_image", "listview_title","listview_discription"};
            int[] to = {R.id.tour_image, R.id.tour_title,R.id.tour_text};

            SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.tour_model, from, to);
            ListView androidListView = (ListView) findViewById(R.id.tour_listview);
            androidListView.setAdapter(simpleAdapter);
        }
}
