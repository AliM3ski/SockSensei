package com.example.socksensei

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "socks")
data class Sock(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String,
    val imageResId: Int // Resource ID for the sock image
)
