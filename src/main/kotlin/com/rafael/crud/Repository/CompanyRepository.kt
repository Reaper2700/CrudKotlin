package com.rafael.crud.Repository

import com.rafael.crud.entity.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository: JpaRepository<Company, String>{
    fun existsByCnpj(cnpj: String): Boolean
}

