package com.example.mediapembelajaran.ui.petunjuk

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class PetunjukViewModel : ViewModel() {
    val listPetnjuk = mutableListOf<Petunjuk>(
        Petunjuk(
            "Langkah 1",
            "Belajar menggunakan modul ini, dapat dilakukan dimana pun dan kapan pun."
        ),
        Petunjuk(
            "Langkah 2",
            "Cermati baik – baik capaian pembelajaran beserta pokok bahasan dalam setiap materi pembelajaran."
        ),
        Petunjuk(
            "Langkah 3",
            "Baca dan pahami materi dengan baik, jika menemukan kesulitan , kalian dapat mendiskusikannya dengan teman – teman dan apabila belum terpecahkan dapat ditanyakan dengan dosen pengampuh mata kuliah ."
        ), Petunjuk(
            "Langkah 4",
            "Setelah memahami materi, kerjakan tugas – tugas yang tercantum pada Tes Materi untuk mengevaluasi keberhasilan belajar dari masing – masing materi."
        ), Petunjuk(
            "Langkah 5",
            "Mencari informasi dari buku atau sumber selain modul ini dianjurkan untuk mengerjakan tugas dalam modul."
        ), Petunjuk(
            "Langkah 6",
            "Periksalah latihan soal pada Tes Materi dalam modul ini. Apabila hasil Tes Materi mencapai 80 % benar maka kalian berhasil melewati tahapan pembelajaran dalam modul ini "
        ),


        )

    val PetunjukLiveData: MutableLiveData<MutableList<Petunjuk>> = MutableLiveData(listPetnjuk)


}

class Petunjuk(langkah: String, isi: String) {
    val langkah = langkah
    val isi = isi
}