# 🧩 Reto Técnico – Product API Gateway

![Java](https://img.shields.io/badge/Java-17-blue?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.x-brightgreen?logo=springboot&logoColor=white)
![WebFlux](https://img.shields.io/badge/WebFlux-Reactive-blueviolet?logo=spring&logoColor=white)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-yellow)

---

## 💼 Contexto
La empresa **TechRetail Solutions** busca modernizar su ecosistema interno mediante un servicio centralizado que gestione la información de productos proveniente de una fuente pública.

Actualmente, el equipo necesita una **API Gateway** que consuma datos de un proveedor externo y los exponga internamente con su propio formato y estructura.

Tu misión como **Desarrollador Backend Java Junior** es construir una **API REST** con **Spring Boot** que sirva como intermediario entre las aplicaciones internas y la API pública de [DummyJSON](https://dummyjson.com).

---

## 🎯 Objetivo
Diseñar e implementar un servicio backend capaz de:

- 🔄 Consumir información desde la API de DummyJSON.
- 🧩 Transformar y exponer los datos a través de endpoints REST locales.
- ⚙️ Aplicar buenas prácticas de arquitectura, manejo de errores y modularidad.

---

## ⚙️ Requerimientos técnicos

### 🧱 Dependencias obligatorias
- Spring Boot **3.5.x**
- Spring Reactive Web (**WebFlux**)
- Lombok
- Spring Boot DevTools

### 💻 Entorno de desarrollo
- **Lenguaje:** Java 17+
- **Gestor de dependencias:** Maven
- **IDE recomendado:** IntelliJ IDEA (Community o Ultimate)

---

## 📋 Requerimientos funcionales

### 1️⃣ Listar productos
- **Endpoint:** `GET /products`
- **Origen:** `https://dummyjson.com/products`
- **Retorna:** `title`, `price`.

---

### 2️⃣ Obtener producto por ID
- **Endpoint:** `GET /products/{id}`
- **Origen:** `https://dummyjson.com/products/{id}`
- **Error:** Retorna `404` con el mensaje `"Producto no encontrado"` si el ID no existe.

---

### 3️⃣ Filtrar productos por categoría
- **Endpoint:** `GET /products/category/{category}`
- **Origen:** `https://dummyjson.com/products/category/{category}`
- **Retorna:** Lista filtrada con `title`, `price`.


## 🧠 Evaluación técnica
Se evaluarán los siguientes aspectos:

| Criterio | Descripción |
|-----------|-------------|
| ✅ **Configuración de WebClient** | Uso correcto y reactivo para consumo de APIs externas. |
| ⚡ **Manejo de errores HTTP** |
| 🧩 **Arquitectura limpia** | Separación clara en capas: Controller, Service, Repository. |

---

## 🏁 Entregable esperado

### 🚀 Ejecución
```bash
mvn spring-boot:run
```

### 🌐 API local
```
http://localhost:8080/
```

### 📦 Estructura esperada
```
src/
 └── main/
     ├── java/com/techretail/productapi/
     │   ├── controller/
     │   ├── service/
     │   ├── client/
     │   └── model/
     └── resources/
         └── application.yml
```

---

## 🧱 Arquitectura del Proyecto

```
┌────────────────────────────┐
│        Controller          │
│  Recibe solicitudes HTTP   │
│  y delega a la capa lógica │
└────────────┬───────────────┘
             │
┌────────────▼───────────────┐
│          Service           │
│  Contiene la lógica de     │
│  negocio y validaciones.   │
└────────────┬───────────────┘
             │
┌────────────▼───────────────┐
│         Client         │
│  Consume la API externa    │
│  (DummyJSON) con WebClient │
└────────────────────────────┘
```

---

## ✨ Autor

**Desarrollado por Sebastian Parra - Desarrollador Backend Java Junior**
> Proyecto desarrollado como práctica profesional para fortalecer habilidades en **consumo de APIs**, **arquitectura limpia** y **desarrollo reactivo con Spring Boot**.

---
