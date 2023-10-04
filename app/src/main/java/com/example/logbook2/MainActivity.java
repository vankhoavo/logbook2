package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    private int[] imageIds = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };

    //image1
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
        if (currentImageIndex <= -1) {
            currentImageIndex = imageIds.length -1;
        }
        showImage(currentImageIndex);
    }

    public void showNextImage(View view) {
        currentImageIndex++;
        if (currentImageIndex >= imageIds.length) {
            currentImageIndex = 0;
        }
        showImage(currentImageIndex);
    }

    private void showImage(int index)
    {
        imageView.setImageResource(imageIds[index]);
    }
}