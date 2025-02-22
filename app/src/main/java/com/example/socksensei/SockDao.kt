package com.example.socksensei

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SockDao {
    @Insert
    suspend fun insert(sock: Sock)

    @Query("SELECT * FROM socks")
    fun getAllSocks(): LiveData<List<Sock>>

    @Query("SELECT * FROM socks ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomSock(): Sock?
}