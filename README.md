# The Omen - Videoclub Spring Backend

This project is a learning exercise focused on building a RESTful API with Spring Boot, following the MVC pattern and implementing a full CRUD against a MySQL database.

## Purpose

The goal of this project is to practice:
- Spring Boot MVC architecture (Model, View, Controller, Service, Repository)
- Database connectivity via Spring Data JPA
- Full CRUD REST endpoints tested with Postman
- React frontend consuming the Read endpoint

## Tech Stack

- Java 25
- Spring Boot 4.0.5
- Spring Data JPA
- MySQL 8.4.8
- Maven
- React (frontend)

## Project Structure
```
src/main/java/com/theomen/the_omen/
├── controller/
│   └── MovieController.java
├── model/
│   └── Movie.java
├── repository/
│   └── MovieRepository.java
├── service/
│   ├── MovieService.java
│   └── MovieServiceImpl.java
├── view/
│   └── MovieView.java
└── TheOmenApplication.java
src/main/resources/
└── application.properties

## Database Setup
```sql
CREATE DATABASE the_omen;
```
JPA creates and updates the `movies` table automatically via `ddl-auto=update`.

## Endpoints

| Method | URL | Description |
|---|---|---|
| POST | /movies | Create a movie |
| GET | /movies | Get all movies |
| GET | /movies/{id} | Get movie by ID |
| PUT | /movies/{id} | Update a movie |
| DELETE | /movies/{id} | Delete a movie |

## Notes

This is a purely educational project built as a classroom exercise.

