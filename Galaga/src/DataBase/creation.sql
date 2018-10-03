CREATE DATABASE Scoreboard;
USE Scoreboard;


CREATE TABLE IF NOT EXIST 'Score'(
      `_id` int NOT NULL AUTO_INCREMENT,
  `Nickname` varchar(100) NOT NULL,
  `Score` int NOT NULL,
   PRIMARY KEY (`_id`) USING BTREE
);