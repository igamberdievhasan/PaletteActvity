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
            if (color[i].equals("Sarcelle") || color[i].equals("Teal"))
                colorNames.setBackgroundColor(Color.parseColor("#008080"));
            else if(color[i].equals("Rouge") || color[i].equals("Red"))
                colorNames.setBackgroundColor(Color.parseColor("#ff0000"));
            else if(color[i].equals("Jaune") || color[i].equals("Yellow"))
                colorNames.setBackgroundColor(Color.parseColor("#ffff00"));
            else if(color[i].equals("Bleu") || color[i].equals("Blue"))
                colorNames.setBackgroundColor(Color.parseColor("#ff0000ff"));
            else if(color[i].equals("Vert") || color[i].equals("Green"))
                colorNames.setBackgroundColor(Color.parseColor("#ff00ff00"));
            else if(color[i].equals("Gris") || color[i].equals("Gray"))
                colorNames.setBackgroundColor(Color.parseColor("#ff444444"));
            else if(color[i].equals("Magenta") || color[i].equals("Magenta"))
                colorNames.setBackgroundColor(Color.parseColor("#ff00ffff"));
            else if(color[i].equals("Black") || color[i].equals("Noir"))
                colorNames.setBackgroundColor(Color.parseColor("#ff000000"));
            else if(color[i].equals("Marron") || color[i].equals("Maroon"))
                colorNames.setBackgroundColor(Color.parseColor("#800000"));
            else if(color[i].equals("Olive") || color[i].equals("Olive"))
                colorNames.setBackgroundColor(Color.parseColor("#808000"));
            else if(color[i].equals("Violet") || color[i].equals("Purple"))
                colorNames.setBackgroundColor(Color.parseColor("#800080"));

        if (color[i].equals("Black") || color[i].equals("Noir") ) {
            colorNames.setTextColor(Color.WHITE);
        }
        return view;
    }
}
