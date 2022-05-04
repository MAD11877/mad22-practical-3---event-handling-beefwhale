package com.example.madpractical;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    User test = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receivingEnd = getIntent(); // getting intent
        Integer randInt  = receivingEnd.getIntExtra("int", 0); // getting value
        TextView textView2 = (TextView) findViewById(R.id.textView2); // get the textview id
        textView2.setText("MAD " + randInt);// change textview
    }

    public void onClick(View view) {
        Button btn_flw = findViewById(R.id.followedbutton);
        if(view.getId() == R.id.followedbutton) {

            if (test.followed == false){
                test.followed = true;
                btn_flw.setText("Unfollow");
                Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT ).show();
            }
            else{
                test.followed = false;
                btn_flw.setText("Follow");
                Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT ).show();
            }
        }
    }
    public void msgClick(View view) {
        Button btn_flw = findViewById(R.id.button3);
        if(view.getId() == R.id.button3) {
            Intent newInt = new Intent(MainActivity.this, MessageGroup.class);
            startActivity(newInt);

        }
    }

}

