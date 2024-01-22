-- Asignar Premio

ALTER TABLE Partida
ADD Ganador VARCHAR2(10);
select * from cliente;

-- Desactivar el trigger
--ALTER TRIGGER actualizar_premio_torneo DISABLE;
-- Inserciones ejemplo para probar la función asignarPremio

-- Inserciones en la tabla Cliente
INSERT INTO Cliente VALUES ('C001', 'cliente1@example.com', 'Cliente1', 'Apellido1', 1234567890);
INSERT INTO Cliente VALUES ('C002', 'cliente2@example.com', 'Cliente2', 'Apellido2', 9876543210);

-- Inserciones en la tabla Juego
INSERT INTO Juego VALUES ('J001', 'A', 'Poker', 'Ext1');
INSERT INTO Juego VALUES ('J002', 'B', 'Domino', 'Ext2');

-- Inserciones en la tabla Mesa
INSERT INTO Mesa VALUES (1, 'A', 4);
INSERT INTO Mesa VALUES (2, 'B', 6);

--select idTorneo from torneo;
select * from mesa;
--select * from partida order by idpartida asc;

-- Inserciones en la tabla Partida
-- Partidas para el IDTorneo 'T001'
INSERT INTO Partida VALUES ('P001', 1, 'T001', '11', TO_DATE('20-01-2024', 'DD-MM-YYYY'), TO_DATE('21-01-2024', 'DD-MM-YYYY'), 4, 1, 'EquipoA');
INSERT INTO Partida VALUES ('P002', 2, 'T001', '11', TO_DATE('22-01-2024', 'DD-MM-YYYY'), TO_DATE('23-01-2024', 'DD-MM-YYYY'), 6, 1, 'EquipoB');
INSERT INTO Partida VALUES ('P003', 1, 'T001', '11', TO_DATE('24-01-2024', 'DD-MM-YYYY'), TO_DATE('25-01-2024', 'DD-MM-YYYY'), 4, 1, 'EquipoA');
INSERT INTO Partida VALUES ('P004', 2, 'T001', '11', TO_DATE('26-01-2024', 'DD-MM-YYYY'), TO_DATE('27-01-2024', 'DD-MM-YYYY'), 6, 1, 'EquipoB');
INSERT INTO Partida VALUES ('P005', 1, 'T001', '11', TO_DATE('28-01-2024', 'DD-MM-YYYY'), TO_DATE('29-01-2024', 'DD-MM-YYYY'), 4, 1, 'EquipoA');
-- Partidas para el IDTorneo 'T002'
INSERT INTO Partida VALUES ('P006', 1, 'T002', '10', TO_DATE('10-02-2024', 'DD-MM-YYYY'), TO_DATE('11-02-2024', 'DD-MM-YYYY'), 5, 1, 'EquipoC');
INSERT INTO Partida VALUES ('P007', 2, 'T002', '10', TO_DATE('12-02-2024', 'DD-MM-YYYY'), TO_DATE('13-02-2024', 'DD-MM-YYYY'), 7, 1, 'EquipoD');
INSERT INTO Partida VALUES ('P008', 1, 'T002', '10', TO_DATE('14-02-2024', 'DD-MM-YYYY'), TO_DATE('15-02-2024', 'DD-MM-YYYY'), 5, 1, 'EquipoC');
-- Partidas para el IDTorneo 'T003'
INSERT INTO Partida VALUES ('P009', 2, 'T003', '6', TO_DATE('18-02-2024', 'DD-MM-YYYY'), TO_DATE('19-02-2024', 'DD-MM-YYYY'), 8, 1, 'EquipoE');
INSERT INTO Partida VALUES ('P010', 1, 'T003', '6', TO_DATE('20-02-2024', 'DD-MM-YYYY'), TO_DATE('21-02-2024', 'DD-MM-YYYY'), 4, 1, 'EquipoF');


--Para modificar el ejemplo
UPDATE Torneo SET Ganador = Null, Recaudacion= 5000 WHERE IDTorneo = 'T001';
UPDATE Torneo SET Ganador = Null, Recaudacion= 0 WHERE IDTorneo = 'T002';
UPDATE Torneo SET Ganador = Null, Recaudacion= 8000 WHERE IDTorneo = 'T003';

select * from Torneo;



-- Registrar un equipo en un torneo

--Trigger para que no se inscriban dos veces un equipo en el mismo torneo
CREATE OR REPLACE TRIGGER inscripcion_torneo_trigger
BEFORE INSERT ON ParticipaEn
FOR EACH ROW
DECLARE
    v_count NUMBER;
BEGIN
    -- Verificar si el equipo ya está inscrito en el torneo
    SELECT COUNT(*) INTO v_count
    FROM ParticipaEn
    WHERE IDEquipo = :NEW.IDEquipo AND IDTorneo = :NEW.IDTorneo;

    -- Si el equipo ya está inscrito, cancelar la inserción
    IF v_count > 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'El equipo ya está inscrito en este torneo.');
    END IF;
END;
/

select * from participaen;
-- Inserciones en las tablas relacionadas
INSERT INTO Equipo (IDEquipo, NombreEquipo) VALUES ('E3', 'Equipo C');
INSERT INTO Equipo (IDEquipo, NombreEquipo) VALUES ('E4', 'Equipo D');
INSERT INTO Equipo (IDEquipo, NombreEquipo) VALUES ('E5', 'Equipo E');
INSERT INTO Equipo (IDEquipo, NombreEquipo) VALUES ('E6', 'Equipo F');

-- Inserciones en ParticipaEn
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E1', 'T001');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E2', 'T001');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E3', 'T001');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E4', 'T001');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E5', 'T001');

INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E1', 'T003');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E5', 'T003');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E3', 'T003');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E4', 'T003');
INSERT INTO ParticipaEn (IDEquipo, IDTorneo) VALUES ('E6', 'T003');



-- MandarEmail
--Creamos un índice autoincremental
CREATE SEQUENCE email_sequence
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Y añadimos un trigger para que antes de que se haga el insert del email, se obtenga el idEmail y se asigne al campo idEmail de la entidad a añadir
CREATE OR REPLACE TRIGGER email_trigger
BEFORE INSERT ON Email
FOR EACH ROW
BEGIN
    SELECT email_sequence.NEXTVAL
    INTO :NEW.IDEmail
    FROM dual;
END;
/

INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('1', 'E1', 'test1@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('2', 'E1', 'test2@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('3', 'E1', 'test3@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('4', 'E1', 'test4@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('5', 'E2', 'test5@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('6', 'E2', 'test6@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('7', 'E2', 'test7@example.com');
INSERT INTO MiembroEquipo(IDCliente, IDEquipo, email) VALUES ('8', 'E2', 'test8@example.com');

select * from cliente;

--INSERTAR PARTIDA A UN TORNEO
CREATE SEQUENCE seq_partida
  START WITH 1
  INCREMENT BY 1
  NOMAXVALUE
  NOCYCLE
  NOCACHE;
--Trigger para que cuando se inserte una partida se obtenga un valor de seq_partida y se le asigne a IDPartida
CREATE OR REPLACE TRIGGER tr_insertar_partida
BEFORE INSERT ON Partida
FOR EACH ROW
BEGIN
    SELECT seq_partida.NEXTVAL INTO :NEW.IDPartida FROM dual;
END;
/

select * from partida;

delete from reservademesa where nreservamesa = '8992948';
--Ponerle hora a las partidas
UPDATE Partida SET HoraInicio = '12:30:00' WHERE IDPartida = 'P002';

UPDATE reservademesa SET Email = 'admin@example.com' WHERE nreservamesa = '4799585';
