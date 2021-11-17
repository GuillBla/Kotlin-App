package com.faircorp2.model

class WindowService {

    companion object {
        // Fake rooms
        val ROOMS: List<RoomDto> = listOf(
            RoomDto(1, "Room EF 6.10", 18.2, 20.0),
            RoomDto(2, "Hall", 18.2, 18.0),
            RoomDto(3, "Room EF 7.10", 21.2, 20.0)
        )

        // Fake windows
        val WINDOWS: List<WindowDto> = listOf(
            WindowDto(1, "Entry Window", ROOMS[0], StatusW.CLOSED),
            WindowDto(2, "Back Window", ROOMS[0], StatusW.CLOSED),
            WindowDto(3, "Sliding door", ROOMS[1], StatusW.OPEN),
            WindowDto(4, "Window 1", ROOMS[2], StatusW.CLOSED),
            WindowDto(5, "Window 2", ROOMS[2], StatusW.CLOSED),
        )

        // Fake heaters
        val HEATERS: List<HeaterDto> = listOf(
            HeaterDto(1, "Main Heater", ROOMS[0], StatusH.ON),
            HeaterDto(4, "Heater 1", ROOMS[2], StatusH.ON),
            HeaterDto(5, "Heater 2", ROOMS[2], StatusH.OFF),
        )


        fun findById(id: Long) = WINDOWS.firstOrNull { it.id == id }

    }


    fun findAll() = WINDOWS.sortedBy { it.name }
}