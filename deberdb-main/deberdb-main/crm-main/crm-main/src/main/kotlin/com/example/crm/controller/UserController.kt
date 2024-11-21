package com.example.crm.controller

import com.example.crm.dto.UserView
import com.example.crm.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping("/{userId}")
    fun getUser(
        @PathVariable userId: Long,
        @RequestParam("role") role: String
    ): ResponseEntity<UserView> {
        val userView = userService.getUserViewById(userId, role)
        return ResponseEntity.ok(userView)
    }
}
