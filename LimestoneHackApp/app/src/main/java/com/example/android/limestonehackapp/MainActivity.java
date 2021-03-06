package com.example.android.limestonehackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBinaryDrop(View view){
        ImageView binaryImg = (ImageView)findViewById(R.id.binaryImg);
        TextView binaryInstruction = (TextView) findViewById(R.id.bin_how_to_play);
        Button binBtn = (Button)findViewById(R.id.bin_button);

        if (binaryImg.getVisibility() == View.VISIBLE){
            binaryImg.setVisibility(View.GONE);
            binaryInstruction.setVisibility(View.GONE);
            binBtn.setVisibility(View.GONE);
        }
        else {
            binaryImg.setVisibility(View.VISIBLE);
            binaryInstruction.setVisibility(View.VISIBLE);
            binBtn.setVisibility(View.VISIBLE);
        }
    }

    public void openBinarySearch(View view){
        Intent intent = new Intent(this, BinarySearchActivity.class);
        startActivity(intent);
    }

    public void showExtraHelpDrop(View view){
        ImageView foxImg = (ImageView)findViewById(R.id.foxImg);
        TextView extraInstruction = (TextView) findViewById(R.id.extra_help_instruction);
        Button extraBtn = (Button)findViewById(R.id.extra_help_button);

        if (extraInstruction.getVisibility() == View.VISIBLE){
            extraInstruction.setVisibility(View.GONE);
            extraBtn.setVisibility(View.GONE);
            foxImg.setVisibility(View.GONE);
        }
        else {
            foxImg.setVisibility(View.VISIBLE);
            extraInstruction.setVisibility(View.VISIBLE);
            extraBtn.setVisibility(View.VISIBLE);
        }
    }

    public void openRecursion(View view){
        Intent intent = new Intent(this, HanoiActivity.class);
        startActivity(intent);
    }

    public void showHanoiDrop(View view) {
        TextView hanoiInstruction = (TextView) findViewById(R.id.hanoi_instruction);
        Button hanoiBtn = (Button) findViewById(R.id.hanoi_button);

        if (hanoiInstruction.getVisibility() == View.VISIBLE) {
            hanoiInstruction.setVisibility(View.GONE);
            hanoiBtn.setVisibility(View.GONE);
        } else {
            hanoiInstruction.setVisibility(View.VISIBLE);
            hanoiBtn.setVisibility(View.VISIBLE);
        }
    }

    public void showLinkedListDrop(View view){
        ImageView foxImg1 = (ImageView)findViewById(R.id.foxImg1);
        ImageView foxImg2 = (ImageView)findViewById(R.id.foxImg2);
        ImageView foxImg3 = (ImageView)findViewById(R.id.foxImg3);
        Button linkBtn = (Button)findViewById(R.id.linked_button);
        TextView linkedText = (TextView)findViewById(R.id.linked_list_description);


        if (foxImg1.getVisibility() == View.VISIBLE){
            foxImg1.setVisibility(View.GONE);
            foxImg2.setVisibility(View.GONE);
            foxImg3.setVisibility(View.GONE);
            linkBtn.setVisibility(View.GONE);
            linkedText.setVisibility(View.GONE);
        }
        else {
            foxImg1.setVisibility(View.VISIBLE);
            foxImg2.setVisibility(View.VISIBLE);
            foxImg3.setVisibility(View.VISIBLE);
            linkBtn.setVisibility(View.VISIBLE);
            linkedText.setVisibility(View.VISIBLE);
        }
    }

    public void openLinkedList(View view){
        Intent intent = new Intent(this, LinkedListActivity.class);
        startActivity(intent);
    }

    public void openExtraHelp(View view){
        Intent intent = new Intent(this, ExtraHelpActivity.class);
        startActivity(intent);
    }
}
