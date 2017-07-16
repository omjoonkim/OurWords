package com.omjoonkim.app.ourwords.vo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "users")
data class User(
        @PrimaryKey
        var id: String,
        var token: String?,
        var name: String,
        var profileUrl: String?
)