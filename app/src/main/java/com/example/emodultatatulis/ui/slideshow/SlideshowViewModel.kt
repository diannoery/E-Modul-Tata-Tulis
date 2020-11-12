package com.example.emodultatatulis.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    val ytData = mutableListOf<YtId>(
        YtId("0HzyGA4wRh8", ""),
        YtId("GZhwjWni_L0", ""),
        YtId("LXBOIbxSK3c", ""),
        YtId("LxPIaR6FcRY", ""),
        YtId("-AO3Wf1Bs68", ""),
        YtId("rxarsL2EN8w", ""),
        YtId("JROszLXVGlU", ""),

        YtId("9dyOHQDJh54", ""),
        YtId("R0TnFpst1SI", ""),
        YtId("5fiqssxQOpY", ""),

    )
    val YoutubeLiveData: MutableLiveData<MutableList<YtId>> = MutableLiveData(ytData)
}

class YtId(var Id: String, Caption: String) {
    val videoId = Id
    val caption = Caption


}