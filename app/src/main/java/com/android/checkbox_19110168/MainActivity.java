package com.android.checkbox_19110168;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CheckBox mChocolate, mSprinkle, mCrushedNut, mCherry, mOrioCookie;
    private Button mShowToast;
    public List<String> result = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChocolate = findViewById(R.id.check_chocolate);
        mSprinkle = findViewById(R.id.check_sprinkle);
        mCrushedNut = findViewById(R.id.check_crushed_nut);
        mCherry = findViewById(R.id.check_cherry);
        mOrioCookie = findViewById(R.id.check_orio_cookie);

        mShowToast = findViewById(R.id.show_toast);
        mChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChocolate.isChecked()){
                    result.add(mChocolate.getText().toString());
                }else{
                    result.remove(mChocolate.getText().toString());
                }
            }
        });

        mSprinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mSprinkle.isChecked()){
                    result.add(mSprinkle.getText().toString());
                }else{
                    result.remove(mSprinkle.getText().toString());
                }
            }
        });

        mCrushedNut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mCrushedNut.isChecked()){
                    result.add(mCrushedNut.getText().toString());
                }else{
                    result.remove(mCrushedNut.getText().toString());
                }
            }
        });

        mCherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCherry.isChecked()){
                    result.add(mCherry.getText().toString());
                }else{
                    result.remove(mCherry.getText().toString());
                }
            }
        });

        mOrioCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mOrioCookie.isChecked()){
                    result.add(mOrioCookie.getText().toString());
                }else{
                    result.remove(mOrioCookie.getText().toString());
                }
            }
        });

        mShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.toArray().length > 0 ){
                    String message = "";
                    for(int i = 0; i < result.toArray().length; i++){
                        message = message + " "+  result.toArray()[i];
                    }
                    displayToast(message);
                }else{
                    displayToast("please choose your favorite item");
                }

            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}