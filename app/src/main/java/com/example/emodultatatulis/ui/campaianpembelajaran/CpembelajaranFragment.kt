package com.example.emodultatatulis.ui.campaianpembelajaran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_cpembelajaran.*
import kotlinx.android.synthetic.main.fragment_materi_detail.*


class CpembelajaranFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cpembelajaran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Campaian Pembelajaran"
        pembelajaran_pdf.fromAsset("CAPAIANPEMBELAJARAN.pdf")
            .load()
    }
}