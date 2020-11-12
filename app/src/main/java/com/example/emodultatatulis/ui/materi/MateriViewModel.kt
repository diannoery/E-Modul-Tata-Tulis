package com.example.emodultatatulis.ui.materi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MateriViewModel : ViewModel() {


    val materi = mutableListOf<MateriList>(

        MateriList("MATERI 1"),
        MateriList("MATERI 2"),
        MateriList("MATERI 3"),
        MateriList("MATERI 4"),
        MateriList("MATERI 5"),
        MateriList("MATERI 6"),
        MateriList("MATERI 7"),
        MateriList("MATERI 8"),
        MateriList("MATERI 9"),
        MateriList("MATERI 10"),


    )
    val materiLiveData: MutableLiveData<MutableList<MateriList>> = MutableLiveData(materi)

}

class MateriList(var materi: String) {
    val materi_list = materi


}