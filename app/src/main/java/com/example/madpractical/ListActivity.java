package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Random;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Profile");
        builder.setMessage("This practical is crazy");
        builder.setCancelable(false);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                dialog.cancel();
            }
        });
        builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                Random rand = new Random(); //instance of random class
                Integer randint = rand.nextInt();
                Intent randAct = new Intent(ListActivity.this, MainActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("int",randint);
                randAct.putExtras(extras);
                startActivity(randAct);
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}