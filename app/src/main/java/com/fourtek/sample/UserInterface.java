package com.fourtek.sample;

import android.content.Context;


/**
 * Created by fourtek on 16/1/18.
 */

public interface UserInterface {

    public void onSuccess(Context context, DataResult dataResult);

    public void onFailure(Context context, String msg);
}
