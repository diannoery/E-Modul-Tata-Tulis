package com.example.emodultatatulis.ui.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var Skor = arguments?.getInt("Skor")
        var Benar = arguments?.getInt("Benar")
        var Salah = arguments?.getInt("Salah")
        var waktu = arguments?.getString("Waktu")
        var quiz = arguments?.getString("quiz")
        skor.text=Skor.toString()
        Benar_skor.text=Benar.toString()
        Salah_skor.text=Salah.toString()
        waktu_selesai.text=waktu.toString()

        home.setOnClickListener {
            activity?.finish()
        }
    }
}