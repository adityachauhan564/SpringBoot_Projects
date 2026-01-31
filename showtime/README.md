# 🎬 Showtime – Movie Ticket Booking System

**Showtime** is a backend **Spring Boot** application for booking movie tickets.  
It supports movie discovery, reviews, show management, ticket booking, and **Kafka-based notifications**.  
The project is built using **REST APIs**, **JPA/Hibernate**, and **Apache Kafka**, with **Swagger UI** for API documentation and testing.

---

## 🚀 Features

- 🔍 Search movie by title
- ⭐ Rate and review movies
- 🎭 Search top movies by genre
- 🏙️ Find shows running in a city
- 🎟️ Book tickets for a show
- 📩 Send notification to users on successful booking (Apache Kafka)

---

## 🛠️ Tech Stack

### Backend
- **Java 17 / 21**
- **Spring Boot 2.7.x**
- **Spring MVC**
- **Spring Data JPA (Hibernate)**
- **Spring Security (basic configuration)**

### Database
- **MySQL**
- **Hibernate ORM**

### Messaging & Streaming
- **Apache Kafka**
- **Zookeeper**
- **Spring Kafka**
- **Docker (Kafka & Zookeeper containers)**

### API Documentation & Tools
- **Swagger (Springfox 3.0.0)**
- **Postman**
- **Maven**

### Utilities
- **Lombok**
  - Reduces boilerplate code using annotations such as:
    - `@Getter`, `@Setter`
    - `@Builder`
    - `@NoArgsConstructor`
    - `@AllArgsConstructor`
    - `@Slf4j`

---

## 🧩 System Design Overview

### Core Entities
- **Movie**
- **Review**
- **Theater**
- **TheaterSeat**
- **Show**
- **ShowSeat**
- **User**
- **Ticket**

### Entity Relationships
- One Movie → Many Reviews
- One Movie → Many Shows
- One Theater → Many Seats
- One Show → Many Seats
- One User → Many Bookings

---

## 📡 Kafka Usage

Kafka is used to handle **asynchronous notifications** after ticket booking.

- **Topic:** `TICKET_BOOKED`
- **Producer:** Ticket Booking Service
- **Consumer:** Notification Service
- **Purpose:** Send booking confirmation notifications without blocking the main API flow

Kafka runs locally using **Docker containers**.

---

## 📖 API Documentation (Swagger)

Swagger UI is enabled for interactive API documentation and testing.

🔗 **Swagger URL:**
http://localhost:8080/swagger-ui/


Swagger groups APIs controller-wise:
- Movie Controller
- Review Controller
- Show Controller
- Theater Controller
- Ticket Controller
- User Controller

---

## 🔌 REST APIs (Sample)

### User APIs
- `POST /user/signup`
- `GET /user/{id}`

### Movie APIs
- `POST /movie/add`
- `GET /movie/{id}`
- `GET /movie/title?title=xyz`

### Review APIs
- `POST /review/add`

### Show APIs
- `POST /show/add`
- `GET /show/city?city=xyz`

### Ticket APIs
- `POST /ticket/book`
🧪 Testing APIs

Swagger UI

Postman collection (included in project root)

📌 Key Learning Outcomes

REST API design using Spring Boot

Entity relationship modeling using JPA

Kafka producer–consumer integration

Dockerized Kafka setup

Swagger API documentation

Real-world backend architecture  
