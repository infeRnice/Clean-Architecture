package com.example.myapplication.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.data.repository.UserRepositoryImpl
import com.example.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.domain.models.SaveUserNameParam
import com.example.domain.usecases.GetUserNameUseCase
import com.example.domain.usecases.SaveUserNameUseCase

class MainViewModel(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModel() {

    //LiveData for keep and onserve UserName in UI
    private val _userName = MutableLiveData<String>()
    val userName : LiveData<String> = _userName

    fun getUserName() {
        val result = getUserNameUseCase.execute()
        _userName.value = "${result.firstName} ${result.lastName}"
    }

    fun saveUserName(inputText: String) {
        val param = SaveUserNameParam(name = inputText)
        saveUserNameUseCase.execute(param)
        //add logic later
    }

    init {
        Log.e("AAA", "VM Created")
    }

    override fun onCleared() {
        Log.e("AAA", "VM Cleared")
        super.onCleared()

    }

}