package com.example.android_course_view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextRus: EditText
    private lateinit var editTextEng: EditText
    private lateinit var buttonRus: Button
    private lateinit var buttonEng: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setComponents()

        buttonRus.setOnClickListener {
            textViewResult.text = TransliterationHandler.rus2eng(editTextRus.text)
        }

        buttonEng.setOnClickListener {
            textViewResult.text = TransliterationHandler.eng2rus(editTextEng.text)
        }
    }

    private fun setComponents() {
        editTextRus = findViewById(R.id.edit_text_rus)
        editTextEng = findViewById(R.id.edit_text_eng)
        buttonRus = findViewById(R.id.button_translate_rus)
        buttonEng = findViewById(R.id.button_translate_eng)
        textViewResult = findViewById(R.id.text_view_result)
    }
}