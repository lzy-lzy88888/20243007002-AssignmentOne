package com.example.assignmentone;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void categoryClicked(View view){
        int id = view.getId();
        if(id == R.id.btn_facilities){
            Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.btn_events){
            Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.btn_clubs){
            Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.btn_support){
            Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        }
    }

}