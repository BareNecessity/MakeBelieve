package com.example.landingpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class SignUp extends AppCompatActivity {
    private EditText firstNameEdit, LastNameEdit, PhoneNumberEdit, passWordEdit;
    private CountryCodePicker ccp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        init ();
        

    }

    private void init() {
        ccp = findViewById(R.id.ccp);
       PhoneNumberEdit = findViewById(R.id.PhoneNumber); b
    }

}