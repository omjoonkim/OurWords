package com.omjoonkim.app.ourwords.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.omjoonkim.app.ourwords.vo.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveWrods(user: List<User>)

    @Query("SELECT * FROM users WHERE id=:id")
    fun getUser(id: String): LiveData<User>
}