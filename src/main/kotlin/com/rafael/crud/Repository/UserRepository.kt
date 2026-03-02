package com.rafael.crud.Repository

import com.rafael.crud.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String>
