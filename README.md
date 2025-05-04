# Spring Boot MVC CRUD Application

Built using **Spring Boot** following the **MVC architecture** with **Thymeleaf** for server-side rendering and **Bootstrap** for basic styling. The application provides full Create, Read, Update, Delete (CRUD) features on a **MySQL** database through **Spring Data JPA**.

---

## Technologies Used

- Spring Web
- Spring Data JPA
- Spring security
- Thymeleaf, Bootstrap
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
 └── application.properties
```

---

## Database Schema

**(Included in `student_directory.sql`)**

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
