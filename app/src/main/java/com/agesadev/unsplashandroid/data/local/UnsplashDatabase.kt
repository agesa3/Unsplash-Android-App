package com.agesadev.unsplashandroid.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.agesadev.unsplashandroid.data.local.dao.UnsplashImageDao
import com.agesadev.unsplashandroid.data.local.dao.UnsplashRemoteKeysDao
import com.agesadev.unsplashandroid.models.UnsplashImage
import com.agesadev.unsplashandroid.models.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}