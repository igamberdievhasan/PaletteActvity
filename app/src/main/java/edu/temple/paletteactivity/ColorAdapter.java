package edu.temple.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import edu.temple.paletteactvity.R;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private String color[];
    private LayoutInflater inflater;

    public ColorAdapter(Context applicationContext, String[] color) {
        this.context = applicationContext;
        this.color = color;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return color.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.gridviewlayout, null);

        TextView colorNames = view.findViewById(R.id.textView);

            colorNames.setText(color[i]);
            colorNames.setTextColor(Color.BLACK);
            colorNames.setBackgroundColor(Color.parseColor(color[i]));



        if (color[i].equals("Black")) {
            colorNames.setTextColor(Color.WHITE);
        }
        return view;
    }
}
