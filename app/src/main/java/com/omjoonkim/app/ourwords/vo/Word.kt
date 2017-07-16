package com.omjoonkim.app.ourwords.vo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "words")
data class Word(
        @PrimaryKey
        var id: String,
        var content: String,
        var image: String,
        var userName: String,
        var userProfile: String,
        var isPrivacy: Boolean,
        var likesCount: Long,
        var timeStamp: Long
)