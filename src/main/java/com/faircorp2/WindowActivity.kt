package com.faircorp2

import android.os.Bundle
import android.widget.TextView
import com.faircorp2.model.WindowService

const val WINDOW_NAME_PARAM = "com.faircorp2.windowname.attribute"

class WindowActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val id = intent.getLongExtra(WINDOW_NAME_PARAM, 0)
        val window = WindowService.findById(id)

        if (window != null) {
            findViewById<TextView>(R.id.txt_window_name).text = window.name
            findViewById<TextView>(R.id.txt_room_name).text = window.room.name
            findViewById<TextView>(R.id.txt_window_current_temperature).text =
                window.room.currentTemperature?.toString()
            findViewById<TextView>(R.id.txt_window_target_temperature).text =
                window.room.targetTemperature?.toString()
            findViewById<TextView>(R.id.txt_window_status).text = window.status.toString()
        }

    }


}