# Book Management API

A simple Spring Boot application that manages books using an in-memory H2 database. It supports basic CRUD operations and includes auditing and security features.

- RESTful CRUD API for books
- In-memory H2 database with web console
- Spring Data JPA for data access
- Auditing (`createdBy`, `createdDate`, etc.)
- Spring Security with in-memory users
- Basic authentication  
  
Two users are preconfigured using in-memory authentication:

| Username | Password | 
|----------|----------| 
| admin    | admin    | 
| user     | user     | 

> All endpoints require basic authentication.


| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/api/books`       | List all books      |
| POST   | `/api/books`       | Create a new book   |
| DELETE | `/api/books/{id}`  | Delete a book by ID |




