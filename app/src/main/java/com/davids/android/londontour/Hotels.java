package com.davids.android.londontour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by krypt on 01/11/2016.
 */

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        final ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents(R.drawable.savoy_1, R.drawable.savoy_2, R.drawable.savoy_3, getString(R.string.savoy_name), getString(R.string.savoy_description_1) +
                getString(R.string.savoy_description_2)));
        contents.add(new Contents(R.drawable.dorchester_1, R.drawable.dorchester_2, R.drawable.dorchester_3, getString(R.string.dorchester_name), getString(R.string.dorchester_description_1)));
        contents.add(new Contents(R.drawable.browns_1, R.drawable.browns_2, R.drawable.browns_3, getString(R.string.browns_name), getString(R.string.browns_description)));


        ContentAdapter adapter = new ContentAdapter(this, contents);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
