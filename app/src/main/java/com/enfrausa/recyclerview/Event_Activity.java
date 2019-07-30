package com.enfrausa.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Event_Activity extends AppCompatActivity {

    private TextView eventTitle, eventCategory, eventDescription;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_);

        eventTitle = findViewById(R.id.txtTitle);
        eventCategory = findViewById(R.id.txtCategory);
        eventDescription = findViewById(R.id.txtDescription);
        img = findViewById(R.id.eventThumbnail);

        // receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category = intent.getExtras().getString("Category");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // setting values
        eventTitle.setText(Title);
        eventCategory.setText(Category);
        eventDescription.setText(Description);
        img.setImageResource(image);
    }
}

