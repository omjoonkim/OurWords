package com.omjoonkim.app.ourwords.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.omjoonkim.app.ourwords.db.dao.UserDao
import com.omjoonkim.app.ourwords.db.dao.WordDao
import com.omjoonkim.app.ourwords.vo.User
import com.omjoonkim.app.ourwords.vo.Word

@Database(entities = arrayOf(User::class, Word::class), version = 1)
abstract class AppDb : RoomDatabase() {
    abstract fun wordDao(): WordDao
    abstract fun userDao(): UserDao
}
