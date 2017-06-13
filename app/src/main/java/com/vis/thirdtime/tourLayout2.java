package com.vis.thirdtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by XPS13 on 6/1/2017.
 */

public class tourLayout2 extends AppCompatActivity
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
                "Ready for a party? Let Social Greens help to make it an event. The first step is to choose the type of party. ",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Mallory Needs to Write Something",
                "Joe Needs to Write Something",
        };

        String[] tourMore = new String[]{
            "more.....", "", "more....", "",
            "more....", "","more...."
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
                hm.put("listview_more", tourMore[i]);
                hm.put("listview_image", Integer.toString(listviewImage[i]));
                aList.add(hm);
            }

            String[] from = {"listview_image", "listview_title","listview_discription","listview_more"};
            int[] to = {R.id.tour_image, R.id.tour_title,R.id.tour_text,R.id.tour_more};

            SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.tour_model2, from, to);
            ListView androidListView = (ListView) findViewById(R.id.tour_listview);
            androidListView.setAdapter(simpleAdapter);
        }
}
