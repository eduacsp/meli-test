# Prompts - Product Service

Histórico dos comandos usados para a criação e evolução do projeto **Product Service**.

---

## 1. Criação inicial do projeto

> Gere um projeto backend usando kotlin, java 21, gradle, spring boot 3.5.5 para expor um endpoint de detalhes de um produto via GET. Esse endpoint receberá um parâmetro de idProduto e retornará um json com detalhes de um produto típico de lojas online. Não deverá existir um banco de dados relacional ou não relacional, mas pode sim um banco de dados via arquivo json no próprio projeto. A maioria das dependências do projeto devem ser do framework spring boot. O package básico do projeto deverá ser br.com.eduacsp. O nome das classes e métodos devem ser em inglês e valores monetários devem ser definidos como BigDecimal. Crie também testes unitários e integrados completos. Crie um README.md com um resumo da implementação.

---

## 2. Alteração do endpoint

> altere para que o endpoint do ProductController fique nesse padrão /v1/produto/ID_PRODUTO/detalhes, altere tanto o ProductController quanto os testes envolvidos nele

---

## 3. Geração do README.md completo

> me gere um README.md completo: # Product Service

---

## 4. Testes de integração mais completos

> inclua testes mais completos para esse caso:  
> *(código do `ProductControllerTest` original)*

---

## 5. Correção do erro de testes não encontrados

> No matching tests found in any candidate test task.  
> Requested tests:  
> Test pattern br.com.eduacsp.integration.ProductControllerTest in task :test  
> ...  
> Quer que eu te mande um build.gradle.kts já revisado incluindo o useJUnitPlatform() e outras boas práticas para testes em Kotlin com Spring Boot?

---

## 6. Testes de serviço mais completos

> crie testes mais completos nesse:  
> *(código do `ProductServiceTest` original)*

## 7. Criar o run.md

> crie um run.md com detalhamento para rodar esse projeto