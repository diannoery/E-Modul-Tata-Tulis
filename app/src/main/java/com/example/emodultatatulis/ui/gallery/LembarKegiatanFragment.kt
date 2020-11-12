package com.example.emodultatatulis.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_lembar_kegiatan.*


class LembarKegiatanFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lembar_kegiatan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var LK = arguments?.getString("LK")

        when(LK) {
            "LK1"->{
                LK_pdf.fromAsset("LembarKegiatanI.pdf")
                    .load()
            }
            "LK2"->{
                LK_pdf.fromAsset("LembarKegiatanII.pdf")
                    .load()
            }
            "LK3"->{
                LK_pdf.fromAsset("LembarKegiatanIII.pdf")
                    .load()
            }
            "LK4"->{
                LK_pdf.fromAsset("LembarKegiatanIV.pdf")
                    .load()
            }
            "LK5"->{
                LK_pdf.fromAsset("LembarKegiatanV.pdf")
                    .load()
            }
        }

    }
}