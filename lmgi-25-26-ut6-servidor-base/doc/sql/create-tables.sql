CREATE TABLE usuarios (

    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    pass VARCHAR(255) NOT NULL UNIQUE,
	rol int
);
