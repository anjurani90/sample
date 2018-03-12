package com.fourtek.sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private UserClass userClass ;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        context = SecondActivity.this;

        userClass = MainActivity.getInstance();

        TextView tvText2 = (TextView) findViewById(R.id.tvText2);
        TextView tvText = (TextView) findViewById(R.id.tvText);

        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataResult dataResult = new DataResult();
                dataResult.setAge("12");
                dataResult.setName("abc");
                dataResult.setRoll_no("13");
                userClass.onSuccess(context, dataResult);
                finish();
            }
        });

        tvText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userClass.onFailure(context, "failure");
                finish();
            }
        });

    }
}
