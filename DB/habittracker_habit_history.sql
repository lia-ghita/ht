-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: habittracker
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `habit_history`
--

DROP TABLE IF EXISTS `habit_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habit_history` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `habit_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `date_marked` date DEFAULT NULL,
  `marked_as` int DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `uc_history2` (`user_id`,`habit_id`,`date_marked`),
  KEY `habit_id` (`habit_id`),
  CONSTRAINT `habit_history_ibfk_1` FOREIGN KEY (`habit_id`) REFERENCES `habits` (`id`),
  CONSTRAINT `habit_history_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habit_history`
--

LOCK TABLES `habit_history` WRITE;
/*!40000 ALTER TABLE `habit_history` DISABLE KEYS */;
INSERT INTO `habit_history` VALUES (26,12,9,'2020-04-21',1),(27,10,7,'2020-04-21',1),(28,9,7,'2020-04-21',1),(29,8,7,'2020-04-21',1),(32,8,7,'2020-04-22',1),(33,9,7,'2020-04-22',1),(34,8,7,'2020-04-23',1),(35,9,7,'2020-04-23',1),(36,8,7,'2020-04-24',1),(37,9,7,'2020-04-24',1),(39,8,7,'2020-04-25',1),(40,9,7,'2020-04-25',1),(41,10,7,'2020-04-25',1),(42,8,7,'2020-04-26',1),(44,9,7,'2020-04-26',1),(48,10,7,'2020-04-26',1),(57,8,7,'2020-04-27',1),(58,10,7,'2020-04-27',1),(59,26,7,'2020-04-27',1),(60,8,7,'2020-04-28',1),(61,9,7,'2020-04-28',1),(62,26,7,'2020-04-28',1),(63,27,7,'2020-04-28',1),(64,8,7,'2020-04-29',1),(65,9,7,'2020-04-29',1),(66,27,7,'2020-04-29',1),(67,8,7,'2020-04-30',1),(68,9,7,'2020-04-30',1),(69,26,7,'2020-04-30',1),(70,27,7,'2020-04-30',1),(83,38,8,'2020-04-30',1),(84,8,7,'2020-05-02',1),(85,26,7,'2020-05-02',1),(86,27,7,'2020-05-02',1),(88,9,7,'2020-05-02',1),(92,8,7,'2020-05-05',1),(93,9,7,'2020-05-05',1),(94,26,7,'2020-05-05',1),(95,27,7,'2020-05-05',1),(96,10,7,'2020-05-05',1),(97,8,7,'2020-05-06',1),(98,8,7,'2020-05-11',1),(99,27,7,'2020-05-11',1),(100,9,7,'2020-05-11',1),(101,43,7,'2020-05-11',1),(102,8,7,'2020-05-13',1),(103,9,7,'2020-05-13',1),(104,26,7,'2020-05-13',1),(105,27,7,'2020-05-13',1),(109,8,7,'2020-06-09',1),(111,9,7,'2020-06-09',1),(112,26,7,'2020-06-09',1),(114,8,7,'2020-06-21',1),(115,9,7,'2020-06-21',1),(116,26,7,'2020-06-21',1),(120,27,7,'2020-06-21',1);
/*!40000 ALTER TABLE `habit_history` ENABLE KEYS */;
UNLOCK TABLES;
ALTER DATABASE `habittracker` CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `GainBadge` AFTER INSERT ON `habit_history` FOR EACH ROW BEGIN
SET @x = (
 select count(habit_id) as done from habit_history where habit_id=new.habit_id and user_id =new.user_id and marked_as=1 and year(date_marked)=YEAR(CURDATE())
);
   IF ( @x > 0 AND @x<5 ) THEN
   insert into badge_history (badge_id, user_id) values (1, new.user_id);
   elseif ( @x >= 5 AND @x<10) THEN
   insert into badge_history (badge_id, user_id) values (2, new.user_id);
   elseif ( @x >= 10 AND @x<30) THEN
   insert into badge_history (badge_id, user_id) values (3, new.user_id);
  end if ;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
ALTER DATABASE `habittracker` CHARACTER SET utf8 COLLATE utf8_general_ci ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-21 19:13:39
