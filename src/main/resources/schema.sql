DROP TABLE IF EXISTS `demo_message`; 
CREATE TABLE IF NOT EXISTS `demo_message` (
 `id` int NOT NULL AUTO_INCREMENT,
 `message` varchar(200) NOT NULL,
 PRIMARY KEY (`id`)
);