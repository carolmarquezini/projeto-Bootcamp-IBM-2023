# projeto-Bootcamp-IBM-2023

## Visão geral

Este projeto diz respeito a uma API REST que utiliza os **métodos HTTP** POST, GET e DELETE para receber jogadores e organizar em times com base na primeira letra de seus sobrenomes, garantindo que não haja jogadores com sobrenomes idênticos na mesma equipe. Adicionalmente, jogadores sem sobrenome serão excluídos.

O objetivo principal do CRUD nesta aplicação é adicionar jogadores, buscar por jogadores (e, por consequência, as equipes formadas) e a exclusão de jogadores.

---

## Documentação 📄

- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Regras de Negócios](#regras-de-negócios)
- [Endpoints](#endpoints)
  - [Saída](#saída)
- [Como executar o projeto](#como-executar-o-projeto)
- [Autora](#autora)

---
 
## Tecnologias utilizadas
- [x] Spring Boot
- [x] Java 17
---

## Regras de Negócios
- [x] Cada equipe deve ser formada por jogadores cujo sobrenome comece com a mesma letra.
- [x] Não pode haver mais de um jogador com o mesmo sobrenome começando com a mesma letra em um time.
- [x] Não são considerados jogadores sem sobrenome (exemplo: `Carol`).

O objetivo é criar o maior número possível de times diferentes, seguindo as regras acima.

---

## Endpoints

Nesta API Rest foi utilizado os métodos HTTP para realizar as rotas da aplicação por meio do CRUD (Create, Read, Update, Delete).


| Método HTTP | Endpoint               | Descrição                                  | 
| ----------- | -----------------------| -------------------------------------------|
| GET         | `/times`               | retorna os times formados até o momento, seguindo as regras de organização por sobrenome. Ele fornece uma representação dos times com os jogadores já adicionados.      |
| POST        | `/jogador`             | Adicionar jogadores à liga. O corpo da solicitação deve incluir o nome completo do jogador no formato "Nome Sobrenome".                |  
| DELETE      | `/jogador/all`         | Para começar a montar novos times ou reiniciar o processo de organização, utilize este endpoint para excluir todos os jogadores da base de dados.          |

### Saída 

Ao realizar o **GET** com a rota `localhost:8080/times`, a saída deve ser um body com nome do time e dos jogadores, conforme abaixo:              
```java
{
    "Time S": [ "Marta Silva" ],

    "Time S1": [ "Thiago Silva" ],

    "Time S2": [ "Carol Silva" ],

    "Time M": [ "Kylian Mbappé", "Lionel Messi", "Luka Modric" ]
}

```

---

## Como Executar o Projeto
**1.** Clone o repositório do GitHub em sua máquina local:

``` 
git clone https://github.com/seu-usuario/projeto-bootcamp-ibm-2023.git
``` 

**2.** Abra o projeto em sua IDE (por exemplo, IntelliJ IDEA).

**3.** Execute o projeto a partir da classe principal `OrganizadorDeTimesApplication`.

**A API estará acessível em http://localhost:8080.**

---

## Autora

**[Carolaine Marquezini](https://www.linkedin.com/in/carolainemarquezini/)**
      
<a href="https://www.linkedin.com/in/carolainemarquezini" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

