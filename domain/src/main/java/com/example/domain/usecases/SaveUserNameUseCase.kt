package com.example.domain.usecases

import com.example.domain.models.SaveUserNameParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class SaveUserNameUseCase @Inject constructor(val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam) : Boolean {
        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }
}