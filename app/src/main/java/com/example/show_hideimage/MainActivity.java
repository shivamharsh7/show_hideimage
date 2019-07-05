package com.example.show_hideimage;




//import android.graphics.Color;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

//import android.widget.Button;

import android.widget.CheckBox;

import android.widget.ImageView;

import android.widget.RadioButton;

//import android.widget.RelativeLayout;

import android.widget.Switch;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    private ImageView img, imgBtn;

    private Switch showImg;

    private RadioButton enable, disable;

    private CheckBox showImgBtn;





    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        img = findViewById(R.id.img);

        imgBtn = findViewById(R.id.imgbtn);

        showImg = findViewById(R.id.show_hide_img);

        enable = findViewById(R.id.radioBtnE);

        disable = findViewById(R.id.radioBtnD);

        showImgBtn = findViewById(R.id.show_hide_imgBtn);



        enable.setChecked(true);

    }



    public void imgBtnPressed(View view) {

        Toast.makeText(this, "Image Button Pressed", Toast.LENGTH_SHORT).show();

    }



    public void refresh(View view) {



        if(showImg.isChecked()) {

            img.setVisibility(View.VISIBLE);

        } else {

            img.setVisibility(View.INVISIBLE);

        }



        if(enable.isChecked()) {

            imgBtn.setClickable(true);

        } else if(disable.isChecked()) {

            imgBtn.setClickable(false);

        }



        if(showImgBtn.isChecked()) {

            imgBtn.setVisibility(View.VISIBLE);

        } else {

            imgBtn.setVisibility(View.INVISIBLE);

        }





    }



}