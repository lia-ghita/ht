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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `password` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `email` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `address` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `city` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `contact` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='changed name';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (7,'Lia','d95083846e3097c42f4034a954457704386a5543634aea0853a9f4451fea4a23a17086b1e6a035e2074cb28e4eb0190a6a71585d5ffd6d2300c5693800ccc104','lia.ghita@gmail.com','Str. Rahovei','Sibiu','0773361279'),(8,'Miky','d95083846e3097c42f4034a954457704386a5543634aea0853a9f4451fea4a23a17086b1e6a035e2074cb28e4eb0190a6a71585d5ffd6d2300c5693800ccc104','miky.paicu@gmail.com','Turda','Turda','0775689258'),(9,'mafdet','d95083846e3097c42f4034a954457704386a5543634aea0853a9f4451fea4a23a17086b1e6a035e2074cb28e4eb0190a6a71585d5ffd6d2300c5693800ccc104','mafdet_me@yahoo.com','Fagaras','Fagaras','0268215875'),(17,'test1','d95083846e3097c42f4034a954457704386a5543634aea0853a9f4451fea4a23a17086b1e6a035e2074cb28e4eb0190a6a71585d5ffd6d2300c5693800ccc104','test1@im-c.com','test1','test1','123'),(18,'test2','dd0158955426a905a16b7a8cbb9a024e5fc6ac75a57f0df642d6fe5613a0deaa82406c87750cd90c6d49e3553db1671aa2c48724482e597386633bb92a47424f','test2@test2.com','test2','test2','123'),(19,'Alexandra','da85f6b07b5523e51d7384b181b1b240e77377c1a65e2e262bf7d15e2750173f1fdde43078a3246f2d83bdf19b0fcc936364dd72ace9c8620b6c874ece4241e7','ale@ale.com','Sibiu','Sibiu','07756456789'),(20,'Alexandru','3a4cf65bf25061ea9e1f3eff71b9d6f18a1b1421769a7196b1a2e22eda6907095adc9d0ee41f16c22aaf1ab83fec00e66f356cba0746e527f4cba701a60f5d4e','alexandru@a.com','Cluj','Cluj','0778789678'),(21,'Peter','dc107e20c57acadf057ac309c87c4e16a9b58e2688bcbc3f9140c0b0d293e70dd3339c0614458249e7464cc2b4bd8d5b35db7d53a117ba0e6a57b79ecd351490','peter@p.com','Munchen','Munchen','003176878909'),(22,'test123','9ab2e1109badefffd6230b47b285590124ef4159b71544eba11ff64bb348d2ab785046d72a8e03c17bb08a721be7fff08035841a90f099e18205030c29a4b13c','test123@lia.com','test123','test123','123456');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `PassHash` BEFORE INSERT ON `users` FOR EACH ROW BEGIN
  set new.password=  hashpass(new.password);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-21 19:13:38
