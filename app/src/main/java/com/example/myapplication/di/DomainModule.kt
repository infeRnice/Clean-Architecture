package com.example.myapplication.di

import com.example.domain.repository.UserRepository
import com.example.domain.usecases.GetUserNameUseCase
import com.example.domain.usecases.SaveUserNameUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

//    @Provides
//    fun provideGetUserNameUseCase(userRepository: UserRepository): GetUserNameUseCase {
//        return GetUserNameUseCase(userRepository = userRepository)
//    }
//
//    @Provides
//    fun provideSaveUserNameUseCase(userRepository: UserRepository): SaveUserNameUseCase {
//        return SaveUserNameUseCase(userRepository = userRepository)
//    }
}