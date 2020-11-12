package com.example.emodultatatulis.ui.quiz

import android.os.Bundle
import android.os.SystemClock
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_quiz.*


class QuizFragment : Fragment() {
    lateinit var navController: NavController
    val mkViewModel by activityViewModels<QuizModel>()
    private var pilihA = false
    private var pilihB = false
    private var pilihC = false
    private var pilihD = false
    private var soal = 0
    private var skor = 0
    private var Benar = 0
    private var Data = mutableListOf<Int>()
    private var Salah = 0
    var times : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Timer
        timer.base= SystemClock.elapsedRealtime()+times
        timer.start()

        var materi = mkViewModel.kuisMateri
     println(materi)

        when (materi) {
            "MATERI 1" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 1"
                Pertanyaan(mkViewModel.kuisMateriSatu)
            }
            "MATERI 2" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 2"
                Pertanyaan(mkViewModel.kuisMateriDua)
            }
            "MATERI 3" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 3"

            }
            "MATERI 4" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 4"

            }
            "MATERI 5" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 5"

            }
            "MATERI 6" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 6"

            }
            "MATERI 7" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 7"

            }
            "MATERI 8" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 8"

            }
            "MATERI 9" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 9"

            }
            "MATERI 10" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Tes Materi 10"

            }
        }



    }
    
    fun Pertanyaan(kuisMateri: MutableList<Kuis>) {
        pertanyaan.text = "${soal + 1}. ${kuisMateri[soal].quiz}"
        button1.text = " A. ${kuisMateri[soal].A}"
        button2.text = " B. ${kuisMateri[soal].B}"
        button3.text = " C. ${kuisMateri[soal].C}"
        button4.text = " D. ${kuisMateri[soal].D}"
        submit.visibility = View.INVISIBLE
        button1.setOnClickListener {
            if (pilihA) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)


                if (kuisMateri[soal].A == kuisMateri[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = true
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_bg)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].A == kuisMateri[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 10){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE

            }



        }
        button2.setOnClickListener {
            if (pilihB) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].B == kuisMateri[soal].Answer && Benar != 0) {
                    Benar--
                }

                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = true
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_bg)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].B == kuisMateri[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 10){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        button3.setOnClickListener {

            if (pilihC) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].C == kuisMateri[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = true
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_bg)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].C == kuisMateri[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }
                }
                if (soal +1 == 10){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        button4.setOnClickListener {
            if (pilihD) {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                if (kuisMateri[soal].D == kuisMateri[soal].Answer && Benar != 0) {
                    Benar--
                }
                submit.visibility = View.INVISIBLE
            } else {
                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = true

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_bg)

                if (kuisMateri[soal].D == kuisMateri[soal].Answer) {
                    Benar++

                }else{
                    if (Benar !=0){
                        Benar--
                    }

                }
                if (soal +1 == 10){
                    submit.text= "submit"
                }
                submit.visibility = View.VISIBLE
            }


        }
        if (soal == kuisMateri.size - 1 ){
            submit.text= "Submit"
        }
        submit.setOnClickListener {
            if (soal < kuisMateri.size - 1) {
                soal++
                println(soal)
                Data.add(Benar)
                Benar= 0
                pertanyaan.text = "${soal + 1}. ${kuisMateri[soal].quiz}"
                button1.setText(Html.fromHtml(" A. ${kuisMateri[soal].A}"));
                button2.setText(Html.fromHtml(" B. ${kuisMateri[soal].B}"));
                button3.setText(Html.fromHtml(" C. ${kuisMateri[soal].C}"));
                button4.setText(Html.fromHtml(" D. ${kuisMateri[soal].D}"));


                pilihA = false
                pilihB = false
                pilihC = false
                pilihD = false

                button1.setBackgroundResource(R.drawable.shape_white)
                button2.setBackgroundResource(R.drawable.shape_white)
                button3.setBackgroundResource(R.drawable.shape_white)
                button4.setBackgroundResource(R.drawable.shape_white)

                submit.visibility = View.INVISIBLE

            } else {
                times =timer.base-SystemClock.elapsedRealtime()
                timer.stop()

                var waktu = timer.text

                var jmlhSoal = kuisMateri.size
                var jmlhBenar = 0
                Data.add(Benar)
                for (i in Data){
                    jmlhBenar+= i
                }
                skor = (jmlhBenar * 100) / jmlhSoal
                Salah = jmlhSoal- jmlhBenar
                navController = Navigation.findNavController(it)
                navController.navigate(
                    R.id.action_quizFragment_to_resultFragment,
                    bundleOf(
                        "Skor" to skor,
                        "Benar" to jmlhBenar,
                        "Salah" to Salah,
                        "Waktu" to waktu,
                        "quiz" to "quiz1"
                    )
                )

            }
        }
    }

}