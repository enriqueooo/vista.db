package com.example.crm.mapper

import com.example.crm.dto.UserView
import com.example.crm.model.User
import org.springframework.boot.autoconfigure.security.SecurityProperties

object UserMapper {
    fun toView(user: SecurityProperties.User, role: String): UserView {
        return UserView(
            id = user.id,
            name = user.name,
            email = user.email,
            role = role
        )
    }
}
