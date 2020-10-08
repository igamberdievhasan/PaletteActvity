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
        secL.setBackgroundColor(Color.parseColor(color[position]));

        if(color[position].equals("Black")){
            colorName.setTextColor(Color.WHITE);
        }else {
            colorName.setTextColor(Color.BLACK);

        }
        View secondB = findViewById(R.id.colorName);
        secondB.setBackgroundColor(Color.parseColor(color[position]));

    }
}
