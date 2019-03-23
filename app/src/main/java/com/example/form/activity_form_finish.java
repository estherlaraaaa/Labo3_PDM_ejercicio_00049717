package com.example.form;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_form_finish extends AppCompatActivity {

    private TextView ff_useer, ff_pass, ff_email, ff_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_finish);

        ff_useer = findViewById(R.id.ff_user);
        ff_pass = findViewById(R.id.ff_pass);
        ff_email = findViewById(R.id.ff_email);
        ff_gender = findViewById(R.id.ff_gender);

        Intent mIntent = getIntent();

        if (mIntent!=null){

            ff_useer.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            ff_pass.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            ff_email.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            ff_gender.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));

        }

    }
}
