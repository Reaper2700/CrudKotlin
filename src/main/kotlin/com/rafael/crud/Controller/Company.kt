package com.rafael.crud.Controller
import com.rafael.crud.Repository.CompanyRepository
import com.rafael.crud.entity.Company
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/company")

class CompanyController(
    private val repository: CompanyRepository
){

    @PostMapping
    fun create(@RequestBody company: Company): ResponseEntity<Company> {
        val saved = repository.save(company)
        return ResponseEntity.status(HttpStatus.CREATED).body(saved)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Company>>{
        return ResponseEntity.ok(repository.findAll())
    }
}