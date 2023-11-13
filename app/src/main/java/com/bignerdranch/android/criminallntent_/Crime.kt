package com.bignerdranch.android.criminallntent_

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title :String="",
                 var date: Date = Date(),
                 var isSolved:Boolean=false);
/*data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)*/
