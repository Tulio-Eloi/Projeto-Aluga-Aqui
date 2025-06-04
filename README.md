# 🚗 Documentação Front-End

## ✅ Pré-requisitos

Antes de iniciar, você precisa ter instalado em sua máquina:

- [Node.js](https://nodejs.org/) (versão LTS recomendada)
- [NPM](https://www.npmjs.com/) (gerenciador de pacotes que já vem com o Node)

## 📦 Instalação

1. No terminal, dentro da pasta front-end do projeto, execute:

```
npm install
```

2. Na mesma pasta, instale as dependências do projeto:
```
npm install react-router-dom
npm install swiper
```

3. Inicie o projeto:
```
npm run dev
```

Após isso, o site estará acessível em http://localhost:5173/

# 🚗 Documentação Back-End

# AlugaAqui - Projeto Full Stack

Este projeto utiliza **Java com Spring Boot** no back end e **React com Vite** no front end. Abaixo estão os passos necessários para instalar e rodar a aplicação.

---

## ✅ Pré-requisitos

### 🔧 Back-end (Java + Spring Boot)
- **Java Development Kit (JDK) 17 ou superior**
  - Baixe e instale o JDK: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
  - Verifique a instalação com:
    ```bash
    java -version
    ```
- **Docker e Docker Compose**
  - Instalação do Docker: https://docs.docker.com/get-docker/
  - Verifique se o Docker está rodando com:
    ```bash
    docker -v
    docker compose version
    ```

### 🌐 Front-end (React + Vite)
- **Node.js (versão 18 ou superior)**
  - Instale: https://nodejs.org/
  - Verifique com:
    ```bash
    node -v
    npm -v
    ```

---

## 🚀 Como rodar o projeto

### 1. Suba o container com Docker
```bash
docker compose up

