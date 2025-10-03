# Product Service

Um serviço backend simples desenvolvido com **Kotlin + Java 21 + Spring Boot 3.5.5**.  
Ele utiliza um arquivo JSON como banco de dados simulado para retornar os detalhes de produtos (sem necessidade de banco relacional ou NoSQL).

---

## 🚀 Tecnologias e Motivos da Escolha

- **Kotlin**  
  Escolhido por sua sintaxe concisa, segurança contra nulos (*null safety*) e forte interoperabilidade com Java.  
  Permite desenvolvimento mais rápido e com menos erros em comparação ao uso exclusivo de Java.

- **Java 21**  
  Oferece suporte de longo prazo (LTS), recursos modernos da linguagem e otimizações da JVM.  

- **Spring Boot 3.5.5**  
  Simplifica a criação de serviços prontos para produção com mínima configuração.  
  Oferece suporte nativo para REST APIs, injeção de dependências e testes.  
  A maioria das dependências vem diretamente do ecossistema Spring Boot, reduzindo complexidade.

- **Gradle Kotlin DSL**  
  Fornece uma forma moderna e *type-safe* de configurar o sistema de build.  
  Melhora a manutenção e a legibilidade em comparação com scripts Gradle baseados em Groovy.

- **Jackson (JSON parsing)**  
  Utilizado para leitura dos dados de produtos diretamente do arquivo JSON.  
  É altamente eficiente e bem integrado ao Spring Boot, tornando a serialização e desserialização JSON simples e transparente.

---
