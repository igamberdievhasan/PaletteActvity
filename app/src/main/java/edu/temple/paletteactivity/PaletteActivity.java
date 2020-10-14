package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridView;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import edu.temple.paletteactvity.R;

public class PaletteActivity extends AppCompatActivity{


    public String [] color = {"Teal","Red","Yellow","Blue","Green","Gray","Magenta","Cyan","Black","Maroon","Olive","Purple"};
    int size = color.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Palette Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        final String[] gridLabels = res.getStringArray(R.array.Col);

        final GridView simpleGrid = (GridView) findViewById(R.id.simpleGridView);

        ColorAdapter customAdapter = new ColorAdapter(getApplicationContext(), gridLabels);
        simpleGrid.setAdapter(customAdapter);

        TextView welcome = (TextView) findViewById(R.id.welcomeText);
        welcome.setText(R.string.welcome);

        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("position",position);
                intent.putExtra("color",gridLabels);
                startActivity(intent);
            }
        });
    }

}