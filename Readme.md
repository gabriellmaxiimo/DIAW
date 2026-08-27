# ☁️ ApiClima

Um projeto de API REST simples desenvolvido em Java com **Spring Boot** para consulta de temperaturas.

🌐 Este projeto consumi a API:
https://open-meteo.com

## 🚀 Funcionalidades e Endpoints

O projeto possui um `Controller` configurado com os seguintes endpoints:

*   **`GET /temperatura`**
    Retorna a temperatura de Belo Horizonte (BH).
    *Exemplo de uso:* `http://localhost:8080/temperatura`

*   **`GET /temperatura/{cidade}`**
    Retorna a temperatura da cidade informada no caminho da URL.
    *Exemplo de uso:* `http://localhost:8080/temperatura/Contagem`

## 🛠️ Tecnologias Utilizadas

*   Java
*   Spring Boot
*   Maven 

## ⚙️ Como executar o projeto localmente

1. Certifique-se de ter o **Java/JDK** instalado na sua máquina.
2. Navegue até a pasta raiz do projeto (onde estão os arquivos `pom.xml` e `mvnw`).
3. Execute o comando de inicialização do Spring Boot:

   **No Windows:**
   ```bash
   .\mvnw.cmd spring-boot:run
   ```

   **No Linux / macOS:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. Aguarde a aplicação iniciar. O Spring Boot rodará por padrão na porta **8080**.
5. Acesse os endpoints pelo seu navegador, Postman ou Insomnia.

## 👨‍💻 Autores
Gabriel Mota Valério.
Gabriel Máximo de Castro.
