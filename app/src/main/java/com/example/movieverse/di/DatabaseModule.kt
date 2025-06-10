package com.example.movieverse.di

import android.content.Context
import androidx.room.Room
import com.example.movieverse.data.local.MovieVerseDatabase
import com.example.movieverse.utils.Constants.MOVIES_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton
import kotlin.jvm.java

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): MovieVerseDatabase {
        return Room.databaseBuilder(
            context,
            MovieVerseDatabase::class.java,
            MOVIES_DATABASE
        ).build()
    }
}