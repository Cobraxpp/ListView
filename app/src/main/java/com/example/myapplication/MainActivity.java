package com.example.myapplication;




import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.img, "Elemento 1"));
        items.add(new Item(R.drawable.img_1, "Elemento 2"));
        items.add(new Item(R.drawable.img_2, "Elemento 3"));
        items.add(new Item(R.drawable.img_3, "Elemento 4"));
        items.add(new Item(R.drawable.img_4, "Elemento 5"));
        items.add(new Item(R.drawable.img_5, "Elemento 6"));
        items.add(new Item(R.drawable.img_6, "Elemento 7"));
        items.add(new Item(R.drawable.img_7, "Elemento 8"));


        ListView listView = findViewById(R.id.listView);


        TextView selectedText = findViewById(R.id.selectedText);
        ImageView selectedImage = findViewById(R.id.selectedImage);
        LinearLayout selectionBox = findViewById(R.id.selectionBox);


       Adapter adapter = new Adapter(this, items, selectedText, selectedImage, selectionBox);
        listView.setAdapter(adapter);
    }
}
