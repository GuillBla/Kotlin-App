package com.faircorp2.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faircorp2.OnRoomSelectedListener
import com.faircorp2.R


class RoomAdapter(val listener: OnRoomSelectedListener) : RecyclerView.Adapter<RoomAdapter.RoomViewHolder>() { // (1)

    inner class RoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.txt_room_name)
            }

    private val items = mutableListOf<RoomDto>()

    fun update(rooms: List<RoomDto>) {
        items.clear()
        items.addAll(rooms)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_rooms_item, parent, false)
        return RoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val room = items[position]
        holder.apply {
            name.text = room.name
            itemView.setOnClickListener { listener.onRoomSelected(room.id) }
        }
    }
    override fun onViewRecycled(holder: RoomViewHolder) {
        super.onViewRecycled(holder)
        holder.apply {
            itemView.setOnClickListener(null)
        }

    }


}