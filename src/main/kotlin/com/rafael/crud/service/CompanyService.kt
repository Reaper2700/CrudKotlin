package com.rafael.crud.service
import com.rafael.crud.Repository.CompanyRepository
import com.rafael.crud.entity.Company
import org.springframework.stereotype.Service


@Service
class CompanyService(
    private val respository: CompanyRepository
) {
    fun create(company: Company): Company{
        if(respository.existsByCnpj(company.cnpj)){
            throw RuntimeException("Company exists")
        }

        return respository.save(company)
    }
}