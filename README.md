# codeze
Projeto para o Zé delivery

## Api construida para cadastro de novos PVDs(Parceiros de vendas)

## Features
- [x] Criar um parceiro
- [x] Buscar parceiro pelo ID

## Ferramentas 
* java 12
* Intellj IDEA Community Edition
* Controle de versão Git 
* Github
* PostgreSQL 13
* pgAdmin 4 
* Postgis

Antes de iniciar a aplicação, deve se criar um banco de dado como ``zedelivery`` e adicionar a extensão postgis

Para executar o projeto, basta importar para Intellj e clicar na opção run 

Após executar os passos acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto: 

`` http://localhost:8080/api/v1/partners ``

# REST API
  A API REST para o aplicativo do desafio. 
 
 ## Post
 - [x] Criando um parceiro. 
  ### Request
  `POST /api/v1/partners`
  ``` javascript 
   {
        "id": 1, 
        "tradingName": "Adega da Cerveja - Pinheiros",
        "ownerName": "Zé da Silva",
        "document": "1432132123891/0001",
        "coverageArea": { 
          "type": "MultiPolygon", 
          "coordinates": [
            [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
            [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
          ]
        },
        "address": { 
          "type": "Point",
          "coordinates": [-46.57421, -21.785741]
        }
    } 
  ```
  ### Response
  
  `HTTP/1.1 201 Created`
  
  
  ## Get
  Buscando um parceiro pelo id.
  ### Request
  `GET /api/v1/partners/id`
  
  ### Response
  ```javascript 
   {
        "id": 1, 
        "tradingName": "Adega da Cerveja - Pinheiros",
        "ownerName": "Zé da Silva",
        "document": "1432132123891/0001",
        "coverageArea": { 
          "type": "MultiPolygon", 
          "coordinates": [
            [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
            [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
          ]
        },
        "address": { 
          "type": "Point",
          "coordinates": [-46.57421, -21.785741]
        }
    }
  ```
  
  Buscando um parceiro pelo id que não existe.
   ### Request
  `GET /api/v1/partners/id`
  
   ### Response
   
   ```
    {
    "data": "2021-07-28T23:01:07.1108497",
    "message": "No partner found with this id",
    "exception": "br.com.desafioze.zecode.domain.exception.PartnerNotFoundException: No partner found with this id"
    }
   ```
   

  
