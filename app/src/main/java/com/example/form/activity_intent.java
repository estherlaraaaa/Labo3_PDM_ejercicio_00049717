package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activity_intent extends AppCompatActivity {

    private TextView tv_user, tv_pass, tv_email, tv_gender;
    private Button tv_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        tv_user = findViewById(R.id.tv_user);
        tv_pass = findViewById(R.id.tv_pass);
        tv_email = findViewById(R.id.tv_email);
        tv_gender = findViewById(R.id.tv_gender);
        tv_share = findViewById(R.id.tv_share);



        Intent mIntent = this.getIntent();

        if(mIntent != null){

            tv_user.setText(mIntent.getStringExtra(AppConstants.TEXT_USER));
            tv_pass.setText(mIntent.getStringExtra(AppConstants.TEXT_PASS));
            tv_email.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));
            tv_gender.setText(mIntent.getStringExtra(AppConstants.TEXT_GENDER));
        }

        tv_share.setOnClickListener(v ->{
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
           /* shareIntent.putExtra(AppConstants.TEXT_USER, tv_user.getText().toString());
            shareIntent.putExtra(AppConstants.TEXT_PASS, tv_pass.getText().toString());
            shareIntent.putExtra(AppConstants.TEXT_EMAIL, tv_email.getText().toString());
            shareIntent.putExtra(AppConstants.TEXT_GENDER, tv_gender.getText().toString());*/

            shareIntent.putExtra(Intent.EXTRA_TEXT,"Username: " + tv_user.getText().toString() + " " + "Password: " + tv_pass.getText().toString()
                    + " " + "Email: " + tv_email.getText().toString() + " " + "Gender: " + tv_gender.getText().toString());

            startActivity(shareIntent);
        });
    }
}

