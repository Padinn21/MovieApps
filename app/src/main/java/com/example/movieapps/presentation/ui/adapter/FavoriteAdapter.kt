package com.example.movieapps.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapps.data.model.FavoriteEntity
import com.example.movieapps.databinding.ItemFavoriteBinding

class FavoriteAdapter(var listMovie: List<FavoriteEntity>): RecyclerView.Adapter<FavoriteAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemFavoriteBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvTitle.text = listMovie[position].originalTitle
        Glide.with(holder.itemView)
            .load("https://image.tmdb.org/t/p/w500"+listMovie[position].posterPath)
            .into(holder.binding.imgPoster)
        holder.binding.tvVote.text = listMovie[position].voteAverage.toString()
    }

    override fun getItemCount(): Int = listMovie.size
}