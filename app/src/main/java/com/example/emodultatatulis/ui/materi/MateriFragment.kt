package com.example.emodultatatulis.ui.materi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emodultatatulis.R
import kotlinx.android.synthetic.main.fragment_materi.*


class MateriFragment : Fragment() {

    val materiDataViewModel by activityViewModels<MateriViewModel>()
    lateinit var materiRecycleView: MateriRecycleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        materi_RV.layoutManager= LinearLayoutManager(activity)
        materiRecycleView = MateriRecycleView(materiDataViewModel.materiLiveData.value!!)
        materi_RV.adapter= materiRecycleView
        materiDataViewModel.materiLiveData.observe(viewLifecycleOwner, Observer {
            materiRecycleView.notifyDataSetChanged()
        })


    }
}