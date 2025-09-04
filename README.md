# Patas & Vida — Sistema de Clínica Veterinária

**Status do projeto:** Em desenvolvimento

## Tecnologias do curso
- Java (JDK)
- Swing (interface gráfica)
- JDBC (acesso a dados)
- MySQL (banco de dados)
- Git & GitHub (versionamento)

## Time de desenvolvedores
- Pedro (Dev)  

## Objetivo do software
Sistema desktop para cadastro e consulta de **Tutores**, **Pets** e **Agendamentos** em clínica veterinária, com autenticação de usuário.

## Funcionalidades (requisitos)
- Login com autenticação (hash SHA-256)
- Cadastro de Tutor (nome, CPF, contato, endereço, observação)
- Cadastro de Pet (nome, raça, peso, vacinação, controle de pragas, vermífugo)
- Cadastro de Agenda (nome do pet, data e horário da consulta)
- Listagem e consistência com o banco (JDBC + MySQL)
- Validações de campos (formato de data/hora, obrigatórios)

## Como executar
1. Configure o MySQL e crie o schema/tabelas (ver `/docs/sql/` se disponível).
2. Ajuste as credenciais no código (classe `ControleLogin` / propriedades).
3. Compile e execute a classe `TelaLogin` (ou `Main`) na sua IDE.

## Estrutura (exemplo)
src/
DAO/
Model/
Telas/
docs/
sql/

## Licença
Este projeto é acadêmico.
