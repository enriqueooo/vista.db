package com.example.crm.service

import com.example.crm.dto.UserView
import com.example.crm.mapper.UserMapper
import com.example.crm.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUserViewById(id: Long, role: String): UserView {
        val user = userRepository.findById(id).orElseThrow { Exception("User not found") }
        return UserMapper.toView(user, role)
    }
}
