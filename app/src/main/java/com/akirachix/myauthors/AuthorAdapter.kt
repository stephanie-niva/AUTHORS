package com.akirachix.myauthors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AuthorAdapter(var authorsList:List<Author>):
    RecyclerView.Adapter<AuthorsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.author_list_item, parent,false)
    return AuthorsViewHolder(itemView)
}

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
        val author = authorsList[position]
        holder.tvTitle.text = author.title
        holder.tvName.text = author.name
        holder.tvPreview.text = author.preview
        holder.tvDate.text = author.publishDate}

    override fun getItemCount(): Int {
        return authorsList.size   }
}


    class AuthorsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
        val tvPreview= itemView.findViewById<TextView>(R.id.tvPreview)
    }


}