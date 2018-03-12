package com.fourtek.sample;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by fourtek on 16/1/18.
 */

public abstract class UserClass implements UserInterface, Serializable {

    @Override
    public void onSuccess(Context context, DataResult dataResult) {
        //Toast.makeText(context, dataResult.getName() +"::"+ dataResult.getAge()+"::"+ dataResult.getRoll_no(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Context context,String msg) {
        //Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
