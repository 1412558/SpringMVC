use kuga;

CREATE TABLE `post` (
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `body` longtext NOT NULL,
  `created_at` date NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` longtext NOT NULL,
  `created_at` date NOT NULL,
  `user_id` int(11) NOT NULL,
  `post_id` int(11) NOT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `password` varchar(40) NOT NULL,
  `image` blob NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `kuga`.`user` (`email`, `phone`, `password`, `image`) VALUES ('demo1@gmail.com', '123456789', '123456', 0101010110100010);