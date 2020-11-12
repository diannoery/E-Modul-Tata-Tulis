package com.example.emodultatatulis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import com.example.emodultatatulis.ui.materi.MateriViewModel
import com.example.emodultatatulis.ui.quiz.QuizModel

class QuizActivity : AppCompatActivity() {
    val model: QuizModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val materi = intent.getStringExtra("materi")
        if (materi != null) {
            model.kuisMateri= materi
        }

    }
}