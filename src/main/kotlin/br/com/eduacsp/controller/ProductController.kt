package br.com.eduacsp.controller

import br.com.eduacsp.model.Product
import br.com.eduacsp.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val service: ProductService) {

    @GetMapping("/v1/produto/{idProduto}/detalhes")
    fun getProduct(@PathVariable idProduto: String): ResponseEntity<Product> {
        val product = service.getProductDetails(idProduto)
        return if (product != null) ResponseEntity.ok(product) else ResponseEntity.notFound().build()
    }
}
