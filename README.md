# Exercício Spring Boot

> Uma API RESTful robusta construída com Spring Boot, focada em arquitetura escalável e tratamento de exceções.

[![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=flat-square&logo=spring)](https://spring.io/projects/spring-boot)

O projeto demonstra a implementação de um sistema de CRUD completo, utilizando as melhores práticas do ecossistema Java, incluindo persistência de dados e uma estrutura de pastas organizada por responsabilidades.

## Funcionalidades

- **CRUD Completo:** Gerenciamento total de recursos (Categorias).
- **Arquitetura em Camadas:** Separação clara entre Web, Service e Repository.
- **Tratamento de Erros:** Respostas HTTP padronizadas para exceções de negócio.
- **Seed de Dados:** Banco de dados populado automaticamente ao iniciar a aplicação para auxiliar nos testes.

## Demonstração

A API está online e pode ser testada através do link abaixo:

[https://exerciciospringboot.onrender.com/](https://exerciciospringboot.onrender.com/)

---

## Tecnologias

- **Java 17** & **Spring Boot 3**
- **Spring Data JPA** (Persistência)
- **H2 Database** (Ambiente de testes)
- **Maven** (Build Tool)

## Endpoints Principais

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Retorna a lista de todos os usuários |
| `GET` | `/users/{id}` | Busca um usuário específico pelo ID |
| `POST` | `/users` | Cadastra um novo usuário no sistema |
| `PUT` | `/users/{id}` | Atualiza os dados de um usuário existente |
| `DELETE` | `/users/{id}` | Remove um usuário |
