package com.example.emodultatatulis.ui.materi

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.emodultatatulis.QuizActivity
import com.example.emodultatatulis.R
import com.example.emodultatatulis.ui.quiz.QuizModel
import kotlinx.android.synthetic.main.list_materi.view.*

class MateriRecycleView(private var materiList : MutableList<MateriList>):
    RecyclerView.Adapter<MateriHolder>() {
    lateinit var navController: NavController

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_materi, parent, false)
        return MateriHolder(view)
    }

    override fun onBindViewHolder(holder: MateriHolder, position: Int) {
        val list_materi = materiList[position].materi_list
        holder.materi.text = list_materi
        val activity = holder.itemView.context as Activity
        holder.tesMateri.setOnClickListener {

            val intent= Intent(activity,QuizActivity::class.java)
            intent.putExtra("materi",list_materi)
           activity.startActivity(intent)
            println(list_materi)
        }
        holder.itemView.materiCard.setOnClickListener {
            navController = Navigation.findNavController(it)
            navController.navigate(
                R.id.action_nav_materi_to_materiDetailFragment,
                bundleOf("materi" to list_materi )
            )
        }
    }

    override fun getItemCount(): Int {
        return materiList.size
    }
}

class MateriHolder(v : View) : RecyclerView.ViewHolder(v) {
    val materi = v.findViewById<TextView>(R.id.Materi)
    val tesMateri = v.findViewById<TextView>(R.id.TesMateri)
}
