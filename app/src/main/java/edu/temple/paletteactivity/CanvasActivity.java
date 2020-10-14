package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import edu.temple.paletteactvity.R;

public class CanvasActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Canvas Activity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorlayout);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int position = extras.getInt("position");
        String [] color = extras.getStringArray("color");

        ConstraintLayout secL = (ConstraintLayout) findViewById(R.id.secondL);
        TextView colorName = findViewById(R.id.colorName);

        colorName.setText(color[position]);
        colorName.setTextSize(48);
        if (color[position].equals("Sarcelle") || color[position].equals("Teal")) {
            colorName.setBackgroundColor(Color.parseColor("#008080"));
            secL.setBackgroundColor(Color.parseColor("#008080"));
        }else if(color[position].equals("Rouge") || color[position].equals("Red")) {
            colorName.setBackgroundColor(Color.parseColor("#ff0000"));
            secL.setBackgroundColor(Color.parseColor("#ff0000"));
        }else if(color[position].equals("Jaune") || color[position].equals("Yellow")) {
            colorName.setBackgroundColor(Color.parseColor("#ffff00"));
            secL.setBackgroundColor(Color.parseColor("#ffff00"));
        }else if(color[position].equals("Bleu") || color[position].equals("Blue")) {
            colorName.setBackgroundColor(Color.parseColor("#ff0000ff"));
            secL.setBackgroundColor(Color.parseColor("#ff0000ff"));
        }else if(color[position].equals("Vert") || color[position].equals("Green")) {
            colorName.setBackgroundColor(Color.parseColor("#ff00ff00"));
            secL.setBackgroundColor(Color.parseColor("#ff00ff00"));
        }else if(color[position].equals("Gris") || color[position].equals("Gray")) {
            colorName.setBackgroundColor(Color.parseColor("#ff444444"));
            secL.setBackgroundColor(Color.parseColor("#ff444444"));
        }else if(color[position].equals("Magenta") || color[position].equals("Magenta")) {
            colorName.setBackgroundColor(Color.parseColor("#ff00ffff"));
            secL.setBackgroundColor(Color.parseColor("#ff00ffff"));
        }else if(color[position].equals("Black") || color[position].equals("Noir")) {
            colorName.setBackgroundColor(Color.parseColor("#ff000000"));
            secL.setBackgroundColor(Color.parseColor("#ff000000"));
        }else if(color[position].equals("Marron") || color[position].equals("Maroon")) {
            colorName.setBackgroundColor(Color.parseColor("#800000"));
            secL.setBackgroundColor(Color.parseColor("#800000"));
        }else if(color[position].equals("Olive") || color[position].equals("Olive")) {
            colorName.setBackgroundColor(Color.parseColor("#808000"));
            secL.setBackgroundColor(Color.parseColor("#808000"));
        }else if(color[position].equals("Violet") || color[position].equals("Purple")) {
            colorName.setBackgroundColor(Color.parseColor("#800080"));
            secL.setBackgroundColor(Color.parseColor("#800080"));
        }

        if (color[position].equals("Black") || color[position].equals("Noir") ) {
            colorName.setTextColor(Color.WHITE);
        }else {
            colorName.setTextColor(Color.BLACK);

        }

        //View secondB = findViewById(R.id.sec);
        //secondB.setBackgroundColor(Color.parseColor(color[position]));

    }
}
