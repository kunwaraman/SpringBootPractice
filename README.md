# Product Management System

A Spring Boot application for managing products with CRUD operations. Built with Thymeleaf for the frontend and JPA for database interactions.
## **Features**
- **Create**: Add new products to the system.
- **Read**: View a list of all products.
- **Update**: Edit existing product details.
- **Delete**: Remove products from the system.

## **Technologies Used**

- **Backend**: Spring Boot, Spring Data JPA
- **Frontend**: Thymeleaf, Bootstrap
- **Database**: H2 (in-memory) or MySQL
- **Build Tool**: Maven

## **Prerequisites**

Before running the project, ensure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Apache Maven
- MySQL (optional, if not using H2)
- IDE (e.g., IntelliJ IDEA, Eclipse)

## **Setup and Installation**

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/product-management-system.git
cd product-management-system

 MySQL
Update the application.properties file with your MySQL credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

Create a database in MySQL:
CREATE DATABASE your_database_name;
Project Structure
Copy
src/main/java
├── com.example.demo
│   ├── controller
│   │   └── ProductController.java
│   ├── entity
│   │   └── Product.java
│   ├── repository
│   │   └── ProductRepository.java
│   ├── service
│   │   └── ProductService.java
│   └── DemoApplication.java
src/main/resources
├── static
├── templates
│   ├── index.html
│   └── product-form.html
└── application.properties
API Endpoints
HTTP Method	URL	Description
GET	/products	Display all products
GET	/products/new	Display form to add a product
POST	/products/new	Save a new product
GET	/products/edit/{id}	Display form to edit a product
POST	/products/edit/{id}	Update a product
GET	/products/delete/{id}	Delete a product



