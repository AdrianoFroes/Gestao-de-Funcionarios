Sistema de Gestão de Funcionários
Visão do Produto
Sistema desenvolvido para gerenciamento de funcionários, permitindo cadastro, consulta, atualização e exclusão.

Perfil do Autor
Analista de Sistemas com foco em Produto e Desenvolvimento Backend.

Tecnologias
Java 17
Spring Boot
Spring Data JPA
H2
Maven

Funcionalidades
CRUD de Funcionários
Validações de dados
API REST
Backlog
Cadastro de funcionário
Listagem
Atualização
Exclusão

1️ - Visão do Produto (Product Vision)

Problema: Empresas têm dificuldade em controlar informações de funcionários, salários e cargos de forma organizada.

Solução: Um sistema web com API REST para cadastro, consulta e gestão de funcionários.

Usuários:

RH

Gestores

Administração

Valor entregue:

Centralização de dados

Facilidade de manutenção

Redução de erros manuais


2️ - Backlog do Produto (priorizado) Prioridade 

User Story Alta Cadastrar funcionário Alta 
Listar funcionários Alta
 Atualizar funcionário Alta 
 Excluir funcionário Média 
 Buscar funcionário por cargo Média Calcular folha salarial Baixa Exportar relatório
 
 3️ -  User Stories (modelo profissional)

US01 – Cadastrar Funcionário

Como analista de RH Quero cadastrar um funcionário Para manter seus dados organizados no sistema

Critérios de Aceitação:

Nome obrigatório

CPF único

Salário maior que zero

Cargo obrigatório

US02 – Listar Funcionários

Como gestor Quero listar todos os funcionários Para acompanhar a equipe cadastrada

US03 – Atualizar Funcionário

Como analista de RH Quero atualizar dados do funcionário Para manter informações corretas

US04 – Excluir Funcionário

Como administrador Quero excluir um funcionário Para remover registros inválidos

4️ - Arquitetura Técnica (lado Dev) Tecnologias

Java 17

Spring Boot

Spring Data JPA

Hibernate

BANCO H2

Maven

Git/GitHub

Estrutura de Pacotes com.novarota 
├── controller 
├── service 
├── repository 
├── model 
├── dto 
└── exception