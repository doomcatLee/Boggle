package com.example.guest.boggle;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;



public class SubmitActivity extends AppCompatActivity {

    @Bind(R.id.randomStringTextView) TextView mRandomString;

    BoggleService service1 = new BoggleService("","");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        ButterKnife.bind(this);

        mRandomString.setText(service1.textGenerator());


    }
}
