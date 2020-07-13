package com.android.imdadul.aio.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.imdadul.aio.model.Model
import com.android.imdadul.aio.viewholders.HomeRvViewHolder

class HomeAdapter(private val list: List<Model>)
    : RecyclerView.Adapter<HomeRvViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRvViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HomeRvViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holderHome: HomeRvViewHolder, position: Int) {
        val model: Model = list[position]
        holderHome.bind(model)
    }

    override fun getItemCount(): Int = list.size

}