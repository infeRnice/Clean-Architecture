package com.example.domain.usecases

import com.example.domain.models.UserName
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class GetUserNameUseCase @Inject constructor(val userRepository: UserRepository) {

    fun execute(): UserName {

        return userRepository.getName()
    }
}