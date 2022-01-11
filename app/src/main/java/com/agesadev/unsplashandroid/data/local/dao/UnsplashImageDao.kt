package com.agesadev.unsplashandroid.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.agesadev.unsplashandroid.models.UnsplashImage

@Dao
interface UnsplashImageDao {

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImage(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}