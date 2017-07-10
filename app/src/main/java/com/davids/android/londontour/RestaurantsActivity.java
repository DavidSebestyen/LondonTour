package com.davids.android.londontour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by krypt on 01/11/2016.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        final ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents(R.drawable.jones_family_1, R.drawable.jones_family_2, R.drawable.jones_family_3, getString(R.string.jones_name), getString(R.string.jones_description_1) +
                getString(R.string.jones_description_2) +
                getString(R.string.jones_description_3)));
        contents.add(new Contents(R.drawable.dead_doll_1, R.drawable.dead_doll_2, R.drawable.dead_doll_3, getString(R.string.dead_name), getString(R.string.dead_description_1) +
                getString(R.string.dead_description_2)));
        contents.add(new Contents(R.drawable.blues_kitchen_1, R.drawable.blues_kitchen_2, R.drawable.blues_kitchen_3, getString(R.string.blues_name), getString(R.string.blues_description_1) +
                getString(R.string.blues_description_2)));
        contents.add(new Contents(R.drawable.fu_manchu_1, R.drawable.fu_manchu_2, R.drawable.fu_manchu_3, getString(R.string.fu_name), getString(R.string.fu_description_1) +
                getString(R.string.fu_description_2)));



        ContentAdapter adapter = new ContentAdapter(this, contents);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

