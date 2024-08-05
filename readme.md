# SalesApplication

This is a Spring Boot application for managing suppliers, items, and purchases. The application includes CRUD operations for suppliers, items, and purchases with a simple HTML-based user interface for ease of interaction.

## Features

- Manage suppliers: Add, view, update, and delete suppliers.
- Manage items: Add, view, update, and delete items.
- Manage purchases: Add, view, update, and delete purchases.
- Display purchases by year.
- Simple and attractive user interface for performing CRUD operations.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- HTML
- CSS
- JavaScript

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Devipriya131/SalesApplication.git
    cd SalesApplication
    ```

2. Build the application using Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

### Accessing the Application

Once the application is running, you can access it in your web browser at `http://localhost:8080`.

## API Endpoints

### Supplier Endpoints

- `GET /suppliers`: Retrieve all suppliers.
- `POST /suppliers`: Add a new supplier.

### Item Endpoints

- `GET /items`: Retrieve all items.
- `POST /items`: Add a new item.

### Purchase Endpoints

- `GET /purchases`: Retrieve all purchases.
- `GET /purchases/year/{year}`: Retrieve purchases by year.
- `POST /purchases`: Add a new purchase.

## User Interface

### Suppliers

To manage suppliers, navigate to `http://localhost:8080/suppliers.html` in your web browser. You can add new suppliers, view the list of suppliers, and perform CRUD operations.

### Items

To manage items, navigate to `http://localhost:8080/items.html` in your web browser. You can add new items, view the list of items, and perform CRUD operations.

### Purchases

To manage purchases, navigate to `http://localhost:8080/purchases.html` in your web browser. You can add new purchases, view the list of purchases, and perform CRUD operations.

