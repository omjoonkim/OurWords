package com.omjoonkim.app.ourwords.vo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "wordOfUserLikes")
data class WordOfUserLike(
        @PrimaryKey
        var id: String,
        var userId: String,
        var wordId: String
)