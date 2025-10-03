package br.com.eduacsp.service

import br.com.eduacsp.repository.ProductRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class ProductServiceTest {

    private val repository = ProductRepository()
    private val service = ProductService(repository)

    @Test
    fun `should return existing product with all attributes`() {
        val product = service.getProductDetails("1")

        assertNotNull(product)
        assertEquals("1", product?.id)
        assertEquals("Dell Inspiron 15 Laptop", product?.name)
        assertEquals("Laptop with Intel i7, 16GB RAM, 512GB SSD", product?.description)
        assertEquals(BigDecimal("4899.90"), product?.price)
        assertEquals(12, product?.stock)
        assertEquals("Computers", product?.category)
    }

    @Test
    fun `should return another valid product`() {
        val product = service.getProductDetails("2")

        assertNotNull(product)
        assertEquals("2", product?.id)
        assertEquals("Samsung Galaxy S24", product?.name)
        assertEquals(BigDecimal("3999.00"), product?.price)
        assertEquals("Smartphones", product?.category)
    }

    @Test
    fun `should return null for non-existing product`() {
        val product = service.getProductDetails("999")
        assertNull(product)
    }

    @Test
    fun `should correctly handle decimal prices`() {
        val product = service.getProductDetails("3")

        assertNotNull(product)
        assertEquals(BigDecimal("2299.00"), product?.price) // ensures two decimal places
    }

    @Test
    fun `should not modify repository data when fetching`() {
        val product1 = service.getProductDetails("1")
        val product2 = service.getProductDetails("1")

        assertNotNull(product1)
        assertNotNull(product2)
        assertEquals(product1, product2) // ensure consistency
    }
}
