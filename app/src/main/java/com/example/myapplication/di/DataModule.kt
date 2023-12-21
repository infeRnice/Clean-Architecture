package com.example.myapplication.di

import android.content.Context
import com.example.data.repository.UserRepositoryImpl
import com.example.data.storage.UserStorage
import com.example.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.domain.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideUserStorage(context: Context): UserStorage {
        return SharedPrefUserStorage(context = context)
    }

    @Provides
    fun provideUserRepository(userStorage: UserStorage): UserRepository {
        return UserRepositoryImpl(userStorage = userStorage)
    }
}