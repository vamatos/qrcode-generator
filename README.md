# QR Code Generator

Este projeto é uma aplicação Java Spring Boot para geração de QR Codes, com armazenamento dos códigos gerados em um bucket Amazon S3. A aplicação é containerizada usando Docker para facilitar a implantação.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Amazon S3 SDK** 
- **Docker**

## Estrutura do Projeto

```
qrcode.generator/
├── src/
│   ├── main/
│   │   ├── java/br/com/vandre/qrcode/generator/
│   │   │   ├── Application.java
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── infrastructure/
│   │   │   ├── ports/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
├── pom.xml
├── Dockerfile
└── ...
```

## Como Executar a Aplicação

### Pré-requisitos
- Java 17 ou superior
- Maven 3.8+
- (Opcional) Docker

### Executando Localmente

1. **Clone o repositório:**
   ```sh
   git clone <url-do-repositorio>
   cd qrcode.generator
   ```
2. **Configure o `application.properties`:**
   Ajuste as configurações de acesso ao S3 e outras propriedades necessárias em `src/main/resources/application.properties`.
3. **Compile e execute:**
   ```sh
   ./mvnw spring-boot:run
   ```
   Ou, para Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

### Executando com Docker

1. **Build da imagem:**
   ```sh
   docker build -t qrcode-generator .
   ```
2. **Execute o container:**
   ```sh
   docker run -p 8080:8080 --env-file .env qrcode-generator
   ```
   (Configure variáveis de ambiente conforme necessário)

## Endpoints Principais

- `POST /api/qrcode` — Gera um QR Code a partir dos dados enviados no corpo da requisição.

```sh
./mvnw test
```
Ou, para Windows:
```cmd
mvnw.cmd test
```

