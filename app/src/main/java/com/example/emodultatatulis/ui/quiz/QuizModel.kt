package com.example.emodultatatulis.ui.quiz

import android.view.View
import androidx.lifecycle.ViewModel

class QuizModel : ViewModel() {
    var kuisMateri = ""
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
    val kuisMateriDua = mutableListOf<Kuis>(
        Kuis(
            "Variasi penggunaan bahasa dalam penulisan karya tulis ilmiah disebut",
            "Kaidah bahasa ilmiah",
            "Ragam bahasa ilmiah",
            "Jenis Bahasa ilmiah",
            "Pedoman bahasa ilmiah",
            "Ragam bahasa ilmiah"
        ),


        Kuis(
            "Berikut merupakan ciri ciri ragam bahasa ilmiah, antara lain :\n" +
                    "1)Logis, dengan analisis dan pembuktian\n" +
                    "2)Kalimat boleh berulang – ulang sesuai kebutuhan\n" +
                    "3)Menggunakan bahasa prokem atau slang\n" +
                    "4)Konsisten membahas suatu permasalahan atau topik\n" +
                    "5)Wacana bersifat formal\n" +
                    "Dari pernyataan diatas yang merupakan ciri- ciri ragam bahasa ilmiah yang benar adalah",
            "1,2 dan 5",
            "1,3, dan 4",
            "2,3, dan 4",
            "1,4 dan 5",
            "1,4 dan 5"
        ),


        Kuis(
            "Penulisan huruf pada karya tulis ilmah dibedakan menjadi dua yaitu huruf kapital dan huruf miring.\n" +
                    " Di bawah ini yang bukan tergolong pemakaian huruf kapital pada karya tulis ilmiah adalah",
            "Penulisan ungkapan asing",
            "Huruf pertama petikan langsung.",
            "Huruf pertama awal kalimat",
            "Huruf pertama nama bangsa, suku, dan bahasa",
            "Penulisan ungkapan asing"
        ),


        Kuis(
            "Pemakaian huruf kapital yang salah terdapat pada kalimat",
            "Patiseri adalah pengetahuan dalam pengolahandan penyajian berbagai jenis kue.",
            "Allah SWT  berfirman agar rezeki itu dimanfaatkan dengan baik",
            "Rancangan undang undang Cipta kerja tetap disahkan",
            "Rita membaca tentang sejarah  suku Minang di Sumatera Barat",
            "Rancangan undang undang Cipta kerja tetap disahkan"
        ),


        Kuis(
            "Penulisan kata dicetak miring yang tidak tepat terdapat dalam kalimat .... ",
            "Novel <i>Laskar Pelangi</i> ditulis oleh Andrea Hirata",
            "Marilah kita panjatkan puji dan syukurkepada Tuhan Yang <i>Maha Esa</i>",
            "Nama lain dari jagung adalah <i>Zea Mays</i>",
            "Pengakuan tersebut berkaitan dengan pengakuan kedaulatan <i>de facto</i> suatu negara",
            "Marilah kita panjatkan puji dan syukurkepada Tuhan Yang <i>Maha Esa</i>",
        ),


        Kuis(
            " Semua penggunaan tanda baca pada kalimat berikut benar, KECUALI .... ",
            "Pada tahun ini, akan diadakan MTQ  se-Sumatera Barat di Bandung.",
            "Pak Tono  tetap mengayuh sepeda-nya, walaupun keringat membasahi pelipisnya.",
            "Harga BBM (Bahan Bakar Minyak) aka mengalami kenaikan per 1 Januari 2020 ",
            "Warga Medan yang sudah dewasa diwajibkan ber-KTP Medan.",
            "Pak Tono  tetap mengayuh sepeda-nya, walaupun keringat membasahi pelipisnya."
        ),

        Kuis(
            "Perhatikan kalimat di bawah ini !\n" +
                    "1.5 ekor Harimau Sumatera terjerat jebakan yang dibuat warga sekitar.\n" +
                    "2.Pencuri motor yang tertangkap kemarin malam harus mempertanggungjawabkan perbuatannya. n" +
                    "3.Meskipun sudah kehilangan sebelah kakinya, Tito tetap semangat mencari nafkah\n" +
                    "4.Ibunya sedang bekerja. Oleh karena itu, Yoyo membersihkan rumah sendiri.\n" +
                    "5.Sejak dari subuh Anto pergi memancing \n" +
                    "Dari contoh kalimat diatas, manakah yang merupakan kalimat efektif yang benar ?",
            "1,2,  dan 3",
            "1, 2, dan 4",
            "2, 3, dan 4",
            "3,4,  dan 5",
            "2, 3, dan 4"
        ),

        Kuis(
            "Perhatikan kalimat di bawah ini !\n" +
                    "1)Pengolahan kaldu coklat (brown stock) yang benar meliputi pemanggangan tulang sapi, perebusan tulang sapi yang sudah dipanggang, dan penyaringan kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat (benar)\n" +
                    "2)Pengolahan kaldu coklat (brown stock) yang benar meliputi pemanggangan tulang sapi, merebus tulang sapi yang sudah dipanggang, dan menyaringkan kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n" +
                    "3)Pengolahan kaldu coklat (brown stock) yang benar meliputi memanggang tulang sapi, merebus  tulang sapi yang sudah dipanggang, dan menyaring kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n" +
                    "4)Pengolahan kaldu coklat (brown stock) yang benar meliputi dipanggang tulang sapi, direbuskan tulang sapi yang sudah dipanggang, dan menyaring kotoran yang muncul dari air rebusan sayuran dengan teknik memasak tepat\n" +
                    "Kalimat efektif yang menggunakan unssur kesamaan (paralel) yang BENAR adalah",
            "1,2, dan 3",
            "1,2 dan 4",
            "1 dan 3",
            "1 dan 4",
            "1 dan 3"
        ),

        Kuis(
            "Sebuah gagasan yang dituangkan secara tertulis membentuk serangkaian kalimat yang tersusun secara sistematis disebut",
            "Kalimat Efektif",
            "Ide",
            "Bahasa Ilmiah",
            "Paragraf",
            "Paragraf"
        ),
        Kuis(
            "Berdasarkan fungsinya paragraf terdiri atas tiga jenis yaitu :",
            "Paragraf deduktif, Paragraf induktif, dan Paragraf deskriptif",
            "Paragraf pembuka, Paragraf penghubung, dan Paragraf penutup",
            "Paragraf repetisi, Paragraf induktif, dan Paragraf penghubung",
            "Paragraf konjungsi, Paragraf repetisi, dan Paragraf deskriptif",
            "Paragraf pembuka, Paragraf penghubung, dan Paragraf penutup"
        )
    )
    val kuisMateriTiga = mutableListOf<Kuis>(
        Kuis(
            "Kaidah bahasa ilmiah menuntut penulisan yang bersifat ",
            "Bertele tele, valid dan honesty",
            "Logis, formal, dan obyektif, ",
            "Tegas, sistematis dan efektif",
            "Plagiarisme, logis dan sistematis ",
            "Logis, formal, dan obyektif, "
        ),

        Kuis(
            "Perhatikan kalimat di bawah ini !\n" +
                    "1) Hasil penelitian ini menunjukkan adanya peran media pembelajaran dalam menunjang peningkatan prestasi belajar.\n" +
                    "2) Fungsi enzim di antaranya adalah membantu proses metabolisme dan mencegah infeksi.\n" +
                    "3) Menurut Herdiansyah seorang food blogger pada harian Kompas memasak adalah semua kegiatan yang berhubungan dengan mengelola makanan, baik yang menggunakan panas maupun tidak menggunakan panas\n" +
                    "Dengan penelitian ini diharapkan dapat meningkatkan hasil panen bawang merah\n" +
                    "4) Dari kalimat diatas manakah yang tidak sesuai dengan kaidah bahasa ilmiah yang benar ?",
            "Kalimat 1",
            "Kalimat 2",
            "Kalimat 3",
            "Kalimat 4",
            "Kalimat 3"
        ),

        Kuis(
            "Penulisan tanda petik  (“) di bawah ini yang salah terdapat dalam kalimat ...",
            "Dito berkata, “Mari kita bekerja dengan teliti!” ",
            "Novel  Sang Pemimpi  hasil karya “Andrea Hirata” ",
            "Siti bertanya, “Apakah kamu baik – baik saja ?”",
            "Film “Bumi Manusia” diadaptasi dari novel karya Pramoedya Ananta Toer",
            "Novel  Sang Pemimpi  hasil karya “Andrea Hirata” "
        ),


        Kuis(
            "Pemakaian tanda baca koma (,) yang benar terdapat pada kalimat .... ",
            "Rian, mengucapkan terima kasih atas bantuan Fitri.",
            "Semua peserta, yang tidak membawa tandabukti pendaftaran, harus melaporkan diri kepada panitia.",
            "Ia harus pulang sekarang, karena sakit. ",
            "Ali Saifuddin  tinggal di Jalan Mawar 5,Padang , Sumatera Barat ",
            "Ali Saifuddin  tinggal di Jalan Mawar 5,Padang , Sumatera Barat "
        ),


        Kuis(
            "Majelis Hakim Pengadilan Tinggi Sumatera Utara menolak hasil suara pada pemilihan kepala daerah (Pilkada) Kabupaten Batu Bara yang diajukan pemohon, yakni Calon Bupati dan Calon Wakil Bupati Batu Bara, H. Husein  Ahmad- H. Hatori Syarifuddin terhadap termohon, Komisi Pemilihan Umum Daerah (KPUD) Kabupaten Batu Bara.\n" +
                    "Dalam kalimat di atas, terdapat kesalahan tata tulis, yaitu .... ",
            "penulisan Majelis Hakim Pengadilan Tinggi",
            "penulisan pemilihan kepala daerah",
            "penulisan Calon Bupati dan Calon Wakil Bupati",
            "penulisan Komisi Pemilihan Umum Daerah",
            "penulisan pemilihan kepala daerah"
        ),

        Kuis(
            "Menulis merupakan keterampilan yang paling sulit dikuasai. Dalam proses menulis, banyak proses pembelajaran yang harus diperhatikan; di antaranya adalah pembelajaran pemakaian ejaan sesuai dengan kaidah bahasa yang dianut, pembelajaran pemakaian struktur bahasa yang benar, dan pembelajaran penggunaan diksi maupun frasa yang mengungkapkan pikiran.\n" +
                    "Dalam kutipan di atas, terdapat kesalahan tata tulis. Kesalahan yang dimaksud adalah ....",
            "kesalahan penggunaan tanda titik koma (;) ",
            "kesalahan penulisan di antaranya ",
            "kesalahan penulisan kata maupun ",
            "kesalahan penggunaan tanda koma (,) sebelum kata hubung dan ",
            "kesalahan penulisan di antaranya "
        ),


        Kuis(
            "Penulisan singkatan kata-kata yang sudah umum yang tepat terdapat dalam kalimat ...",
            "Dia menandatangani surat itu A.n. kepala bagian. ",
            "Buku itu ditulis oleh Ibu Sekar  d.k.k.",
            "Paman menamai anaknya F.L. Tobing ",
            "Ibu membeli ikan, sayur-sayuran,sembako, d.l.l. di pasar",
            "Paman menamai anaknya F.L. Tobing "
        ),

        Kuis(
            "Berikut ini penulisan yang benar adalah...",
            "Diantara tumpukan jerami",
            "Di atas meja ada buku Tono",
            "Dibawah tempat tidur adik bersembunyi.",
            "Kakek di lahirkan tahun 1945",
            "Di atas meja ada buku Tono"
        ),

        Kuis(
            "Berikut penulisan bilangan yang benar sesuai dengan EYD adalah...",
            "Andri menjadi juara ke-dua dalam lomba balap karung",
            "Desa Sekarsari menjadi juara ke 1 lomba kebersiha se Jawa Tengah",
            "Joko naik berada di urutan ke-10 atas hasil ujian kenaikan kelas",
            "Tiur menjadi juara ke-tiga lomba cerdas cermat kemarin.",
            "Joko naik berada di urutan ke-10 atas hasil ujian kenaikan kelas"
        ),


        Kuis(
            "Berikut ini penulisan tanda baca yang benar pada daftar pustaka adalah",
            "Afriana, Jaka. 2015. Project Based Learning (PJBL). Bandung: Universitas Pendidikan Indonesia.",
            "Afriana, Jaka, 2015, Project Based Learning (PJBL): Bandung: Universitas Pendidikan Indonesia.",
            "Afriana, Jaka. 2015. Project Based Learning [PJBL], Bandung: Universitas Pendidikan Indonesia.",
            "Afriana, Jaka, 2015. Project Based Learning (PJBL). Bandung. Universitas Pendidikan Indonesia.",
            "Afriana, Jaka. 2015. Project Based Learning (PJBL). Bandung: Universitas Pendidikan Indonesia."
        )
    )
    val kuisMateriEmpat = mutableListOf<Kuis>(

        Kuis(
            "Apakah yang dimaksud dengan kutipan ?",
            "proses pengambilan pernyataan, pendapat, buah pikiran, definisi, rumusan, atau hasil penelitian dari para ahli, penulis lain atau penulis sendiri yang telah terdokumentasi dalam karya tulis ilmiah",
            "proses pengambilan pokok persoalan secara langung (to the point), tidak mengandung kata atau kalimat yang tidak menambah penjelasan, sehingga terhindar dari kesalahpahaman pembaca",
            "proses pengambilan pernyataan dikutip dari gagasan atau hal-hal yang diungkapkan oleh penulis atau peneliti lain.",
            "proses pengambilan yang tidak menggunakan kata-kata yang mengungkapkan pandangan subyektif dan emosional penulis.",
            "proses pengambilan pernyataan, pendapat, buah pikiran, definisi, rumusan, atau hasil penelitian dari para ahli, penulis lain atau penulis sendiri yang telah terdokumentasi dalam karya tulis ilmiah"
        ),


        Kuis(
            "Jenis- jenis kutipan dalam karya tulis ilmiah dapat dibedakan menjadi dua jenis yaitu",
            "Kutipan pendek dan kutipan panjang",
            "Kutipan ilmiah dan kutipan populer",
            "Kutipan Langsung dan kutipan tidak langsung",
            "Kutipan ilmiah dan kutipan tidak langsung",
            "Kutipan Langsung dan kutipan tidak langsung"
        ),

        Kuis(
            "Jika anda ingin memasukkan kutipan ke dalam karya tulis yang ingin anda buat, penulisan kutipan langung yang paling tepat adalah ..",
            "“pengembangan produk adalah strategi untuk pertumbuhan perusahaan dengan menawarkan produk baru atau yang dimodifikasi ke segmen pasar yang sekarang (Kotler, 2007:320)”. ",
            "Menurut Kotler “pengembangan produk adalah strategi untuk pertumbuhan perusahaan dengan menawarkan produk baru atau yang dimodifikasi ke segmen pasar yang sekarang (2007:320)”. ",
            "Kotler menjelaskan “pengembangan produk adalah strategi untuk pertumbuhan perusahaan dengan menawarkan produk baru atau yang dimodifikasi ke segmen pasar yang sekarang” (2007:320).",
            "“pengembangan produk adalah strategi untuk pertumbuhan perusahaan dengan menawarkan produk baru atau yang dimodifikasi ke segmen pasar yang sekarang” (Kotler, 2007:320).",
            "“pengembangan produk adalah strategi untuk pertumbuhan perusahaan dengan menawarkan produk baru atau yang dimodifikasi ke segmen pasar yang sekarang” (Kotler, 2007:320)."
        ),


        Kuis(
            "Jika anda ingin memasukkan kutipan ke dalam karya tulis yang ingin anda buat, penulisan kutipan tidak langung yang paling tepat adalah ..",
            "Menurut Firdaus (2012), sala lauak merupakan gorengan sebesar bola pimpong berwarna kuning kunyit, tersusun atas tepung beras, cabai, kunyit, jahe, bawang-bawangan, garam serta ikan asin.",
            "Menurut Firdaus sala lauak merupakan gorengan sebesar bola pimpong berwarna kuning kunyit, tersusun atas tepung beras, cabai, kunyit, jahe, bawang-bawangan, garam serta ikan asin (2012).",
            "sala lauak merupakan gorengan sebesar bola pimpong berwarna kuning kunyit, tersusun atas tepung beras, cabai, kunyit, jahe, bawang-bawangan, garam serta ikan asin kata (Firdaus , 2012)",
            "Menurut (Firdaus : 2012), sala lauak merupakan gorengan sebesar bola pimpong berwarna kuning kunyit, tersusun atas tepung beras, cabai, kunyit, jahe, bawang-bawangan, garam serta ikan asin.",
            "Menurut Firdaus (2012), sala lauak merupakan gorengan sebesar bola pimpong berwarna kuning kunyit, tersusun atas tepung beras, cabai, kunyit, jahe, bawang-bawangan, garam serta ikan asin."
        ),


        Kuis(
            "Catatan pada  bagian bawah halaman teks setiap akhir lembaran yang menyatakan sumber suatu kutipan, pendapat atau keterangan penyusunan mengenai suatu hal yang diuraikan dalam teks disebut",
            "Catatan kepala (headernote)",
            "Catatan kaki (footnoote)",
            "Catatan badan (bodynote)",
            "Catatan tengah (middlenote)",
            "Catatan kaki (footnoote)"
        ),

        Kuis(
            "Jika anda berkeinginan untuk mencantumkan identitas buku dalam catatan kaki , penulisan catatan kaki yang benar adalah ",
            "<sup>1</sup> Agus Irianto, “Pendidikan sebagai Investasi Suatu Bangsa” (Jakarta: Kencana, 2011), hlm., 3. ",
            "<sup>1</sup> Agus Irianto, <i>Pendidikan sebagai Investasi Suatu Bangsa</i>, (Jakarta: Kencana,  2011), hlm., 3. ",
            "<sup>1</sup> Agus Irianto, Pendidikan sebagai Investasi Suatu Bangsa, (Jakarta: Kencana,  2011), hlm., 3. ",
            "<sup>1</sup> Agus Irianto. “<i>Pendidikan sebagai Investasi Suatu Bangsa</i>”. (Jakarta: Kencana, 2011), hlm., 3. ",
            "<sup>1</sup> Agus Irianto, <i>Pendidikan sebagai Investasi Suatu Bangsa</i>, (Jakarta: Kencana,  2011), hlm., 3. "
        ),

        Kuis(
            "Berikut merupakan cara penulisan catatan tubuh dengan BANYAK  pengarang yang benar adalah",
            "Proses glatinisasi ini akan mengubah karakteristik pati secara kimia maupun fisik akibat penyusunan kembali intra dan intermolekuler ikatan hidrogen antara air dan molekul pati (Neelam, 2014).",
            "Proses glatinisasi ini akan mengubah karakteristik pati secara kimia maupun fisik akibat penyusunan kembali intra dan intermolekuler ikatan hidrogen antara air dan molekul pati (Neelam, Vol. 1, 2014).",
            "Proses glatinisasi ini akan mengubah karakteristik pati secara kimia maupun fisik akibat penyusunan kembali intra dan intermolekuler ikatan hidrogen antara air dan molekul pati (Neelam et al., 2014).",
            "Proses glatinisasi ini akan mengubah karakteristik pati secara kimia maupun fisik akibat penyusunan kembali intra dan intermolekuler ikatan hidrogen antara air dan molekul pati (Neelam, Lie, Zhang, dkk., et al.,  2014).",
            "Proses glatinisasi ini akan mengubah karakteristik pati secara kimia maupun fisik akibat penyusunan kembali intra dan intermolekuler ikatan hidrogen antara air dan molekul pati (Neelam et al., 2014).",
        ),

        Kuis(
            "Dibawah ini yang bukan merupakan fungsi dari daftar pustaka adalah sebagai berikut :",
            "Menunjukkan bahwa tulisan itu ilmiah (bersifat ilmu pengetahuan);",
            "Sebagai bukti untuk menunjang pendapat penulis",
            "Menginformasikan bahwa karya ilmiah itu (penelitian) memiliki referensi dan akumulasi dari karya ilmiah terdahulu;",
            " Merupakan alat kontrol pada landasan teoritis atau tinjauan pustaka.",
            "Sebagai bukti untuk menunjang pendapat penulis"
        ),

        Kuis(
            "Bacalah keterangan di bawah ini !\n" +
                    "Judul Buku		: Restoran Jilid 2\n" +
                    "Pengarang		: Ekawatiningsih Prihastuti, Kokom Komariah, dan Sutriyati Putwanti\n" +
                    "Tahun terbit 	: 2012\n" +
                    "Penerbit 		: Direktoran Pembinaan Sekolah Menengah Kejujuran. Departemen Pendidikan Nasional\n" +
                    "Dari keterangan di atas manakah format daftar pustaka yang benar menurut <b>APA</b> style?",
            "Prihastuti, Ekawatiningsih dkk. (2012). Restoran jilid 2. Direktorat Pembinaan Sekolah Menengah Kejujuran. Departemen Pendidikan Nasional",
            "Prihastuti, Ekawatiningsih, Kokom Komariah & Sutriyati Purwanti. (2012). Restoran jilid 2. Direktorat Pembinaan Sekolah Menengah Kejujuran. Departemen Pendidikan Nasional",
            "Prihastuti, Ekawatiningsih dkk. 2012,  Restoran jilid 2. Direktorat Pembinaan Sekolah Menengah Kejujuran, Departemen Pendidikan Nasional",
            "Ekawatiningsih Prihastuti,  dkk. (2012). Restoran jilid 2. Direktorat Pembinaan Sekolah Menengah Kejujuran. Departemen Pendidikan Nasional",
            "Prihastuti, Ekawatiningsih dkk. (2012). Restoran jilid 2. Direktorat Pembinaan Sekolah Menengah Kejujuran. Departemen Pendidikan Nasional"
        ),

        Kuis(
            "Di bawah ini penulisan daftar pustaka yang bersumber dari jurnal yang benar adalah",
            "Lestari, R. T., Adi, E. P., & Soepriyanto, Y. E-Book Interaktif. Jurnal Kajian Teknologi Pendidikan, 1(1), 71-76.(2018)",
            "Lestari, R. T., Adi, E. P., & Soepriyanto, Y. (2018). E-Book Interaktif. Jurnal Kajian Teknologi Pendidikan, 1(1), 71-76.",
            "Lestari, R. T., Adi, E. P., & Soepriyanto, Y.2018 Jurnal Kajian Teknologi Pendidikan, 1(1), 71-76. E-book Interaktif",
            "Lestari, R. T., Adi, E. P., & Soepriyanto, Y. (2018). E-Book Interaktif. Jurnal Kajian Teknologi Pendidikan, 1(1), 71-76.",
            "Lestari, R. T., Adi, E. P., & Soepriyanto, Y. (2018). E-Book Interaktif. Jurnal Kajian Teknologi Pendidikan, 1(1), 71-76."
        ),


        )
    val kuisMateriLima = mutableListOf<Kuis>(


        Kuis(
            "Kalimat yang kacau atau kalimat yang susunannya tidak teratur sehingga kalimat sulit dipahami disebut ..",
            "Kalimat baku",
            "Kalimat rancu",
            "Kalimat kacau balau",
            "Kalimat teratur",
            "Kalimat rancu"
        ),

        Kuis(
            "Di bawah ini yang tergolong kalimat rancu adalah",
            "Di dalam penelitian ini akan membahas tentang efektifitas penggunaan video tutorial",
            "Penelitian ini membahas tentang peningkatan hasil belajar siswa",
            "Menurut penelitian sebelumnya, terdapat efektifitas penggunaan media pembelajaran",
            "Penelitian sebelumnya menyatakan bahwa terdapat efektifitas penggunaan video tutorial",
            "Di dalam penelitian ini akan membahas tentang efektifitas penggunaan video tutorial"
        ),


        Kuis(
            "Kalimat rancu terdiri dari dua jenis yaitu :",
            "Kerancuan dalam bentuk paragraf dan frasa",
            "Kerancuan dalam bentuk paragraf dan kalimat",
            "Kerancuan dalam bentuk bahasa dan kalimat",
            "Kerancuan dalam bentuk kata dan kalimat",
            "Kerancuan dalam bentuk kata dan kalimat"
        ),


        Kuis(
            "Di bawah ini yang tegolong kalimat efektif (tidak rancu) adalah",
            "Modul elektronik adalah merupakan bentuk bahan belajar mandiri yang disusun secara sistematis",
            "Modul elektronik merupakan bentuk bahan untuk belajar mandiri disusun secara sistematis",
            "Modul elektronik merupakan bentuk bahan belajar mandiri yang disusun secara sistematis",
            "Modul elektronik adalah bahan untuk  belajar mandiri yang  akan  disusun secara sistematis",
            "Modul elektronik merupakan bentuk bahan belajar mandiri yang disusun secara sistematis"
        ),

        Kuis(
            "Kata atau frasa yang menjelaskan pengungkapan makna konsep, proses, keadaan,atau sifat yang khas dalam bidang ilmu pengetahuan, teknologi dan seni disebut",
            "Istilah",
            "Ungkapan",
            "Kutipan",
            "Makna",
            "Istilah"
        ),


        Kuis(
            "Predikat kota Yogyakarta bukan hanya sekadar (1) kota pelajar dan pariwisata, melainkan gudangnya industri kecil, terutama kerajinan. Ribuan industri kecil kerajinan berkembang di daerah ini, mulai dari skala kecil, misalnya souvenir (2) hasil industri rumah tangga hingga skala besar yang bertaraf (3) internasional. Model-model yang dihasilkan juga sesuai dengan tren (4) dunia.\n" +
                    "Kata tidak baku yang terdapat pada paragraf tersebut ditandai nomor . . . .",
            "(1)",
            "(2)",
            "(3)",
            "(4)",
            "(1)"
        ),


        Kuis(
            "Penyerapan Istilah dalam bahasa Indonesia diambil dari berbagai sumber, Di bawah ini  tiga golongan bahasa yang penting, kecuali",
            "Bahasa Indonesia dari Bahasa Melayu",
            "Bahasa Nusantara yang serumpun yaitu Jawa Kuno",
            "Bahasa Asing, yaitu Bahasa Inggris dan Arab",
            "Bahasa Nenek Moyang",
            "Bahasa Nenek Moyang"
        ),


        Kuis(
            "Bacalah kutipan teks berikut !\n" +
                    "Tono tergolong remaja yang sehat. Namun, semenjak duduk di bangku SMA, Tono gemar mengkonsumsi makanan cepat saji ……dia menjadi obesitas dan sulit beraktivitas seperti biasa.\n" +
                    "Kata penghubung yang tepat untuk mengisi kalimat diatas adalah ",
            "Karena",
            "Sebab",
            "Akibatnya",
            "Dan ",
            "Akibatnya"
        ),

        Kuis(
            "Siska anak yang cantik ….dia kurang pintar\n" +
                    "Kata penghubung yang tepat untuk mengisi kalimat diatas adalah ",
            "Karena",
            "Tetapi",
            "Sebab",
            "Oleh karena itu",
            "Tetapi"
        ),

        Kuis(
            "Sebagian besar masyarakat Indonesia gemar mengkonsumsi gorengan. ….  berbagai macam jajanan atau makanan yang di goreng mengandung lemak trans.",
            "Padahal",
            "Jika",
            "Bahwa",
            "Kecuali",
            "Padahal"
        )


    )
    val kuisMateriEnam = mutableListOf<Kuis>(
        Kuis(
            "Dalam penulisan karya tulis ilmiah terdiri dari tiga struktur karya ilmiah, antara lain ",
            "Bagian depan, tengah dan belakang karya ilmiah",
            "Bagian awal, isi dan akhir karya ilmiah",
            "Bagian atas, isi dan bawah karya ilmiah",
            "Bagian awal, tengah dan akhir karya ilmiah",
            "Bagian awal, isi dan akhir karya ilmiah"
        ),

        Kuis(
            "Di bawah ini yang bukan merupakan bagian awal dari sebuah karya ilmiah adalah",
            "Metode Penelitian",
            "Kata Pengantar",
            "Judul",
            "Daftar Tabel",
            "Metode Penelitian"
        ),


        Kuis(
            "Berikut merupakan hal – hal yang perlu dicantumkan dalam sebuah judul karya tulis ilmiah, kecuali ",
            "Jenis karya ilmiah",
            "Tujuan penelitian atau karya ilmiah",
            "Nama Penulis",
            "Nama Dosen Pembimbing Skripsi",
            "Nama Dosen Pembimbing Skripsi"
        ),


        Kuis(
            "Halaman yang berisi ungkapan rasa syukur  karya ilmiah dapat diselesaikan, uraian singkat tentang maksud tulisan, dan ucapan terima kasih pada berbagai pihak yang berperan serta sehingga sebuah karya ilmiah dapat diselesaikan disebut ",
            "Halaman persembahan",
            "Halaman Pengesahan",
            "Kata Pengantar",
            "Kajian Teori",
            "Kata Pengantar"
        ),

        Kuis(
            "Perhatikan gambar di bawah ini !\n" +

                    "Terdapat kesalahan dalam penulisan cover judul penelitian di atas, yaitu ..",
            "Tidak mencantumkan tujuan penulisan dan nama universitas penulis",
            "Tidak mencantumkan nama dosen pembimbing skripsi dan nama universitas penulis",
            "Tidak mencantumkan tanggal pembuatan skripsi dan tujuan penulisan",
            "Tidak mencantumkan nama penulis dan nama dosen pembimbing skripsi",
            "Tidak mencantumkan tujuan penulisan dan nama universitas penulis"
        ),

        Kuis(
            "Bagian yang berisi bab-bab, pendahuluan, kajian teori, pembahasan, kesimpulan dan saran hingga hasil dari penelitian disebut",
            "Bagian isi karya ilmiah",
            "Bagian tengah karya ilmiah",
            "Bagian awal karya ilmiah",
            "Bagian akhir karya ilmiah",
            "Bagian isi karya ilmiah"
        ),


        Kuis(
            "Di bawah ini yang bukan merupakan bagian isi dari sebuah karya ilmiah adalah",
            "Pendahuluan",
            "Kajian Teori",
            "Daftar Pustaka",
            "Kesimpulan dan Saran ",
            "Daftar Pustaka"
        ),

        Kuis(
            "Gambaran secara menyeluruh tentang isi karya ilmiah dan sebagai petunjuk bagi pembaca yang ingin langsung melihat suatu bab atau sub-bab disebut",
            "Daftar Pustaka",
            "Daftar Isi",
            "Kajian Teori",
            "Kesimpulan",
            "Daftar Isi"
        ),


        Kuis(
            "Bagian yang terdiri dari daftar pustaka urutan atau rincian yang berisikan identitas buku dan pengarang yang disusun secara alfabet dan lampiran dokumen disebut",
            "Bagian isi karya ilmiah",
            "Bagian tengah karya ilmiah",
            "Bagian awal karya ilmiah",
            "Bagian akhir karya ilmiah",
            "Bagian akhir karya ilmiah"
        ),


        Kuis(
            "Di bawah ini yang merupakan bagian akhir dari sebuah karya ilmiah adalah",
            "Hasil Penelitian dan Pembahasan",
            "Metode Penelitian",
            "Daftar Pustaka",
            "Kajian Teoritis",
            "Daftar Pustaka"
        )


    )
    val kuisMateriTujuh = mutableListOf<Kuis>(
        Kuis(
            "Dalam menentukan sebuah topik karya ilmiah harus memperhatikan hal- hal sebagai berikut, kecuali",
            "Sesuai dengan prodi atau bidang ilmu yang ditekuni oleh peneliti.",
            "Memiliki sumber bahan yang relevan untuk mendukung topik penelitian.",
            "Terdapat landasan teori atau teori-teori dari penelitian sebelumnya",
            "Topik yang baru dan sedang menjadi tren",
            "Topik yang baru dan sedang menjadi tren"
        ),


        Kuis(
            "Pemilihan topik adalah sangat penting karena .... ",
            "merupakan langkah dalam penulisan karya tulis ilmiah ",
            "menentukan arah kegiatan penulisan karya tulis berikutnya ",
            "mengidentifikasi area tulisan ",
            "mampu merumuskan topik ",
            "menentukan arah kegiatan penulisan karya tulis berikutnya "
        ),

        Kuis(
            "Topik yang dibahas oleh penulis, dapat berasal dari beberapa sumber, kecuali …. ",
            "Penulis sendiri ",
            "Orang lain (para ahli, dosen, teman)",
            "Buku referensi ",
            " Catatan-catatan",
            " Catatan-catatan"
        ),


        Kuis(
            "Topik yang dipilih harus dapat dilaksanakan dengan baik karena mempunyai beberapa keterbatasan, kecuali .... ",
            "mampu menguasai materi dan konsep/teori ",
            "mempunyai waktu yang cukup ",
            "mempunyai tenaga pelaksana yang terlatih dan cukup, serta dana cukup tersedia ",
            " mempunyai data yang cukup tersedia",
            " mempunyai data yang cukup tersedia"
        ),


        Kuis(
            "Jawaban sementara dari permasalahan dalam sebuah penelitian sampai ditemukan jawaban yang kongkrit disebut ",
            "Hipotesis",
            "Referensi",
            "Kesimpulan",
            "Abstrak",
            "Hipotesis"
        ),

        Kuis(
            "Perhatikan pernyataan berikut !\n" +
                    "Tujuan melakukan hipotesis adalah sebagai berikut :\n" +
                    "1)Meningkatkan keterampilan dalam mengorganisasikan dan menyajikan fakta dan data secara jelas dan sistematis.\n" +
                    "2)Mengidentifikasikan data yang yang relevan untuk disimpulkan\n" +
                    "3)Memberikan jawaban  sementara terhadap kemungkinan akan pengembangan ilmu pengetahuan\n" +
                    "4)Sebagai arahan bagi peneliti dalam melakukan penelitian\n" +
                    "5)Mengakrabkan penulis dengan kegiatan ilmiah\n" +
                    "Dari pernyataan di atas yang merupakan tujuan melakukan hipotesis adalah ",
            "1,2 dan 3",
            "2,3, dan 4",
            "1,4, dan 5",
            "2,4, dan 5",
            "2,3, dan 4"
        ),

        Kuis(
            "Dalam penelitian Kuantitatif terdapat dua jenis Hipotesis Statistika, antara lain ",
            "Hipotesis Deskriptif dan Komparatif",
            "Hipotesis Hubungan dan Hipotesis Alternatif (Ha)",
            "Hipotesis Alternatif (Ha) dan Hipotesis Nol (H0)",
            "Hipotesis Deskriptif dan Hipotesis Nol (H0)",
            "Hipotesis Alternatif (Ha) dan Hipotesis Nol (H0)"
        ),
        Kuis(
            "Perhatikan contoh masalah dalam penelitian berikut ini !\n" +
                    "“Adanya perbedaan kualitas abon dengan menambahkan jantung pisang dan tidak menambahkan jantung pisang”\n" +
                    "Dari permasalahan diatas, Maka Hipotesis Komparatif yang dapat dirumuskan adalah sebagai berikut, kecuali ",
            "Kualitas abon dengan menambahkan jatuh pisang sangat baik",
            "Tidak ada perbedaan kualitas antara abon yang ditambahkan jantung pisang dengan yang tidak ditambahkan jantung pisang",
            " Kualitas abon yang ditambahkan jantung pisang dengan yang tidak ditambahkan jantung pisang sama ",
            "Kualitas abon yang ditambahkan jantung pisang dan daging sapi sama  dengan yang tidak ditambahkan jantung pisang .",
            "Kualitas abon yang ditambahkan jantung pisang dan daging sapi sama  dengan yang tidak ditambahkan jantung pisang ."
        ),

        Kuis(
            "Salah satu kriteria perumusan hipotesis penelitian yang baik adalah ",
            "Hipotesis dirumuskan dalam bentuk angk angka rumusan",
            "Menggunakan variabel-variabel bebas saja",
            "Pernyataan yang dirumuskan dengan maksud dapat diuji secara empiris (data lapangan) yang dapat diukur sejauh apa bisa terbukti kebenarannya. ",
            "Pernyataan tidak boleh dikembangkan",
            "Pernyataan yang dirumuskan dengan maksud dapat diuji secara empiris (data lapangan) yang dapat diukur sejauh apa bisa terbukti kebenarannya. "

        ),

        Kuis(
            "Penulisan karya tulis dapat dilaksanakan dengan cukup tersedia faktor pendukung, seperti .... ",
            "Data cukup tersedia dan mendapat izin dari subjek yang diteliti ",
            "Ide yang orisinil ",
            "Sesuai dengan minat ",
            "Konsep teori objektif",
            "Data cukup tersedia dan mendapat izin dari subjek yang diteliti "
        )

    )
    val kuisMateriDelapan = mutableListOf<Kuis>(
        Kuis(
            "Landasan yang melatarbelakangi dan mendukung masalah penelitian sehingga menimbulkan minat dalam menulis karya tulis ilmiah disebut",
            "Kajian Teori",
            "Rumusan Masalah",
            "Hipotesis",
            "Latar Belakang Masalah",
            "Latar Belakang Masalah"
        ),


        Kuis(
            "Berikut merupakan hal- hal yang dipaparkan dalam latar belakang, kecuali ",
            "teori, masalah yang akan diteliti",
            "wawancara dan pengalaman atau pengamatan pribadi yang terkait erat dengan pokok masalah",
            "jawaban sementara yang masih harus dibuktikan kebenarannya melalui penelitian.",
            "penjelasan tentang dipilihnya masalah bagi peneliti ataupun secara umum",
            "jawaban sementara yang masih harus dibuktikan kebenarannya melalui penelitian."
        ),


        Kuis(
            "Jika sebuah karya tulis dengan tema pemanfaatan  kulit pisang\n" +
                    "Rumusan latar belakang berikut ini yang tidak sesuai dengan tema karya tulis tersebut adalah...",
            "Banyak limbah kulit pisang yang terbuang sia sia",
            "Kulit pisang banyak mengandung zat gizi seperti vitamin B,C, B6, magnesium dan zat besi.",
            "Buah pisang diminati semua kalangan",
            "Limbah kulit pisang dapat dimanfaatkan sebagai bahan makanan",
            "Buah pisang diminati semua kalangan"
        ),

        Kuis(
            "Perhatikan identifikasi masalah berikut :\n" +
                    "1)Apakah kulit buah naga dapat dimanfaatkan ?\n" +
                    "2)Bagaimana pengolahan limbah kulit bah naga menjadi bahan makanan ?\n" +
                    "Latar belakang karya ilmiah yang sesuai dengan identifikasi masalah tersebut adalah ...",
            "Kulit buah naga selama ini tidak dimanfaatkan dengan baik dalam pengolahan makanan. Kulit buah naga merah ternyata dapat dijadikan pewarna alami karena mengandung  pigmen betalain yang bersifat larut dalam air .",
            "Kulit buah naga yang dimanfaatkan dengan baik dapat menghasilkan produk makanan yang nantinya menguntungkan . Oleh sebab itu, mari kita manfaatkan supaya memberi keuntungan dalam segi perekonomian",
            "Kulit buah naga selama ini hanya terbuang percuma. Kulit buah naga tidak dapat dimanfaatkan menjadi bahan makanan",
            "Berdasarkan hasil penelitian, ternyata kulit buah naga dapat dimanfaatkan dalam pengolahan makanan. Kulit buah naga akhirnya dapat dijadikan pewarna makanan alami. Mari kita mulai memanfaatkan kulit buah naga dalam pengolahan makanan ",
            "Kulit buah naga selama ini tidak dimanfaatkan dengan baik dalam pengolahan makanan. Kulit buah naga merah ternyata dapat dijadikan pewarna alami karena mengandung  pigmen betalain yang bersifat larut dalam air ."
        ),

        Kuis(
            "Di bawah ini yang bukan merupakan bagian dari Bab I adalah",
            "Identifikasi Masalah",
            "Rumusan Masalah ",
            "Keterbatasan Penelitian",
            "Kerangka Konseptual",
            "Kerangka Konseptual"
        ),

        Kuis(
            "Identifikasi teori-teori yang dijadikan sebagai landasan berfikir untuk melaksanakan suatu penelitian atau  mendiskripsikan kerangka referensi disebut",
            "Kerangka Teoritis",
            "Kerangka Konseptual",
            "Rumusan Masalah",
            "Hipotesis",
            "Kerangka Teoritis"
        ),


        Kuis(
            "Apa tujuan dari Kerangka Konseptual ?",
            "mendeskripsikan kerangka referensi atau teori yang digunakan",
            "untuk menghubungkan atau menjelaskan tentang suatu topik yang akan dibahas.",
            "memperlihatkan variabel-variabel yang diteliti",
            "menguatkan penelitian pada fokus permasalahan yang akan diteliti",
            "untuk menghubungkan atau menjelaskan tentang suatu topik yang akan dibahas."
        ),

        Kuis(
            "Di bawah ini yang bukan merupakan bagian dari Bab II adalah",
            "Kerangka teoritis",
            "Keterbatasan Penelitian",
            "Hipotesis",
            "Kerangka konseptual ",
            "Keterbatasan Penelitian"
        ),

        Kuis(
            "Rumusan hipotesis pada umumnya  bersifat ..",
            "Kreatif dan kritis",
            "Sistematis dan tidak rancu",
            "Definitif dan direksional.",
            "Definitif dan kreatif",
            "Definitif dan direksional."
        ),

        Kuis(
            "Di bawah ini yang bukan merupakan Rumusan hipotesis yang baik adalah ",
            "Menyatakan pertautan antara dua variabel atau lebih",
            "Dituangkan dalam bentuk kalimat pernyataan",
            "Dirumuskan secara singkat, padat, dan jelas",
            "Hanya dapat diuji secara statistik",
            "Hanya dapat diuji secara statistik"

        )

    )
    val kuisMateriSembilan = mutableListOf<Kuis>(
        Kuis("Di bawah ini yang bukan merupakan bagian dari Bab III adalah",
            "Hipotesis Penelitian",
            "Jenis Penelitian",
            "Populasi dan Sampel",
            "Tenik Pengumpulan Data ",
            "Hipotesis Penelitian"
        ),


        Kuis("Berikut merupakan penelitian yang tergolong Penelitian Kualitatif , kecuali",
            "Penelitian Deskriptif",
            "Penelitian Studi Kasus",
            "Penelitan Korelasi",
            "Penelitian Studi Empiris",
            "Penelitan Korelasi"),


        Kuis("Penelitian yang dilakukan dengan mengumpulkan dan menganalisis data yang berupa angka disebut..",
            "Penelitian Deskriptif",
            "Penelitian Kuantitatif",
            "Penelitian Eksperimen",
            "Penelitian Kualitatif",
            "Penelitian Kuantitatif"),
        Kuis(
            "Variabel penelitian dibedakan menjadi tiga, antara lain :",
            "Sistematis, baku dan valid",
            "Bebas, terikat dan kontrol",
            "Bebas, sistematis dan baku",
            "Terikat, terarah dan sistematis",
            "Bebas, terikat dan kontrol"),


        Kuis("Perhatikan judul karya ilmiah berkut ini !\n"+
                "“Pengaruh penggunaan media video pembelajaran terhadap hasil belajar pengetahuan bahan makananan di SMK Negeri 9 Kota Padang “\n"+
                "Yang manakah merupakan variabel bebas (X) dari judul diatas ?",
            "Video pembelajaran",
            "Hasil belajar pengetahuan bahan makanan",
            "SMK Negeri 9 Kota Padang",
            "Pengaruh penggunaan",
            "SMK Negeri 9 Kota Padang"),

        Kuis("Berikut merupakan teknik atau metode pengumpulan data , kecuali ..",
            "Studi Data",
            "Observasi",
            "Kutipan Langsung",
            "Angket (Kuesioner)",
            "Kutipan Langsung"),

        Kuis("Informasi atau data untuk karya tulis yang diambil langsung dari sumber data dan belum diolah disebut data .... ",
            "sekunder ",
            "primer ",
            "lapangan ",
            "empiric",
            "primer "
        ),

        Kuis("Instrumen adalah alat bantu untuk mengumpulkan data, karena itu instrumen perlu diuji dengan uji .... ",
            "objektivitas dan reliabilitas ",
            "validitas dan reliabilitas ",
            "reliabilitas dan subjektivitas ",
            "validitas dan subjektivitas",
            "validitas dan reliabilitas "),


        Kuis("Abstrak Karya Tulis Ilmiah  berfungsi: ",
            "untuk mengungkapkan isi karya tulis ilmiah secara ringkas ",
            "untuk mengungkapkan latar belakang penulisan ",
            "untuk mengungkapkan tujuan penulisan ",
            "untuk mengungkapkan imaginasi penulis" ,
            "untuk mengungkapkan isi karya tulis ilmiah secara ringkas "),


        Kuis("Abstrak dilengkapi dengan kata kunci (keywords) yang terdiri dari: ",
            "1-3 kata ",
            "3-5 kata ",
            "5-10 kata ",
            "10-15 kata ",
            "3-5 kata ")

    )
    val kuisMateriSepuluh = mutableListOf<Kuis>(
        Kuis("Kegiatan berbicara di forum ilmiah atau umum untuk menyampaikan topik, ide, informasi dan hasil sebuah penelitian disebut",
            "Presentasi Karya Tulis",
            "Presentasi Ilmiah",
            "Presentasi Forum",
            "Presentasi Seminar",
            "Presentasi Ilmiah"
        ),

        Kuis("Di bawah ini yang bukan unsur – unsur utama dalam sebuah presentasi adalah",
            "Notulen",
            "Moderator",
            "Konsumsi",
            "Pembicara",
            "Konsumsi"
        ),


        Kuis("Dalam tahap persiapan pada tahapan presentasi, hal yang harus dilakukan antara lain adalah",
            "Penyampaian seluruh materi presentasi",
            "Menutup presentasi  dengan menyimpulkan",
            "Membuka presentasi",
            "Menentukan topik atau materi apa yang akan dibawakan",
            "Menentukan topik atau materi apa yang akan dibawakan"),

        Kuis("Bagian penyampaian seluruh materi presentasi dengan bahasa dan intonasi yang baik agar tujuan presentasi tersampaikan dengan baik merupakan tahapan ..",
            "Tahap Membawakan",
            "Tahap Evaluasi",
            "Tahap Persiapan",
            "Tahap Penutup",
            "Tahap Membawakan"),


        Kuis("Di bawah ini hal- hal yang perlu diperhatikan dalam sebuah Presentasi, kecuali",
            "Berpakaian sopan dan rapi",
            "Gaya Bahasa",
            "Membuka presentasi dengan baik dan menarik.",
            "Menggunakan alat bantu seperti laptop, proyektor, penyaji dapat menggunakan media yang menarik",
            "Membuka presentasi dengan baik dan menarik."),


        Kuis("Hal- hal yang harus diperhatikan dalam penggunaan Powerpoint pada presentasi , kecuali ",
            "pemilihan warna teks dan tampilan latar slide media presentasi",
            "Pemilihan latar, bentuk dan  dan ukuran huruf",
            "Pemilihan warna slide yang cerah dan terang.",
            "Kombinasi Ilustrasi  seperti foto, tabel, gambar, dan clip art",
            "Pemilihan warna slide yang cerah dan terang."),

        Kuis("Media publikasi atau penyebaran informasi berbentuk ilustrasi yang bertujuan untuk memberikan informasi ataupun promosi suatu kegiatan pada orang-orang yang melihat atau membacanya disebut",
            "Poster",
            "Grafis",
            "Animasi",
            "Ilustrasi",
            "Poster"),

        Kuis("Salah satu konten yang harus dimiliki poster ilmiah, antara lain",
            "Kajian Teori",
            "Nama Dosen Pembimbing’",
            "Hasil Penelitian",
            "Daftar Isi",
            "Hasil Penelitian"),


        Kuis("Software yang umum digunakan untuk mendesain poster adalah kecuali",
            "CorelDRAW",
            "Microsoft Excel",
            "Photoshop",
            " PowerPoint",
            "Microsoft Excel"),

        Kuis("Font yang disarankan dalam pembuatan poster ilmiah adalah",
            "Times New Roman atau Arial",
            "Calibri",
            "Kartika",
            "Bell MT",
            "Times New Roman atau Arial")

    )
}

class Kuis(quiz: String, A: String, B: String, C: String, D: String, Answer: String) {
    val quiz = quiz
    val A = A
    val B = B
    val C = C
    val D = D
    val Answer = Answer
}