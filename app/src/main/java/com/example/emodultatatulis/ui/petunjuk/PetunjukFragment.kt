package com.example.emodultatatulis.ui.petunjuk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emodultatatulis.R
import com.example.mediapembelajaran.ui.petunjuk.PetunjukRecycleView
import com.example.mediapembelajaran.ui.petunjuk.PetunjukViewModel
import kotlinx.android.synthetic.main.fragment_petunjuk.*

class PetunjukFragment : Fragment() {

    val petunjukViewModel by activityViewModels<PetunjukViewModel>()
    lateinit var petunjukRecycleView: PetunjukRecycleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_petunjuk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        petunjuk_header.text="   Selamat datang dalam Modul Tata Tulis Karya Ilmiah berbasis Android Mobile. Agar tidak mengalami kesulitan dalam penggunaannya, anda dapat memahami petunjuk terlebih dahulu."

        petunjuk.layoutManager= LinearLayoutManager(activity)
        petunjukRecycleView = PetunjukRecycleView(petunjukViewModel.PetunjukLiveData.value!!)
        petunjuk.adapter= petunjukRecycleView
        petunjukViewModel.PetunjukLiveData.observe(viewLifecycleOwner, Observer {
            petunjukRecycleView.notifyDataSetChanged()
        })

    }
}