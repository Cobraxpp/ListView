package com.example.myapplication;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;



public class Adapter extends ArrayAdapter<Item> {
    private final List<Item> items;
    private final Context context;
    private final TextView selectedText;
    private final ImageView selectedImage;
    private final LinearLayout selectionBox;

    public Adapter(Context context, List<Item> items, TextView selectedText, ImageView selectedImage, LinearLayout selectionBox) {
        super(context, R.layout.list_item, items);
        this.context = context;
        this.items = items;
        this.selectedText = selectedText;
        this.selectedImage = selectedImage;
        this.selectionBox = selectionBox;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }


        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);
        RadioButton radioButton = convertView.findViewById(R.id.radioButton);


        Item item = items.get(position);


        imageView.setImageResource(item.getImageResId());
        textView.setText(item.getText());
        radioButton.setChecked(item.isSelected());


        radioButton.setOnClickListener(v -> {

            for (Item i : items) {
                i.setSelected(false);
            }
            item.setSelected(true);


            selectedText.setText("Seleccionaste: " + item.getText());
            selectedImage.setImageResource(item.getImageResId());
            selectionBox.setVisibility(View.VISIBLE);

            notifyDataSetChanged();
        });

        return convertView;
    }
}
