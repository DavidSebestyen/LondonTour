package com.davids.android.londontour;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by krypt on 01/11/2016.
 */

public class Contents {

    private int mImageResourceIdOne;
    private int mImageResourceIdTwo;
    private int mImageResourceIdThree;
    private String mName;
    private String mDescription;


    public Contents (int imageResourceIdOne, int imageResourceIdTwo, int imageResourceIdThree, String name, String description){

        mImageResourceIdOne = imageResourceIdOne;
        mImageResourceIdTwo = imageResourceIdTwo;
        mImageResourceIdThree = imageResourceIdThree;
        mName = name;
        mDescription = description;
    }

    public int getImageResourceIdOne(){return mImageResourceIdOne;}

    public int getImageResourceIdTwo(){return mImageResourceIdTwo;}

    public int getImageResourceIdThree(){return mImageResourceIdThree;}

    public String getName(){return mName;}

    public String getDescription(){return mDescription;}
}
