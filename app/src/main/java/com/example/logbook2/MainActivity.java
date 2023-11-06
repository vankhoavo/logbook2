package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        showImage(currentImageIndex);
    }

    public void showPreviousImage(View view) {
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = 2;
        }
        showImage(currentImageIndex);
    }

    public void showNextImage(View view) {
        currentImageIndex++;
        if (currentImageIndex > 2) {
            currentImageIndex = 0;
        }
        showImage(currentImageIndex);
    }

    private void showImage(int index) {
        int resourceId;
        if (index == 0) {
            resourceId = R.drawable.image1;
        } else if (index == 1) {
            resourceId = R.drawable.image2;
        } else if (index == 2) {
            resourceId = R.drawable.image3;
        } else {
            resourceId = R.drawable.image1;
        }
        imageView.setImageResource(resourceId);
    }
}
