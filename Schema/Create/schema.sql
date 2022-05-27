DROP TABLE IF EXISTS dinamax.utiliza;
DROP TABLE IF EXISTS dinamax.material;
DROP TABLE IF EXISTS dinamax.registro;
DROP TABLE IF EXISTS dinamax.obra;
DROP TABLE IF EXISTS dinamax.se_calcula;
DROP TABLE IF EXISTS dinamax.partida;
DROP TABLE IF EXISTS dinamax.estado;
DROP TABLE IF EXISTS dinamax.solucion_beneficiario;
DROP TABLE IF EXISTS dinamax.beneficiario;
DROP TABLE IF EXISTS dinamax.proyecto;
DROP TABLE IF EXISTS dinamax.solucion_habitacional;
DROP TABLE IF EXISTS dinamax.comuna;
DROP TABLE IF EXISTS dinamax.provincia;


DROP SCHEMA IF EXISTS dinamax;

CREATE SCHEMA IF NOT EXISTS dinamax;

CREATE TABLE IF NOT EXISTS dinamax.provincia
(
    id SERIAL,
    nombre  VARCHAR(64) UNIQUE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dinamax.comuna
(
    id     SERIAL,
    nombre VARCHAR(64) UNIQUE NOT NULL,
    provincia_id INTEGER NOT NULL,
    FOREIGN KEY (provincia_id) REFERENCES dinamax.provincia(id),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dinamax.solucion_habitacional
(
    id   SERIAL,
    tipo VARCHAR(64) UNIQUE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dinamax.proyecto
(
    id     SERIAL,
    nombre VARCHAR(64),
    PRIMARY KEY (id)

);

CREATE TABLE IF NOT EXISTS dinamax.beneficiario
(
    rut         VARCHAR(64) NOT NULL,
    nombre      VARCHAR(64) NOT NULL,
    apellido_p  VARCHAR(64) NOT NULL,
    apellido_m  VARCHAR(64) NOT NULL,
    calle       VARCHAR(64),
    n_casa      INTEGER,
    comuna_id   INTEGER     NOT NULL,
    proyecto_id INTEGER     NOT NULL,
    UNIQUE (rut),
    FOREIGN KEY (comuna_id) REFERENCES dinamax.comuna (id),
    FOREIGN KEY (proyecto_id) REFERENCES dinamax.proyecto (id),
    PRIMARY KEY (rut)
);

CREATE TABLE IF NOT EXISTS dinamax.solucion_beneficiario
(
    id_sb       SERIAL,
    run         VARCHAR(64) NOT NULL,
    id_solucion INT         NOT NULL,
    FOREIGN KEY (run) REFERENCES dinamax.beneficiario (rut),
    FOREIGN KEY (id_solucion) REFERENCES dinamax.solucion_habitacional (id),
    PRIMARY KEY (id_sb)
);



CREATE TABLE IF NOT EXISTS dinamax.estado
(
    id   SERIAL,
    tipo VARCHAR(64) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dinamax.partida
(
    id           SERIAL,
    tipo         VARCHAR(255)  NOT NULL,
    n_materiales INT           NOT NULL,
    costo        NUMERIC(4, 3) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dinamax.se_calcula
(
    id          SERIAL,
    partida_id  INT NOT NULL,
    proyecto_id INT NOT NULL,
    cantidad    INT NOT NULL,
    PRIMARY KEY (partida_id, proyecto_id),
    FOREIGN KEY (proyecto_id) REFERENCES dinamax.proyecto (id),
    FOREIGN KEY (partida_id) REFERENCES dinamax.partida (id)
);


CREATE TABLE IF NOT EXISTS dinamax.obra
(
    id          SERIAL,
    dia_inicio  INT NOT NULL,
    mes_inicio  INT NOT NULL,
    año_inicio  INT NOT NULL,
    dia_termino INT NOT NULL,
    mes_termino INT NOT NULL,
    año_termino INT NOT NULL,
    estado_id   INT NOT NULL,
    proyecto_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES dinamax.estado (id),
    FOREIGN KEY (proyecto_id) REFERENCES dinamax.proyecto (id)
);

CREATE TABLE IF NOT EXISTS dinamax.registro
(
    id   SERIAL,
    obra_id        INT NOT NULL,
    ingreso_egreso INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (obra_id) REFERENCES dinamax.obra (id)
);


CREATE TABLE IF NOT EXISTS dinamax.material
(
    id       SERIAL,
    nombre   VARCHAR(255)  NOT NULL,
    precio   NUMERIC(4, 3) NOT NULL,
    cantidad INT           NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS dinamax.utiliza
(
    id          SERIAL,
    obra_id     INT NOT NULL,
    material_id INT NOT NULL,
    cantidad    INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (obra_id) REFERENCES dinamax.obra (id),
    FOREIGN KEY (material_id) REFERENCES dinamax.material (id)
);




