package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText user, pass, email;
    private RadioGroup fm_gender;
    private RadioButton mf;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        email = findViewById(R.id.email);
        fm_gender = findViewById(R.id.fm_gender);
        btn_send = findViewById(R.id.btn_send);



        btn_send.setOnClickListener(v->{

            int idRadio = fm_gender.getCheckedRadioButtonId();
            mf = findViewById(idRadio);

            Intent mIntent = new Intent(this, activity_intent.class);
            mIntent.putExtra(AppConstants.TEXT_USER, user.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_PASS, pass.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL, email.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_GENDER, mf.getText().toString());



            startActivity(mIntent);
        });
    }
}


