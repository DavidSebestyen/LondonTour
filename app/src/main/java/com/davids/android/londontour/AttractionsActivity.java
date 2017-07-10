package com.davids.android.londontour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;

/**
 * Created by krypt on 01/11/2016.
 */

@SuppressWarnings("HardCodedStringLiteral")
public class AttractionsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        final ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents(R.drawable.bigben_3, R.drawable.bigben_2, R.drawable.bigben_4, getString(R.string.big_ben_name), "The Houses of Parliament and Elizabeth Tower, commonly called Big Ben, are among London's most iconic landmarks and must-see London attractions. \n" +
                getString(R.string.big_ben_description)
                ));
        contents.add(new Contents(R.drawable.londoneye_1, R.drawable.londoneye_2, R.drawable.londoneye_3, getString(R.string.london_eye_name), getString(R.string.london_eye_description) +
                getString(R.string.london_eye_description_2) +
                getString(R.string.london_eye_description_3)));
        contents.add(new Contents(R.drawable.buckingham_1, R.drawable.buckingham_2, R.drawable.buckingham_3, getString(R.string.buckingham_palace), getString(R.string.buckingham_description_1) +
                getString(R.string.buckingham_description_2) +
                getString(R.string.buckingham_description_3)));


        ContentAdapter adapter = new ContentAdapter(this, contents);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
