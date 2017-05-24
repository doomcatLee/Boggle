package com.example.guest.boggle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;



public class SubmitActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.randomStringTextView) TextView mRandomString;
    @Bind(R.id.userInputEditText) EditText mUserInput;
    @Bind(R.id.submitButton) Button mSubmitButton;

    BoggleService service1 = new BoggleService("","");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
        mRandomString.setText(service1.textGenerator());

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(SubmitActivity.this, ResultActivity.class);
        String userInput = mUserInput.getText().toString();
        intent.putExtra("userInput", userInput);
        startActivity(intent);
    }

}
