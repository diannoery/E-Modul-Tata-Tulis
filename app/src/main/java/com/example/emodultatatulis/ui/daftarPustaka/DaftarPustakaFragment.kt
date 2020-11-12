package com.example.emodultatatulis.ui.daftarPustaka

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emodultatatulis.R
import com.example.mediapembelajaran.ui.daftarpustaka.DaftarPustakaModel
import com.example.mediapembelajaran.ui.daftarpustaka.DaftarPustakaRecycleView
import kotlinx.android.synthetic.main.fragment_daftar_pustaka.*


class DaftarPustakaFragment : Fragment() {

    val daftarPustakaViewModel by activityViewModels<DaftarPustakaModel>()
    lateinit var daftarPustakaRecycleView: DaftarPustakaRecycleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar_pustaka, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        RecycleViewList.layoutManager= LinearLayoutManager(activity)
        daftarPustakaRecycleView = DaftarPustakaRecycleView(daftarPustakaViewModel.daftarLiveData.value!!)
        RecycleViewList.adapter= daftarPustakaRecycleView
        daftarPustakaViewModel.daftarLiveData.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            daftarPustakaRecycleView.notifyDataSetChanged()
        })
    }
}