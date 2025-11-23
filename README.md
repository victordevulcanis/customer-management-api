# Customer Management API

## Description
This is a simple REST API for managing customer information, including creating, reading, updating, and deleting customer records. It serves as a practical application to demonstrate core Spring Boot concepts and RESTful API development principles.

## Technologies Used
*   Java 17
*   Spring Boot 3.2.0
*   Maven
*   H2 Database (in-memory for development/testing)

## Getting Started
To run this project locally, follow these steps:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/victordevulcanis/customer-management-api.git
    cd customer-management-api
    ```
2.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```
3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

## API Endpoints
All endpoints are prefixed with `/api/v1/customers`.

*   **Create Customer:**
    *   `POST /api/v1/customers`
    *   Body: JSON object representing a `Customer` (e.g., `{"fullName": "John Doe", "birthDate": "1990-01-01", "email": "john.doe@example.com"}`)
    *   Returns: Created `Customer` object.

*   **Get All Customers:**
    *   `GET /api/v1/customers`
    *   Returns: List of all `Customer` objects.

*   **Get Customer by ID:**
    *   `GET /api/v1/customers/{id}`
    *   Returns: `Customer` object with the given ID, or 404 if not found.

*   **Update Customer:**
    *   `PUT /api/v1/customers/{id}`
    *   Body: JSON object representing the updated `Customer` details.
    *   Returns: Updated `Customer` object.

*   **Delete Customer:**
    *   `DELETE /api/v1/customers/{id}`
    *   Returns: No Content.
