# Student Management System

This is a **Spring Boot** web application that follows the **MVC architecture**. It uses **Thymeleaf** for server-side rendering and **Bootstrap** for basic styling. The application interacts with a **MySQL** database through **Spring Data JPA** and provides full **Create, Read, Update, Delete (CRUD)** operations for managing a database of students.

---

## Technologies Used

- Spring Web
- Spring Data JPA
- Thymeleaf  
- Bootstrap 5
- MySQL

---

## Project Structure

```
src/main/java
 └── com/example/studentmanagement
     ├── controller    # Handles HTTP requests
     ├── entity        # Student entity
     ├── dao           # JPA repository connects to Database
     ├── service       # Operational logic
     └── StudentManagementApplication.java # Main application

src/main/resources
 ├── templates         # Thymeleaf HTML templates (student form and view page)
 ├── static            # Static resources (CSS - Bootstrap)
 ├── application.properties
 └── student_db_setup.sql # SQL script to create the student table
```

---

## Database Schema

**(Included in `student_db_setup.sql`)**

```sql
CREATE DATABASE  IF NOT EXISTS `student_repository`;
USE `student_repository`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `student`
--

INSERT INTO `student` VALUES
	(1,'Peppa','Pig','peppa@suka.com'),
	(2,'Suzy','Sheep','suzy@suka.com'),
	(3,'Danny','Dog','danny@suka.com'),
	(4,'Benny','Bull','benny@suka.com'),
	(5,'Candy','Cat','candy@suka.com');


```
