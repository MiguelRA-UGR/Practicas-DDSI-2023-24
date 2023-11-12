--Para ver las sesiones  eliminar si hay alguna inactiva
select * from mis_sesiones;
execute mata_sesion(68,56526);

--Ejemplos de datos de entrada
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (1, 101, '2023-11-07');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (2, 102, '2023-11-08');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (3, 103, '2023-11-09');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (4, 104, '2023-12-07');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (5, 105, '2023-12-08');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (6, 106, '2023-12-09');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (7, 107, '2023-1-07');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (8, 108, '2023-1-08');
INSERT INTO Pedido (Cpedido, Ccliente, Fecha_pedido) VALUES (9, 109, '2023-1-09');

INSERT INTO stock (Cproducto, Cantidad) VALUES (201, 10);
INSERT INTO stock (Cproducto, Cantidad) VALUES (202, 10);
INSERT INTO stock (Cproducto, Cantidad) VALUES (203, 10);


INSERT INTO stock (Cproducto, Cantidad) VALUES (2011111, 10);
INSERT INTO stock (Cproducto, Cantidad) VALUES (2022222, 10);
INSERT INTO stock (Cproducto, Cantidad) VALUES (2033333, 10);

INSERT INTO detalle_pedido (Cpedido, Cproducto, cantidad) VALUES (1, 201, 2);
INSERT INTO detalle_pedido (Cpedido, Cproducto, cantidad) VALUES (2, 202, 1);
INSERT INTO detalle_pedido (Cpedido, Cproducto, cantidad) VALUES (3, 203, 3);

--IMPORTANTE: ANTES DE LANZAR LA INTERFAZ Y PROBAR COSAS HACER UN COMMIT AQUÍ, sino hará que se quede bloqueada la interfaz

--Ver todo el contenido de las tablas
select * from detalle_pedido;
select * from pedido;
select * from stock;

--Vemos los elementos de una tabla
SELECT COUNT(*)  FROM stock;
--Tienen que eliminarse en este orden porque sino salta una violación por eliminar 
--elementos que tienen claves externas, es decir, vínculos en otras tablas
Delete from pedido;
Delete from stock;
DELETE from detalle_pedido;
