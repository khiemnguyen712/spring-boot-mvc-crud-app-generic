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

