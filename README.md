
<h1 align="center">  Projeto Quiz Online </h1>

<p align="center">
  MJV School - Java
</p>

<img alt="GitHub Language Count" src="https://img.shields.io/github/languages/count/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Top Language" src="https://img.shields.io/github/languages/top/rodrigoxaviersantos/quiz-online" /><img alt="" src="https://img.shields.io/github/repo-size/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Issues" src="https://img.shields.io/github/issues/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Closed Issues" src="https://img.shields.io/github/issues-closed/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Closed Pull Requests" src="https://img.shields.io/github/issues-pr-closed/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Contributors" src="https://img.shields.io/github/contributors/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Last Commit" src="https://img.shields.io/github/last-commit/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Commit Activity (Week)" src="https://img.shields.io/github/commit-activity/w/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Commit Activity (Month)" src="https://img.shields.io/github/commit-activity/m/rodrigoxaviersantos/quiz-online" /><img alt="GitHub Commit Activity (Year)" src="https://img.shields.io/github/commit-activity/y/rodrigoxaviersantos/quiz-online" /><img alt="Github License" src="https://img.shields.io/github/license/rodrigoxaviersantos/quiz-online" />

Este é um projeto de QUIZ ONLINE desenvolvido em Java Spring Boot, utilizando MySQL como banco de dados e Swagger para documentação da API.

### Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Java Development Kit (JDK) 8 ou superior

- Maven

- MySQL Server

- IDE de sua preferência (recomendado: IntelliJ IDEA, Eclipse)

### Configuração do Banco de Dados

1. Certifique-se de ter o MySQL Server instalado e em execução em sua máquina.
2. No MySQL Workbench ou em um terminal, crie um banco de dados com o nome quizonline.

```sql
CREATE DATABASE quizonline;
```
1. No arquivo application.properties do seu projeto Spring Boot, configure as propriedades do banco de dados:

```sql
spring.datasource.url=jdbc:mysql://localhost:3306/quizonline
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

Substitua seu_usuario e sua_senha pelas credenciais do seu MySQL.

### Executando o Projeto

1. Clone este repositório para o seu ambiente local:

```bash
git clone https://github.com/seu_usuario/seu_repositorio.git

```
1. Abra o projeto em sua IDE.

2. Certifique-se de que todas as dependências do Maven foram baixadas.

3. Execute a aplicação Spring Boot. Isso pode ser feito executando o método main da classe principal QuizOnlineApplication.

4. Após a aplicação inicializar com sucesso, você pode acessar a documentação da API Swagger em http://localhost:8080/swagger-ui.html.


### Uso da API

Consulte a documentação da API Swagger para obter informações sobre os endpoints disponíveis e como utilizá-los para interagir com o QUIZ ONLINE.

### Contribuindo

Contribuições são bem-vindas! Se você quiser melhorar este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Licença

Este projeto está licenciado sob a MIT License.

