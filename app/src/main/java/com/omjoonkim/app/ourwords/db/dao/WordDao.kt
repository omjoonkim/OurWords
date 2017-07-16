package com.omjoonkim.app.ourwords.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.omjoonkim.app.ourwords.vo.Word

@Dao
interface WordDao {
    @Query("SELECT * FROM words")
    fun loadWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveWrods(words: List<Word>)

    @Query("SELECT * FROM words WHERE id=:id")
    fun getWord(id: Int): LiveData<Word>
}