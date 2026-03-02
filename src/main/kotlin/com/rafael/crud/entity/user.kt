package com.rafael.crud.entity
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "\"User\"")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String
)