package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}