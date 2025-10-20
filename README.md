# Meu Primeiro Projeto Spring Boot ☕🚀

O **Spring Boot** é um dos frameworks Java mais populares para criação de aplicações modernas e produtivas. Ele simplifica o desenvolvimento de aplicações **web**, **APIs REST**, **microservices** e muito mais, eliminando grande parte da configuração manual exigida pelo Spring tradicional.  

Neste projeto, criamos um sistema simples de **autenticação de usuários** e **gerenciamento de produtos**, explorando na prática conceitos como **injeção de dependência**, **arquitetura em camadas** e **persistência de dados**.

---

## 🧭 Índice

- [O que é o Spring Boot](#o-que-é-o-spring-boot)  
- [Principais características](#principais-características)  
- [Diferenças importantes](#diferenças-importantes)  
- [Segurança com JWT](#Segurança-com-JWT)
- [Banco de dados (PostgreSQL)](#Banco-de-dados-(PostgreSQL))   
- [Endpoints REST](#endpoints-rest)  
- [Dependências principais](#dependências-principais)  
- [Como executar o projeto](#como-executar-o-projeto)  
- [Código desacoplado e testável](#código-desacoplado-e-testável)  
- [Aplicações modernas](#aplicações-modernas)  
- [Conclusão](#conclusão)  
- [Autor](#autor)

---

## ☘️ O que é o Spring Boot

O **Spring Boot** é uma ferramenta que facilita a criação de aplicações Spring autônomas e prontas para produção, sem a necessidade de configurações complexas.  
Ele se baseia no ecossistema Spring e adiciona recursos como **autoconfiguração**, **servidor embutido** e **starter packs**, permitindo iniciar um projeto completo em minutos.

---

## ⚙️ Principais características

### 🔁 Inversão de Controle (IoC)
O Spring gerencia a criação e o ciclo de vida dos objetos, em vez do programador. Assim, o framework “controla” as dependências da aplicação, promovendo baixo acoplamento.

### 💉 Injeção de Dependência (DI)
Em vez de criar objetos manualmente dentro das classes, o Spring **injeta automaticamente** as dependências necessárias.  
Isso facilita testes, manutenção e reutilização do código.

### 🧩 Programação Orientada a Aspectos (AOP)
Permite separar comportamentos transversais (como logs, segurança ou transações) da lógica principal da aplicação. Assim, o código fica mais limpo e organizado.

---

## 🔍 Diferenças importantes

| Recurso | Descrição |
|----------|------------|
| **Autoconfiguração** | O Spring Boot detecta automaticamente as dependências e configura o projeto. |
| **Servidor embutido** | Não é necessário instalar um servidor externo — o Tomcat é integrado por padrão. |
| **Starter Packs** | Conjuntos de dependências prontos (como `spring-boot-starter-web` ou `spring-boot-starter-data-jpa`) que simplificam a configuração. |

---


---

## 🔐 Segurança com JWT

O projeto utiliza o **Spring Security** junto com **JWT (JSON Web Token)** para proteger os endpoints.  

### Como funciona:
1. O usuário faz login enviando suas credenciais.  
2. O sistema valida os dados e gera um **token JWT**.  
3. Esse token é usado nas requisições seguintes como autenticação (via header `Authorization: Bearer <token>`).  

Isso garante que apenas usuários autenticados possam acessar as rotas protegidas.

---

## 🗄️ Banco de Dados: PostgreSQL

A aplicação utiliza o **PostgreSQL** como banco de dados principal, configurado no arquivo `application.properties`.  

O acesso é feito por meio do **Spring Data JPA**, que abstrai o uso do SQL e permite manipular entidades Java diretamente.

**Exemplo de configuração:**

  - spring.datasource.url=jdbc:postgresql://localhost:5432/meu_banco
  - spring.datasource.username=usuario
  - spring.datasource.password=senha
  - spring.jpa.hibernate.ddl-auto=update
  - spring.jpa.show-sql=true

## 🌐 Endpoints REST

| Método | Caminho | Descrição |
|---------|----------|-----------|
| `GET` | `/produtos` | Lista todos os produtos |
| `GET` | `/produtos/{id}` | Busca um produto pelo ID |
| `POST` | `/produtos` | Cadastra um novo produto |
| `PUT` | `/produtos/{id}` | Atualiza os dados de um produto existente |
| `DELETE` | `/produtos/{id}` | Remove um produto |
| `POST` | `/auth/login` | Autentica o usuário |

> Ajuste as rotas conforme o código real dos controllers caso os nomes/paths sejam diferentes.

---

## 🧰 Maven e dependências principais

As dependências estão definidas no arquivo **`pom.xml`** e incluem:

| Dependência | Função |
|-------------|--------|
| `spring-boot-starter-web` | Criação de APIs REST |
| `spring-boot-starter-data-jpa` | Integração com banco via JPA/Hibernate |
| `postgresql` | Driver do banco PostgreSQL |
| `spring-boot-devtools` | Reload automático em desenvolvimento |
| `spring-boot-starter-test` | Testes automatizados |
| `spring-boot-starter-security` | Autenticação e autorização com Spring Security |
| `jjwt-api`, `jjwt-impl`, `jjwt-jackson` | Geração e validação de tokens JWT |


---

## 🚀 Como executar o projeto

### 🔧 Pré-requisitos
- **Java 17+**  
- **Maven** (opcional se usar `./mvnw`)  
- (Opcional) **IntelliJ IDEA** ou **VS Code**

### ▶️ Passos para rodar

1. **Clonar o repositório**
   ```bash
   git clone https://github.com/H4ttiz/meu-primeiro-springboot.git
   cd meu-primeiro-springboot

2. **Compilar o projeto**
   ```bash
   ./mvnw clean install

3. **Executar**
   ```bash
   ./mvnw spring-boot:run
---

## 🧩 Código desacoplado e testável

O **Spring** promove **desacoplamento** entre as camadas (**Controller**, **Service** e **Repository**).  
Isso facilita:

- ✅ Testes unitários e de integração  
- 🔧 Manutenção do código  
- 🔁 Substituição de componentes sem impacto no restante da aplicação  

Além disso, o gerenciamento de dependências e o ciclo de vida dos *beans* são feitos automaticamente pelo **Spring IoC Container** (Inversion of Control).  
Isso significa que o próprio framework cria e gerencia os objetos necessários, permitindo um código mais limpo e modular.

---

## ☁️ Aplicações modernas

O mesmo modelo de projeto pode ser facilmente expandido para:

- 🧩 Aplicações monolíticas  
- ⚙️ Microservices  
- 🌍 APIs REST escaláveis  
- ☁️ Implantação em Cloud Computing (AWS, Azure, GCP)  

Graças à sua flexibilidade, o **Spring Boot** é usado tanto em pequenos projetos quanto em sistemas corporativos de larga escala.

---

## 🧠 Conclusão

O **Spring Boot** é uma base sólida para qualquer aplicação Java moderna.  
Ele oferece **simplicidade**, **produtividade** e **poder**, permitindo que o desenvolvedor se concentre na **lógica de negócio**, enquanto o framework cuida da **infraestrutura**.  

Com isso, é possível criar aplicações robustas, seguras e escaláveis com pouco esforço de configuração.

---

## 👨‍💻 Autor

<table>
  <tr>
    <td>
      <img width="80px" align="center" src="https://avatars.githubusercontent.com/H4ttiz"/>
    </td>
    <td align="left">
      <a href="https://github.com/H4ttiz">
        <span><b>Leonardo Bezerra da Silva</b></span>
      </a>
      <br>
      <span>Desenvolvedor Back-end</span>
    </td>
  </tr>
</table>
