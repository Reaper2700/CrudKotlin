package com.rafael.crud.Controller
import com.rafael.crud.Repository.UserRepository
import com.rafael.crud.entity.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")

class UserControles(
    private val repository: UserRepository
){

    @PostMapping
    fun create(@RequestBody user: User): User {
        return repository.save(user
        )
    }

    @GetMapping
    fun findAll(): List<User> {
        return repository.findAll()
    }
}