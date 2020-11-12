package com.example.emodultatatulis.ui.quiz

import android.view.View
import androidx.lifecycle.ViewModel

class QuizModel : ViewModel() {
    var kuisMateri =""
    val kuisMateriSatu = mutableListOf<Kuis>(
        Kuis(
            "Penulisan Karya Tulis Ilmiah bertujuan untuk: ",
            "Memenuhi persyaratan untuk lomba karya tulis",
            "Memperkenalkan penulis atau peneliti kepada khalayak ",
            "Sebagai sarana melatih mengutarakan pemikiran, ide atau hasil penelitiannya dalam bentuk tulisan ilmiah yang sistematis dan metodologis.",
            "Menyediakan bahan rujukan kepada peneliti lain ",
            "Sebagai sarana melatih mengutarakan pemikiran, ide atau hasil penelitiannya dalam bentuk tulisan ilmiah yang sistematis dan metodologis"
        ),


        Kuis(
            "Yang tidak termasuk ke dalam jenis Karya Tulis Ilmiah  adalah:",
            "Laporan ilmiah, skripsi, makalah",
            "Cerpen, novel, drama ",
            "Disertasi, laporan penelitian,",
            "Artikel ilmiah dan thesis",
            "Cerpen, novel, drama "
        ),


        Kuis(
            "Tulisan yang disusun berdasarkan pendekatan ilmiah yang ditujukan untuk kelompok pembaca dengan format sesuai dengan sistematika kaidah penulisan bahasa yang baik dan benar disebut",
            "Buku Teks",
            "Laporan Penelitian",
            "Artikel Ilmiah",
            "Karya Tulis Ilmiah",
            "Karya Tulis Ilmiah"
        ),

        Kuis(
            "Karya ilmiah dapat membantu mengantisipasi kemungkinan-kemungkinan yang akan terjadi pada masa mendatang merupakan fungsi karya ilmiah sebagai",
            "Ramalan (Prediction)",
            "Rujukan",
            "Penjelasan (Explanation)",
            "Penambah wawasan",
            "Ramalan (Prediction)"
        ),


        Kuis(
            "Hakikat dari karya ilmiah adalah sebagai berikut ",
            "Sistematis, subjektif dan praktis",
            "Sistematis, metodologis, dan konsisten",
            "Teoritis, ekonomis, konsisten",
            "Metodologis, praktis dan sistematis",
            "Sistematis, metodologis, dan konsisten"
        ),


        Kuis(
            "Salah satu yang menjadi faktor pendukung seseorang menulis karya ilmiah adalah ",
            "Lemahnya kemampuan dalam menggunakan kaidah bahasa yang baik dan benar",
            "Mendapatkan hadiah (reward)",
            "Meningkatkan keterampilan dalam mengorganisasikan dan menyajikan fakta dan data secara jelas dan sistematis.",
            "Kurang memahami metodologi riset",
            "Meningkatkan keterampilan dalam mengorganisasikan dan menyajikan fakta dan data secara jelas dan sistematis."
        ),


        Kuis(
            "Dibawah ini merupakan faktor yang menyebabkan penulis  mengalami kesulitan dalam menulis karya ilmiah, kecuali",
            "Penulis akan merasakan kepuasan intelektual, yaitu kemampuan untuk menyajikan satu pengetahuan.",
            "Lemahnya kemampuan dalam menggunakan kaidah bahasa yang baik dan benar.",
            "Kurang memahami metodologi riset",
            "Tidak tersedia literatur relevan yang memadai untuk mendukung penulisan kara ilmiah.",
            "Penulis akan merasakan kepuasan intelektual, yaitu kemampuan untuk menyajikan satu pengetahuan."
        ),


        Kuis(
            "Penggunaan suatu gagasan, hasil,  pernyataan,  ataupun kalimat orang lain yang diakui sebagai karya tulisnya  tanpa menyebutkan sumbernya disebut",
            "Kejujuran (Honesty)",
            "Penjelasan (Explanation)",
            "Keabsahan ( Validity)",
            "Plagiarisme",
            "Plagiarisme"
        ),


        Kuis(
            "Peraturan tentang Hak Cipta dijelaskan dalam Undang Undang Republik Indonesia",
            "Nomor 17 Tahun 2010",
            "Nomor 19 Tahun 2002",
            "Nomor 15 Tahun 2020",
            "Nomor 18 Tahun 2001",
            "Nomor 19 Tahun 2002"
        ),


        Kuis(
            "Yang bukan merupakan sifat etika penulisan ilmiah adalah",
            "kejujuran ( honesty ); ",
            "bebas dari  plagiarisme ",
            "keabsahan ( validity )",
            "Kontrol (Control)",
            "Kontrol (Control)"
        )
    )
    val kuisMateriDua= mutableListOf<Kuis>(
        Kuis("Variasi penggunaan bahasa dalam penulisan karya tulis ilmiah disebut",
            "Kaidah bahasa ilmiah",
            "Ragam bahasa ilmiah",
            "Jenis Bahasa ilmiah",
            "Pedoman bahasa ilmiah",
            "Ragam bahasa ilmiah"),



        Kuis("Berikut merupakan ciri ciri ragam bahasa ilmiah, antara lain :\n"+
               "1)Logis, dengan analisis dan pembuktian\n"+
                "2)Kalimat boleh berulang – ulang sesuai kebutuhan\n"+
               "3)Menggunakan bahasa prokem atau slang\n"+
                "4)Konsisten membahas suatu permasalahan atau topik\n"+
                "5)Wacana bersifat formal\n"+
                "Dari pernyataan diatas yang merupakan ciri- ciri ragam bahasa ilmiah yang benar adalah",
        "1,2 dan 5",
        "1,3, dan 4",
        "2,3, dan 4",
        "1,4 dan 5",
        "1,4 dan 5"),


    Kuis("Penulisan huruf pada karya tulis ilmah dibedakan menjadi dua yaitu huruf kapital dan huruf miring.\n"+
   " Di bawah ini yang bukan tergolong pemakaian huruf kapital pada karya tulis ilmiah adalah",
    "Penulisan ungkapan asing",
    "Huruf pertama petikan langsung.",
    "Huruf pertama awal kalimat",
    "Huruf pertama nama bangsa, suku, dan bahasa",
    "Penulisan ungkapan asing"),


    Kuis("Pemakaian huruf kapital yang salah terdapat pada kalimat",
    "Patiseri adalah pengetahuan dalam pengolahandan penyajian berbagai jenis kue.",
    "Allah SWT  berfirman agar rezeki itu dimanfaatkan dengan baik",
    "Rancangan undang undang Cipta kerja tetap disahkan",
    "Rita membaca tentang sejarah  suku Minang di Sumatera Barat",
    "Rancangan undang undang Cipta kerja tetap disahkan"),



    Kuis("Penulisan kata dicetak miring yang tidak tepat terdapat dalam kalimat .... ",
    "Novel <i>Laskar Pelangi</i> ditulis oleh Andrea Hirata",
    "Marilah kita panjatkan puji dan syukurkepada Tuhan Yang <i>Maha Esa</i>",
    "Nama lain dari jagung adalah <i>Zea Mays</i>",
    "Pengakuan tersebut berkaitan dengan pengakuan kedaulatan <i>de facto</i> suatu negara",
    "Marilah kita panjatkan puji dan syukurkepada Tuhan Yang <i>Maha Esa</i>",),


    Kuis( " Semua penggunaan tanda baca pada kalimat berikut benar, KECUALI .... ",
    "Pada tahun ini, akan diadakan MTQ  se-Sumatera Barat di Bandung.",
    "Pak Tono  tetap mengayuh sepeda-nya, walaupun keringat membasahi pelipisnya.",
    "Harga BBM (Bahan Bakar Minyak) aka mengalami kenaikan per 1 Januari 2020 ",
    "Warga Medan yang sudah dewasa diwajibkan ber-KTP Medan.",
    "Pak Tono  tetap mengayuh sepeda-nya, walaupun keringat membasahi pelipisnya."),

    Kuis("Perhatikan kalimat di bawah ini !\n"+
    "1.5 ekor Harimau Sumatera terjerat jebakan yang dibuat warga sekitar.\n"+
    "2.Pencuri motor yang tertangkap kemarin malam harus mempertanggungjawabkan perbuatannya. n"+
    "3.Meskipun sudah kehilangan sebelah kakinya, Tito tetap semangat mencari nafkah\n"+
    "4.Ibunya sedang bekerja. Oleh karena itu, Yoyo membersihkan rumah sendiri.\n"+
    "5.Sejak dari subuh Anto pergi memancing \n"+
    "Dari contoh kalimat diatas, manakah yang merupakan kalimat efektif yang benar ?",
    "1,2,  dan 3",
    "1, 2, dan 4",
    "2, 3, dan 4",
    "3,4,  dan 5",
    "2, 3, dan 4"),

    Kuis("Perhatikan kalimat di bawah ini !\n" +
   "1)Pengolahan kaldu coklat (brown stock) yang benar meliputi pemanggangan tulang sapi, perebusan tulang sapi yang sudah dipanggang, dan penyaringan kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat (benar)\n"+
   "2)Pengolahan kaldu coklat (brown stock) yang benar meliputi pemanggangan tulang sapi, merebus tulang sapi yang sudah dipanggang, dan menyaringkan kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n" +
   "3)Pengolahan kaldu coklat (brown stock) yang benar meliputi memanggang tulang sapi, merebus  tulang sapi yang sudah dipanggang, dan menyaring kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n" +
   "4)Pengolahan kaldu coklat (brown stock) yang benar meliputi dipanggang tulang sapi, direbuskan tulang sapi yang sudah dipanggang, dan menyaring kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n"+
    "Kalimat efektif yang menggunakan unssur kesamaan (paralel) yang BENAR adalah",
    "1,2, dan 3",
    "1,2 dan 4",
    "1 dan 3",
    "1 dan 4",
    "1 dan 3"),

    Kuis("Sebuah gagasan yang dituangkan secara tertulis membentuk serangkaian kalimat yang tersusun secara sistematis disebut",
    "Kalimat Efektif",
    "Ide",
    "Bahasa Ilmiah",
    "Paragraf",
    "Paragraf"),
    Kuis(
    "Berdasarkan fungsinya paragraf terdiri atas tiga jenis yaitu :",
    "Paragraf deduktif, Paragraf induktif, dan Paragraf deskriptif",
    "Paragraf pembuka, Paragraf penghubung, dan Paragraf penutup",
    "Paragraf repetisi, Paragraf induktif, dan Paragraf penghubung",
    "Paragraf konjungsi, Paragraf repetisi, dan Paragraf deskriptif",
    "Paragraf pembuka, Paragraf penghubung, dan Paragraf penutup"
    )
    )
    val kuisMateriDTiga= mutableListOf<Kuis>()
    val kuisMateriEmpat= mutableListOf<Kuis>()
    val kuisMateriLima= mutableListOf<Kuis>()
    val kuisMateriEnam= mutableListOf<Kuis>()
    val kuisMateriTujuh= mutableListOf<Kuis>()
    val kuisMateriDelapan= mutableListOf<Kuis>()
    val kuisMateriSembilan= mutableListOf<Kuis>()
    val kuisMateriSepuluh= mutableListOf<Kuis>()
}

class Kuis(quiz: String, A: String, B: String, C: String, D: String, Answer: String) {
    val quiz = quiz
    val A = A
    val B = B
    val C = C
    val D = D
    val Answer = Answer
}