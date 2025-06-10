package com.example.movieverse.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.movieverse.data.local.dao.HeroDao
import com.example.movieverse.data.local.dao.HeroRemoteKeyDao
import com.example.movieverse.domain.model.Hero
import com.example.movieverse.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey :: class], version = 1)
@TypeConverters(DatabaseConvertor::class)
abstract class MovieVerseDatabase : RoomDatabase() {

    abstract fun heroDao() : HeroDao
    abstract fun heroRemoteKeyDao() : HeroRemoteKeyDao

}