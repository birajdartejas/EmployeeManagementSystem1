# Employee Management System

This is an Employee Management System built using Spring Boot and MySQL. It allows you to manage employee information efficiently with features to add, update, delete, and view employee details.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)

- [Contact](#contact)

## Features

- Add new employees
- View all employees
- Update employee information
- Delete employees

## Technologies Used

- Java
- Spring Boot
- MySQL
- Spring Data JPA
- Thymeleaf (for frontend)
- Maven

## Setup and Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/employee-management-system.git
    cd employee-management-system
    ```

2. **Create MySQL Database:**
    ```sql
    CREATE DATABASE employee_management;
    ```

3. **Configure application.properties:**
    Open `src/main/resources/application.properties` and set your MySQL username and password.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    ```

4. **Build and run the application:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

5. **Access the application:**
    Open your browser and navigate to `http://localhost:8080`.

## Usage

- **Add Employee:** Click on the 'Add Employee' button and fill in the employee details.
- **View Employees:** The home page displays a list of all employees.
- **Update Employee:** Click the 'Edit' button next to the employee you want to update.
- **Delete Employee:** Click the 'Delete' button next to the employee you want to remove.

## Screenshots

### Home Page
![Home Page](![image](https://github.com/user-attachments/assets/ad424619-5bb4-4729-840b-6cd8fe9658cf)
.png)

### Add Employee
![Add Employee](![image](https://github.com/user-attachments/assets/6d31ef64-43d4-4a73-b016-a9f1d379284b)
.png)

### Update Employee
![Update Employee](![image](https://github.com/user-attachments/assets/3e28cce0-bdc2-4dfe-af0e-15562299ccf9)
.png)

### Delete Employee
![Delete Employee](![Screenshot 2024-07-30 221810](https://github.com/user-attachments/assets/a90ca483-f634-4b0b-bdd2-10d349a274c2)
.png)

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature-branch`)
6. Open a pull request


## Contact

For any inquiries or feedback, feel free to reach out:

- **Name:** Tejas Birajdar
- **Email:** tejasbirajdar.skn.comp@gmail.com
