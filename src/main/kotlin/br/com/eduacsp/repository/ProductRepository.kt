package br.com.eduacsp.repository

import br.com.eduacsp.model.Product
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class ProductRepository {

    private val products: List<Product>

    init {
        val mapper = jacksonObjectMapper()
        val file = File("src/main/resources/source/products.json")
        products = mapper.readValue(file)
    }

    fun findById(id: String): Product? = products.find { it.id == id }
}