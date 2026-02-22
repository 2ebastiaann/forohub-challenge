# ForoHub 🖥️
<img width="720" height="480" alt="image" src="https://github.com/user-attachments/assets/4d3305f9-2762-4bce-ba7a-af8051d47b1a" />


---

## Insignias
![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)
![Java Version](https://img.shields.io/badge/java-17-orange)

---

## Índice
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Estado del Proyecto](#estado-del-proyecto)
3. [Demostración de Funciones](#demostración-de-funciones)
4. [Acceso al Proyecto](#acceso-al-proyecto)
5. [Tecnologías Utilizadas](#tecnologías-utilizadas)
6. [Personas Desarrolladoras](#personas-desarrolladoras-del-proyecto)

---

## Descripción del Proyecto
ForoHub es una API REST desarrollada en **Spring Boot**, que permite crear, listar, actualizar y eliminar tópicos.  
El proyecto incluye autenticación JWT, roles de usuario y documentación de la API con **Swagger**.  
Es un proyecto realizado como ejercicio del curso, con intención de retomarlo y expandirlo en el futuro.

---

## Estado del Proyecto
- [x] Funcionalidad básica de registro y login con JWT  
- [x] CRUD completo de tópicos  
- [x] Endpoints protegidos con autenticación cuando aplica  
- [x] Documentación con Swagger  
- [ ] Mejoras futuras: UI frontend, tests unitarios, validaciones avanzadas  

---

## Demostración de Funciones
1. **Registrar un usuario**  
2. **Login con JWT**  
3. **Crear, listar, actualizar y eliminar tópicos**  
4. **Ver tópicos públicamente**  

### Ejemplo de POST /topicos
<img width="1095" height="336" alt="image" src="https://github.com/user-attachments/assets/121bb750-11c4-4642-96e3-2bcbf30b5d26" />


### Ejemplo de GET /topicos
<img width="772" height="789" alt="image" src="https://github.com/user-attachments/assets/20850c50-14d1-4548-ae47-ba89a37f019f" />


---

## Acceso al Proyecto
1. Clonar el repositorio:
```bash
git clone https://github.com/2ebastiaann/forohub-challenge.git
```
Configurar base de datos MySQL y credenciales en application.properties.

Ejecutar la aplicación:
mvn spring-boot:run

Acceder a los endpoints con Postman o tu cliente HTTP favorito.

La documentación Swagger estará disponible en:
http://localhost:8081/swagger-ui/index.html


##Tecnologías Utilizadas

Java 17
Spring Boot
Spring Security (JWT)
Spring Data JPA
MySQL
Swagger / Springfox
Maven
Lombok


##Personas Desarrolladoras del Proyecto

Sebastián Carmona
