INSERT INTO tiendadb.productos (producto_id, product_name, description, price, image_url,category_id) VALUES
(0, 'Laptop Dell XPS 13', 'Laptop ultraligera con procesador Intel i7', 1200.00, 'https://example.com/images/laptop1.jpg','0');

INSERT INTO tiendadb.productos (producto_id, product_name, description, price, image_url,category_id) VALUES
(0, 'Smartphone Samsung Galaxy S23', 'Teléfono inteligente con cámara de 108MP', 999.99, 'https://example.com/images/smartphone1.jpg','0');

INSERT INTO tiendadb.productos (producto_id, product_name, description, price, image_url,category_id) VALUES
(0, 'Auriculares Sony WH-1000XM4', 'Auriculares inalámbricos con cancelación de ruido', 350.50, 'https://example.com/images/headphones1.jpg','0');

INSERT INTO tiendadb.productos (producto_id, product_name, description, price, image_url,category_id) VALUES
(0, 'Reloj Apple Watch Series 9', 'Smartwatch con monitor de salud y GPS', 449.00, 'https://example.com/images/watch1.jpg','0');

INSERT INTO tiendadb.productos (producto_id, product_name, description, price, image_url,category_id) VALUES
(0, 'Tablet iPad Pro', 'Tablet con pantalla Liquid Retina y chip M2', 1100.00, 'https://example.com/images/tablet1.jpg','0');

INSERT INTO tiendadb.users VALUES (0, "admin", "holaholita", "admin@localhost.com");

INSERT INTO tiendadb.users VALUES (0, "Rafa", "holaholita1", "rafael@mancina.com");

INSERT INTO tiendadb.users VALUES (0, "Sergi", "holaholita2", "sergi@sergi.com");   

INSERT INTO `tiendadb`.`categorias` (categoria_id, nombre) VALUES
(1, 'Electrónica'),
(2, 'Ropa'),
(3, 'Hogar');