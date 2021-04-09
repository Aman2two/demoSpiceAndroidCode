package com.example.spiceapplauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.embedding.android.FlutterActivity;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.btn_open_app)
        button.setOnClickListener {
            // launch flutter app
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            );
        }
    }
}