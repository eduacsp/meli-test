package br.com.eduacsp.integration

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `should return product details via new endpoint`() {
        mockMvc.get("/v1/produto/1/detalhes")
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id") { value("1") }
                jsonPath("$.name") { value("Dell Inspiron 15 Laptop") }
                jsonPath("$.description") { value("Laptop with Intel i7, 16GB RAM, 512GB SSD") }
                jsonPath("$.price") { value(4899.90) }
                jsonPath("$.stock") { value(12) }
                jsonPath("$.category") { value("Computers") }
            }
    }

    @Test
    fun `should return details of another valid product`() {
        mockMvc.get("/v1/produto/2/detalhes")
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id") { value("2") }
                jsonPath("$.name") { value("Samsung Galaxy S24") }
                jsonPath("$.price") { value(3999.00) }
                jsonPath("$.category") { value("Smartphones") }
            }
    }

    @Test
    fun `should return 404 for non-existing product`() {
        mockMvc.get("/v1/produto/999/detalhes")
            .andExpect {
                status { isNotFound() }
            }
    }

    @Test
    fun `should return 404 for invalid id format`() {
        mockMvc.get("/v1/produto/01/detalhes")
            .andExpect {
                status { isNotFound() }
            }
    }

    @Test
    fun `should return json structure with all expected keys`() {
        mockMvc.get("/v1/produto/3/detalhes")
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.id").exists()
                jsonPath("$.name").exists()
                jsonPath("$.description").exists()
                jsonPath("$.price").exists()
                jsonPath("$.stock").exists()
                jsonPath("$.category").exists()
            }
    }
}
