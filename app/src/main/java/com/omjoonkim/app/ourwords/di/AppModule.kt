package com.omjoonkim.app.ourwords.di

import android.app.Application
import android.arch.persistence.room.Room
import com.omjoonkim.app.ourwords.db.AppDb
import com.omjoonkim.app.ourwords.db.dao.UserDao
import com.omjoonkim.app.ourwords.db.dao.WordDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

    @Provides
    @Singleton
    fun provideMovieDatabase(application: Application): AppDb =
            Room.databaseBuilder(application, AppDb::class.java, "aa.db").build()

    @Provides
    @Singleton
    fun provideUserDao(db: AppDb): UserDao = db.userDao()

    @Provides
    @Singleton
    fun provideWordDao(db: AppDb): WordDao = db.wordDao()
}
