package com.agesadev.unsplashandroid.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.agesadev.unsplashandroid.utils.Constants.UNSPLASH_REMOTE_KEY_TABLE

@Entity(tableName = UNSPLASH_REMOTE_KEY_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?

)
