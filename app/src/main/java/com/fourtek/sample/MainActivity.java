package com.fourtek.sample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Context context;
    private static UserClass userClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        TextView tvText = (TextView) findViewById(R.id.tvText);

        userClass = new UserClass() {
            @Override
            public void onSuccess(Context context, DataResult dataResult) {
                super.onSuccess(context, dataResult);
                if(dataResult!=null){
                    Toast.makeText(context, "mainActivity::"+dataResult.getName() +"::"+ dataResult.getAge()+"::"+ dataResult.getRoll_no(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Context context, String msg) {
                super.onFailure(context, msg);
                if(null!=msg && !msg.equalsIgnoreCase("")){
                    Toast.makeText(context, "mainActivity::" + msg, Toast.LENGTH_SHORT).show();
                }
            }
        };


        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, SecondActivity.class));
                /*FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ThanksFragment llf = new ThanksFragment(userClass);
                ft.replace(R.id.frame, llf);
                ft.commit();*/
            }
        });

    }

    public static UserClass getInstance(){
        return userClass;
    }
}
