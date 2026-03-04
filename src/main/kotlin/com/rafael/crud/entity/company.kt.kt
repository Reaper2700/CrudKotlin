package com.rafael.crud.entity
import jakarta.annotation.Nullable
import jakarta.persistence.*

@Entity
@Table( name = "\"Company\"")
class  Company(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String,

    val name: String,
    val cnpj: String,
    val segmentation: String,
    val status: String,
)