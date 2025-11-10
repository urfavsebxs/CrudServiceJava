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
- **Endpoint:** `GET /api/products`
- **Origen:** `https://dummyjson.com/products`
- **Retorna:** `id`, `title`, `price`, `category`, `rating`.

---

### 2️⃣ Obtener producto por ID
- **Endpoint:** `GET /api/products/{id}`
- **Origen:** `https://dummyjson.com/products/{id}`
- **Error:** Retorna `404` con el mensaje `"Producto no encontrado"` si el ID no existe.

---

### 3️⃣ Filtrar productos por categoría
- **Endpoint:** `GET /api/products/category/{category}`
- **Origen:** `https://dummyjson.com/products/category/{category}`
- **Retorna:** Lista filtrada con `id`, `title`, `price`, `category`, `rating`.

---

### 4️⃣ Simular creación de producto
- **Endpoint:** `POST /api/products`
- **Destino:** `https://dummyjson.com/products/add`
- **Función:** Simula la creación de un producto y devuelve la respuesta del servicio externo.

---

## 🧠 Evaluación técnica
Se evaluarán los siguientes aspectos:

| Criterio | Descripción |
|-----------|-------------|
| ✅ **Configuración de WebClient** | Uso correcto y reactivo para consumo de APIs externas. |
| ⚡ **Manejo de errores HTTP** | Implementación de `onStatus`, control de respuestas 4xx/5xx. |
| 🧩 **Arquitectura limpia** | Separación clara en capas: Controller, Service, Repository. |
| 📦 **Modelado de datos** | Uso correcto de DTOs y buenas prácticas de nombrado. |
| 📘 **Documentación** | README completo, conciso y profesional. |

---

## 🏁 Entregable esperado

### 🚀 Ejecución
```bash
mvn spring-boot:run
```

### 🌐 API local
```
http://localhost:8080/api/products
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
│         Repository         │
│  Consume la API externa    │
│  (DummyJSON) con WebClient │
└────────────────────────────┘
```

---

## ✨ Autor

**Desarrollador Backend Java Junior**
> Proyecto desarrollado como práctica profesional para fortalecer habilidades en **consumo de APIs**, **arquitectura limpia** y **desarrollo reactivo con Spring Boot**.

---