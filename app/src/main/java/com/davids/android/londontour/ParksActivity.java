package com.davids.android.londontour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by krypt on 01/11/2016.
 */

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        final ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents(R.drawable.hyde_1, R.drawable.hyde_2, R.drawable.hyde_3, getString(R.string.hyde_name), getString(R.string.hyde_description_1) +
                getString(R.string.hyde_description_2) +
                getString(R.string.hyde_description_3)));
        contents.add(new Contents(R.drawable.regents_1, R.drawable.regents_2, R.drawable.regents_3, getString(R.string.regents_name), getString(R.string.regents_description_1) +
                getString(R.string.regents_description_2) +
                getString(R.string.regents_description_3)));
        contents.add(new Contents(R.drawable.greenwich_1, R.drawable.greenwich_2, R.drawable.greenwhich_3, getString(R.string.greenwich_name), getString(R.string.greenwich_description_1) +
                getString(R.string.greenwich_description_2) +
                getString(R.string.greenwich_description_3)));


        ContentAdapter adapter = new ContentAdapter(this, contents);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
