package br.com.eduacsp.service

import br.com.eduacsp.model.Product
import br.com.eduacsp.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val repository: ProductRepository) {
    fun getProductDetails(id: String): Product? = repository.findById(id)
}
