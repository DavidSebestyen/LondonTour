package com.davids.android.londontour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by krypt on 01/11/2016.
 */

public class ContentAdapter extends ArrayAdapter<Contents> {
    public ContentAdapter(Context context, ArrayList<Contents> contents){
            super(context, 0, contents);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        Contents currentContent = getItem(position);

        ImageView pictureImageViewOne = (ImageView) listItemView.findViewById(R.id.image_1);
        pictureImageViewOne.setImageResource(currentContent.getImageResourceIdOne());

        ImageView pictureImageViewTwo = (ImageView) listItemView.findViewById(R.id.image_2);
        pictureImageViewTwo.setImageResource(currentContent.getImageResourceIdTwo());

        ImageView pictureImageViewThree = (ImageView) listItemView.findViewById(R.id.image_3);
        pictureImageViewThree.setImageResource(currentContent.getImageResourceIdThree());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentContent.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentContent.getDescription());

        return listItemView;

    }
}