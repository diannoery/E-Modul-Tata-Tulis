package com.example.emodultatatulis.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emodultatatulis.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_slideshow.*

class SlideshowFragment : Fragment() {

    val ytViewModel by activityViewModels<SlideshowViewModel>()
    lateinit var ytRecycleView: YoutubeRecycleView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        youtube_RV.layoutManager= LinearLayoutManager(activity)
        ytRecycleView = YoutubeRecycleView(ytViewModel.YoutubeLiveData.value!!)
        youtube_RV.adapter= ytRecycleView
        ytViewModel.YoutubeLiveData.observe(viewLifecycleOwner, Observer {
            ytRecycleView.notifyDataSetChanged()
        })
    }
}