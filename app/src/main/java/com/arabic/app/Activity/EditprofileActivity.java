package com.arabic.app.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;

import com.arabic.app.R;


public class EditprofileActivity extends Activity {

    private EditText etNewpassPass , et_newpass_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_new_pass);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etNewpassPass = (EditText)findViewById(R.id.et_newpass_pass);
        et_newpass_email = (EditText)findViewById(R.id.et_newpass_email);



    }



}
