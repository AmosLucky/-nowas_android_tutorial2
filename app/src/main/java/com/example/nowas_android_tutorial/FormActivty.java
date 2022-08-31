package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivty extends AppCompatActivity {
    EditText usernameEd, passwordEd;
    Spinner spinner;
    Button button;
    String[] qualifications = {"SSCE","ND","HND","BSC","MASTERS","DR"};
    AlertDialog.Builder alertBuilder;
    RadioGroup radioGender;
    CheckBox riceCheckBox,beansCheckBox, yamCheckBox;
    SeekBar seekBar;
    TextView percent;
    RadioButton maleRadiobtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_activty);

        usernameEd = findViewById(R.id.username);
        passwordEd = findViewById(R.id.password);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.submit);
        alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle("Successfully submited");


        /////////?TODAT CLASS////////

        radioGender = findViewById(R.id.gender);
        riceCheckBox = findViewById(R.id.rice);
        beansCheckBox = findViewById(R.id.beans);
        yamCheckBox = findViewById(R.id.yam);
        seekBar = findViewById(R.id.seekbar);
        percent = findViewById(R.id.percent);
        maleRadiobtn = findViewById(R.id.male);


        /////////PICK VALUES//////
        maleRadiobtn.setChecked(true);
        radioGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id == R.id.male){
                    Toast.makeText(FormActivty.this,"You selected male",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(FormActivty.this,"You selected Female",Toast.LENGTH_LONG).show();


                }

            }
        });

        /////////CHECKBOXES////
        riceCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(FormActivty.this,"You like rice",Toast.LENGTH_LONG).show();

                }
            }
        });
        beansCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(FormActivty.this,"You like beans",Toast.LENGTH_LONG).show();

                }
            }
        });
        yamCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(FormActivty.this,"You like Yam",Toast.LENGTH_LONG).show();

                }
            }
        });

        ///////////?SEEKBAR/////////

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                percent.setText(String.valueOf(i));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        /////////?TODAT CLASS////////




        alertBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //finish();

            }
        });

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,qualifications);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameTXT =  usernameEd.getText().toString();
                String passwordTXT =  passwordEd.getText().toString();
                String qualification = spinner.getSelectedItem().toString();

                if(usernameTXT.trim().isEmpty()){
                    usernameEd.setError("Username cant be empty");
                    Toast.makeText(getApplicationContext(),"Username cant be empty",Toast.LENGTH_LONG).show();
                    return;
                }
                if(passwordTXT.trim().isEmpty()){
                    passwordEd.setError("password cant be empty");
                    Toast.makeText(getApplicationContext(),"password cant be empty",Toast.LENGTH_LONG).show();
                    return;
                }

                Log.i("username",usernameTXT);
                Log.i("password",passwordTXT);

                String userDetails = "Username: "+usernameTXT +"\n passoword: "+passwordTXT+ "\n Qualifiction: "+qualification;
                alertBuilder.setMessage(userDetails);
                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();

                usernameEd.setText("");
                passwordEd.setText("");

            }
        });


    }
}