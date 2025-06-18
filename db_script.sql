CREATE DATABASE IF NOT EXISTS bus_system;
USE bus_system;

CREATE TABLE IF NOT EXISTS passengers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    destination VARCHAR(100)
);