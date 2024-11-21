package com.example.crm.controller

import com.example.crm.dto.LeadDTO
import com.example.crm.service.LeadService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController(private val leadService: LeadService) {
    @PostMapping
    fun createLead(@RequestBody dto: LeadDTO): ResponseEntity<LeadDTO> =
        ResponseEntity.ok(leadService.createLead(dto))
}
