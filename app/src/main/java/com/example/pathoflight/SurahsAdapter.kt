//package com.example.pathoflight
//
//import androidx.recyclerview.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//
//class SurahsAdapter (private val surahs: List<Surahs>) : RecyclerView.Adapter<SurahsAdapter.SurahsViewHolder>(){
//    class SurahsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val name : TextView = view.findViewById(R.id.name)
//        val englishName : TextView = view.findViewById(R.id.englishName)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurahsViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
//        return SurahsViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun onBindViewHolder(holder: SurahsViewHolder, position: Int) {
//        TODO("Not yet implemented")
//    }
//}