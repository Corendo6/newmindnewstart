CREATE DATABASE newstart;
CREATE USER 'newstart'@'localhost' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON newstart.* TO 'newstart'@'localhost';
FLUSH PRIVILEGES;