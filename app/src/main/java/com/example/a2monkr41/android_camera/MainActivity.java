package com.example.a2monkr41.android_camera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CameraPreview preview = new CameraPreview(this);
        setContentView(preview);

    }
}
