 CREATE USER 'kuga'@'localhost' IDENTIFIED BY 'kuga';  

 GRANT ALL PRIVILEGES ON *.* TO 'kuga'@'localhost'  
      WITH GRANT OPTION;  

 FLUSH PRIVILEGES;  

 CREATE DATABASE SpringHibernateDemoDB;  

 USE SpringHibernateDemoDB;  

 CREATE TABLE STUDENT(  
      STUDENT_ID NVARCHAR(6) NOT NULL,  
      STUDENT_NAME NVARCHAR(20),  
      BATCH_ID INT,  
      PRIMARY KEY(STUDENT_ID)  
 );  

 CREATE TABLE BATCH(  
      BATCH_ID INT NOT NULL AUTO_INCREMENT,  
      BATCH_NAME NVARCHAR(20),  
      PRIMARY KEY(BATCH_ID)  
 );
 
 INSERT INTO `springhibernatedemodb`.`batch` (`BATCH_NAME`) VALUES('Batch 1');  
 INSERT INTO `springhibernatedemodb`.`batch` (`BATCH_NAME`) VALUES('Batch 2');  

 INSERT INTO `springhibernatedemodb`.`student`(`STUDENT_ID`,`STUDENT_NAME`,`BATCH_ID`) VALUES('S001','Student1',1);  
 INSERT INTO `springhibernatedemodb`.`student`(`STUDENT_ID`,`STUDENT_NAME`,`BATCH_ID`) VALUES('S002','Student2',1);  
 INSERT INTO `springhibernatedemodb`.`student`(`STUDENT_ID`,`STUDENT_NAME`,`BATCH_ID`) VALUES('S003','Student3',2);  
 INSERT INTO `springhibernatedemodb`.`student`(`STUDENT_ID`,`STUDENT_NAME`,`BATCH_ID`) VALUES('S004','Student4',2);