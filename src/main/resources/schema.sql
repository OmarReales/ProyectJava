CREATE SCHEMA IF NOT EXISTS testJPA_agenda_db;
USE testJPA_agenda_db;

CREATE TABLE Cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    dni VARCHAR(255),
    email VARCHAR(255),
    telefono VARCHAR(255),
    direccion VARCHAR(255)
);

CREATE TABLE Producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    precio DECIMAL(10, 2)
);

CREATE TABLE Factura (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT,
    total DECIMAL(10, 2),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE ItemFactura (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    factura_id BIGINT,
    producto_id BIGINT,
    cantidad INT,
    FOREIGN KEY (factura_id) REFERENCES Factura(id),
    FOREIGN KEY (producto_id) REFERENCES Producto(id)
);
