package com.example.guest.boggle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{


    @Bind(R.id.userWordTextView)
    TextView mUserWord;

    @Bind(R.id.startAgainButton)
    Button mStartAgainButton;

    @Bind(R.id.resultTextView)
    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String userInput = intent.getStringExtra("userInput");
        String randomString = intent.getStringExtra("randomString");
        BoggleService service = new BoggleService(userInput, randomString);

        if (service.validator(userInput)){
            mResult.setText("You've Won!");
        }else{
            mResult.setText("You've Lost!");
        }


        mUserWord.setText(userInput);
        mStartAgainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v == mStartAgainButton){
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }


}
