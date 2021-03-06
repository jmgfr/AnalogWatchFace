package com.vlad1m1r.watchface.config.viewholders

import android.view.View
import android.widget.Switch
import androidx.recyclerview.widget.RecyclerView
import com.vlad1m1r.watchface.R
import com.vlad1m1r.watchface.data.DataProvider

class BlackBackgroundViewHolder(itemView: View, private val dataProvider: DataProvider): RecyclerView.ViewHolder(itemView) {
    init {
        itemView.findViewById<Switch>(R.id.settings_switch).apply {
            isChecked = dataProvider.hasBlackBackground()
            setText(R.string.background_black)
            setOnCheckedChangeListener { _, isChecked ->
                dataProvider.setHasBlackBackground(isChecked)
            }
        }
    }
}