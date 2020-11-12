package com.example.emodultatatulis.ui.pendahuluan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_pendahuluan.*


class PendahuluanFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pendahuluan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Pendahuluan.text="    Modul pembelajaran Tata Tulis Karya Ilmiah inidikemas dalam bentuk aplikasi berbasis android yang dapat diunduh melalui Google Play Store. Modul android ini dirancang untuk memfasilitasi peserta didik dalam belajar mandiri. Sifatnya yang flexible dan self-instructional menjadikan pembelajaran lebih mudah dilakukan  dimana pun dan kapan pun."
        textView21.text=" Modul Tata Tulis Karya Ilmiah berbasis android ini tersusun atas materi perkuliahan, meliputi:"
        textView22.text=" Konsep Karya Ilmiah"
        textView23.text=" Bahasa dalam Karya Ilmiah"
        textView24.text=" Ketepatan Penggunaan Kaidah Tata Tulis Bahasa Indonesia"
        textView25.text=" Kutipan, Catatan Kaki, Catatan Tubuh dan Daftar Pustaka"
        textView27.text=" Kesalahan Umum Menulis Karya Ilmiah"
        textView28.text=" Struktur Karya Ilmiah"
        textView29.text=" Langkah – Langkah Membuat Karya Ilmiah"
        textView30.text=" Penulisan Bab I dan Bab II"
        textView31.text=" Penulisan Bab III dan Abstrak"
        textView32.text=" Teknis Presentasi"
        textView26.text="Semoga modul berbasis android mobile ini bermanfaat bagi banyak pihak, baik mahasiswa, maupun dosen sebagai  salah satu inovasi media pembelajaran."

    }
}