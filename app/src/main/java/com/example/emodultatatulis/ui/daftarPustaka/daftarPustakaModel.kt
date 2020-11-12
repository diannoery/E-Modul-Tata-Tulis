package com.example.mediapembelajaran.ui.daftarpustaka

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DaftarPustakaModel : ViewModel() {
    val listDaftar = mutableListOf<DaftarPustaka>(

        DaftarPustaka("Dwiloka, B., & Riana, R. (2012). Teknik menulis karya ilmiah skripsi (Doctoral dissertation, tesis, disertasi, artikel, makalah dan laporan. Semarang : Rineka Cipta"),

        DaftarPustaka("Elastri, A., Faridah, A., & Holinesti, R. (2015). Pengaruh Substitusi Ekstrak Kulit Buah Naga Merah Terhadap Kualitas Es Krim. E-Journal Home Economic and Tourism, 8(1)."),

        DaftarPustaka("Fakultas Teknik UNP. (2010). Pedoman Penulisan Skripsi/ proyek akhir bagi Mahasiswa.UNP"),

        DaftarPustaka("Fitri, I., Faridah, A., & Holinesti, R. (2018). PENGARUH PENAMBAHAN EKSTRAK RUMPUT LAUT COKLAT TERHADAP KUALITAS ES KRIM. E-Journal Home Economic and Tourism, 15(2)."),

        DaftarPustaka("Hidayah. (2017). http://yayuhidayah.blogspot.com/2017/01/makalah-konjungsi-kata-penghubung.html. diakses tanggal 20 Oktober 2020"),

        DaftarPustaka("I Ketut, W. (2016). Buku Ajar Bahasa Indonesia dan Tata Tulis Karya Ilmiah."),

        DaftarPustaka("Kemdikbud. http://badanbahasa.kemdikbud.go.id/lamanbahasa/petunjuk_praktis/473. diakses tanggal 15 Oktober 2020"),

        DaftarPustaka("Koesmawan.(2010). Pemahaman Penulisan Karya Ilmiah agar Memenuhi  Kepatutan. Jakarta: STIE Ahmad Dahlan"),

        DaftarPustaka("PENYUSUN, T. BAHASA INDONESIA DALAM PENULISAN KARYA ILMIAH."),

        DaftarPustaka("Youtube.com/ArenaLomba.https://www.youtube.com/channel/UCmHy3R5hJNA7qtOh6u2KSVQ. Diakses tanggal 22 Oktober 2020"),

        )

    val daftarLiveData: MutableLiveData<MutableList<DaftarPustaka>> = MutableLiveData(listDaftar)
}


class DaftarPustaka(daftar: String) {
    val daftar = daftar
}