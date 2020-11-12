package com.example.emodultatatulis.ui.materi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_lembar_kegiatan.*
import kotlinx.android.synthetic.main.fragment_materi_detail.*


class MateriDetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var Materi = arguments?.getString("materi")

        when (Materi) {
            "MATERI 1" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 1"
                Materi_pdf.fromAsset("MATERI1.pdf")
                    .load()
            }
            "MATERI 2" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 2"
                Materi_pdf.fromAsset("MATERI2.pdf")
                    .load()
            }
            "MATERI 3" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 3"
                Materi_pdf.fromAsset("MATERI3.pdf")
                    .load()
            }
            "MATERI 4" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 4"
                Materi_pdf.fromAsset("MATERI4.pdf")
                    .load()
            }
            "MATERI 5" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 5"
                Materi_pdf.fromAsset("MATERI5.pdf")
                    .load()
            }
            "MATERI 6" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 6"
                Materi_pdf.fromAsset("MATERI6.pdf")
                    .load()
            }
            "MATERI 7" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 7"
                Materi_pdf.fromAsset("MATERI7.pdf")
                    .load()
            }
            "MATERI 8" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 8"
                Materi_pdf.fromAsset("MATERI8.pdf")
                    .load()
            }
            "MATERI 9" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 9"
                Materi_pdf.fromAsset("MATERI9.pdf")
                    .load()
            }
            "MATERI 10" -> {
                (activity as AppCompatActivity).supportActionBar?.title = "Materi 10"
                Materi_pdf.fromAsset("MATERI10.pdf")
                    .load()
            }
        }
    }
}