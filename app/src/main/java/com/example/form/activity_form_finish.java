package com.example.form;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_form_finish extends AppCompatActivity {

    private TextView tv_information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_finish);

        tv_information = findViewById(R.id.tv_information);

        Intent mIntent = getIntent();

        if (mIntent!=null){

            this.tv_information.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}
