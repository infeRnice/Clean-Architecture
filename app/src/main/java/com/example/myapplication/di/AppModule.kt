package com.example.myapplication.di

import com.example.domain.usecases.GetUserNameUseCase
import com.example.domain.usecases.SaveUserNameUseCase
import com.example.myapplication.presentation.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

//    (val context: Context) - в первой итерации передавали Контекст явно

//    @Provides
//    fun provideContext(): Context {
//        return context
//    }

//    @Provides
//    fun provideMainViewModelFactory (
//        getUserNameUseCase: GetUserNameUseCase,
//        saveUserNameUseCase: SaveUserNameUseCase
//    ): MainViewModelFactory {
//        return MainViewModelFactory(
//            getUserNameUseCase = getUserNameUseCase,
//            saveUserNameUseCase = saveUserNameUseCase)
//    }

}