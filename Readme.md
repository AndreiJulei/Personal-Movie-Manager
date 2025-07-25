# Personal Movie Manager 🎬

A Spring Boot application for managing your personal movie collection. Keep track of movies you've watched, want to watch, and maintain your personal ratings and notes.

## Features

- 🔐 Secure authentication using Spring Security
- 📝 CRUD operations for movies
- 🎯 Track movie viewing status (Watched, Want to Watch, In Progress, Rewatch)
- ⭐ Personal rating system (1-10)
- 📋 Add personal notes to movies
- 📊 H2 database for data persistence
- 🔍 Filter and sort movies by various criteria

## Tech Stack

- Java 17
- Spring Boot 3.2.5
- Spring Security
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository:
```sh
git clone https://github.com/yourusername/personal-movie-manager.git
```

2. Navigate to the project directory:
```sh
cd personal-movie-manager
```

3. Run the application:
```sh
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

### Default Credentials

- Username: `user`
- Password: `password`

## API Endpoints

### Movies

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/movies` | Get all movies (paginated) |
| GET | `/api/movies/{id}` | Get movie by ID |
| POST | `/api/movies` | Create new movie |
| PUT | `/api/movies/{id}` | Update movie |
| PATCH | `/api/movies/{id}/rating` | Update movie rating |
| DELETE | `/api/movies/{id}` | Delete movie |

### Database Console

The H2 database console is available at `http://localhost:8080/h2-console` when running in development mode.
