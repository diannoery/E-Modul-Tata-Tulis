package com.example.emodultatatulis.ui.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_profil.*


class ProfilFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profil.text="Widya Afrdiani lahir di Kisaran 19 April  1995. Jenjang pendidikannya dimulai dari SD Swasta Diponegoro Kisaran, SMP Negeri 1 Kisaran, SMA Negeri 4 Kisaran, Kabupaten Asahan Sumatera Utara. Kemudian melanjutkan kejenjang perguruan tinggi di Universitas Negeri Medan mengambil program studi Pend.Tata Boga dan sekarang melanjutkan studi di Program Pascasarjana Pendidikan Teknologi dan Kejuruan di Universitas Negeri Padang.\n" +
                "\n" +
                "E-modul Tata Tulis Karya Ilmiah ini merupakan produk pengembangan  yang dibuat sebagai bagian dari tugas akhir (tesis) untuk memperoleh gelar Magister. Pengembang berusaha  menyajikan modul ini sebaik mungkin agar bermanfaat bagi mahasiswa prodi Ilmu Kesejahteraan Keluarga Universitas Negeri Padang.\n" +
                "\n" +
                "Semoga e-modul ini bermanfaat dan dapat digunakan dalam proses pembelajaran di Universitas Negeri Padang maupun di luar lingkungan Universitas.\n"
    }
}