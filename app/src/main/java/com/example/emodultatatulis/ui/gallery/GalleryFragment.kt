package com.example.emodultatatulis.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.emodultatatulis.R

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    lateinit var navController: NavController
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val LK1 = view.findViewById(R.id.LK1) as TextView
        val LK2 = view.findViewById(R.id.LK2) as TextView
        val LK3 = view.findViewById(R.id.LK3) as TextView
        val LK4 = view.findViewById(R.id.LK4) as TextView
        val LK5 = view.findViewById(R.id.LK5) as TextView

        LK1.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_nav_kegiatan_to_lembarKegiatanFragment, bundleOf("LK" to "LK1"))
        }
        LK2.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_nav_kegiatan_to_lembarKegiatanFragment, bundleOf("LK" to "LK2"))
        }
        LK3.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_nav_kegiatan_to_lembarKegiatanFragment, bundleOf("LK" to "LK3"))
        }
        LK4.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_nav_kegiatan_to_lembarKegiatanFragment, bundleOf("LK" to "LK4"))
        }
        LK5.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_nav_kegiatan_to_lembarKegiatanFragment, bundleOf("LK" to "LK5"))
        }

    }
}