package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get index passed from MainActivity
        int selectedIndex = getIntent().getIntExtra("SELECTED_INDEX",0);

        // Load string arrays from resources
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);

        // Bind UI views
        TextView tvTitle = findViewById(R.id.detail_title);
        TextView tvContent = findViewById(R.id.detail_content);
        ImageView ivIcon = findViewById(R.id.detail_icon);

        // Use index directly, NO if/switch (assignment requirement)
        tvTitle.setText(titles[selectedIndex]);
        tvContent.setText(contents[selectedIndex]);

        // Resolve drawable id by image name string
        int drawableId = getResources().getIdentifier(imageNames[selectedIndex],"drawable",getPackageName());
        ivIcon.setImageResource(drawableId);
    }





}