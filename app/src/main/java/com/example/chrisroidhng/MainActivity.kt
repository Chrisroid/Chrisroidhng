package com.example.chrisroidhng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var string: String
    private lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextTextPersonName2)
        textView2 = findViewById(R.id.textView2)
        button.setOnClickListener {
            string = editText.text.toString()
            textView2.text = string
        }
    }
}