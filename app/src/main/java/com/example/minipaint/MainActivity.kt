package com.example.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this).apply {
            systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
            contentDescription = getString(R.string.canvasContentDescription)
        }
        setContentView(myCanvasView)
    }
}
