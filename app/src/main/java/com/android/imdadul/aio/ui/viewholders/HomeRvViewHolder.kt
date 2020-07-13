package com.android.imdadul.aio.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.imdadul.aio.R
import com.android.imdadul.aio.model.Model

class HomeRvViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.holder_layout_home, parent, false)) {
    private var mTvTitle: TextView? = null
    private var mTvDescription: TextView? = null
    private var mImage: ImageView? = null


    init {
        mTvTitle = itemView.findViewById(R.id.tvTitle)
        mTvDescription = itemView.findViewById(R.id.tvDescription)
        mImage = itemView.findViewById(R.id.ivImage)
    }

    fun bind(model: Model) {
        mTvTitle?.text = model.title
        mTvDescription?.text = model.description
        mImage?.setBackgroundResource(model.image)
    }

}