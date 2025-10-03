# How to Run - Product Service

Este documento descreve como **construir**, **executar** e **testar** o projeto Product Service.

---

## 🛠 Pré-requisitos

- **Java 21** instalado  
  Verifique com:
  ```bash
  java -version

- Gradle (opcional, o wrapper já está incluído no projeto)
  Verifique com:
  ```bash
  gradle -v
  ```

## Clonar o projeto
  ```bash
  git clone https://github.com/seu-usuario/product-service.git
  cd product-service
  ```
  
---

## Executar a aplicação

- Use o Gradle Wrapper (não precisa ter Gradle instalado globalmente):
  ```bash
  ./gradlew bootRun
  ```
- A aplicação irá iniciar na porta configurada em application.properties:
  ```arduino
  http://localhost:8081
  ```

## Testando o endpoint

- O serviço expõe o endpoint:
  ```bash
    GET /v1/produto/{idProduto}/detalhes
  ```

- Exemplo de request:
  ```bash
    curl "http://localhost:8081/v1/produto/1/detalhes"
  ```

- Exemplo de resposta:
  ```json
    {
        "id": "1",
        "name": "Dell Inspiron 15 Laptop",
        "description": "Laptop with Intel i7, 16GB RAM, 512GB SSD",
        "price": 4899.90,
        "stock": 12,
        "category": "Computers"
    }
  ```
- Se o produto não for encontrado:
  ```http
    404 Not Found
  ```

## Executar os testes

- O projeto contém unit tests (ex.: ProductServiceTest) e integration tests (ex.: ProductControllerTest).
  ```bash
    ./gradlew test
  ```

- O relatório de testes ficará em:
  ```bash
    build/reports/tests/test/index.html
  ```

- Abra no navegador para ver detalhes.

## Build do projeto

- Para gerar o JAR executável:
  ```bash
    ./gradlew clean build
  ```

- O arquivo final estará em:
  ```bash
    build/libs/product-service-0.0.1-SNAPSHOT.jar
  ```
- Execute-o com:
  ```bash
    java -jar build/libs/product-service-0.0.1-SNAPSHOT.jar
  ```






