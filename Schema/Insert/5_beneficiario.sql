INSERT INTO dinamax.beneficiario
VALUES
    ((floor(random()*(20000000-1000000+1))+1000000), 'Ariel', 'Pinto', 'Flores', 'San esteban', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 1),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Jamnia', 'Rivera', 'Monje', 'Huanhuali', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 2),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Valeria', 'Flores', 'Quezada', 'San esteban', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 3),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Carlos', 'Zepeda', 'Rojas', 'San Agustin', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 4),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Lucas', 'Pinto', 'Flores', 'San Felipe', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 5)
;


SELECT * FROM dinamax.beneficiario;



SELECT
    arrays.nombres[s.a % ARRAY_LENGTH(arrays.nombres,1) + 1] AS nombre,
    arrays.apellidos[s.a % ARRAY_LENGTH(arrays.apellidos,1) + 1] AS apellido_p,
    arrays.apellidos[s.a % ARRAY_LENGTH(arrays.apellidos,1) + 1] AS apellido_m
FROM     generate_series(1,100) AS s(a) -- number of names to generate
             CROSS JOIN(
    SELECT ARRAY[
               'Adam','Bill','Bob','Calvin','Donald','Dwight','Frank','Fred','George','Howard',
               'James','John','Jacob','Jack','Martin','Matthew','Max','Michael',
               'Paul','Peter','Phil','Roland','Ronald','Samuel','Steve','Theo','Warren','William',
               'Abigail','Alice','Allison','Amanda','Anne','Barbara','Betty','Carol','Cleo','Donna',
               'Jane','Jennifer','Julie','Martha','Mary','Melissa','Patty','Sarah','Simone','Susan'
               ] AS nombres,
           ARRAY[
               'Matthews','Smith','Jones','Davis','Jacobson','Williams','Donaldson','Maxwell','Peterson','Stevens',
               'Franklin','Washington','Jefferson','Adams','Jackson','Johnson','Lincoln','Grant','Fillmore','Harding','Taft',
               'Truman','Nixon','Ford','Carter','Reagan','Bush','Clinton','Hancock'
               ] AS apellidos
) AS arrays
;



INSERT INTO dinamax.beneficiario VALUES
SELECT
    -- Escoge una posición aleatoria de array nombres--
    arrays.nombres[(floor(random()*(ARRAY_LENGTH(arrays.nombres,1)-1+1))+1)]
FROM     generate_series(1,100) AS s(a) -- number of names to generate
             CROSS JOIN(
    SELECT ARRAY[
               'Adam','Bill','Bob','Calvin','Donald','Dwight','Frank','Fred','George','Howard',
               'James','John','Jacob','Jack','Martin','Matthew','Max','Michael',
               'Paul','Peter','Phil','Roland','Ronald','Samuel','Steve','Theo','Warren','William',
               'Abigail','Alice','Allison','Amanda','Anne','Barbara','Betty','Carol','Cleo','Donna',
               'Jane','Jennifer','Julie','Martha','Mary','Melissa','Patty','Sarah','Simone','Susan'
               ] AS nombres,
           ARRAY[
               'Matthews','Smith','Jones','Davis','Jacobson','Williams','Donaldson','Maxwell','Peterson','Stevens',
               'Franklin','Washington','Jefferson','Adams','Jackson','Johnson','Lincoln','Grant','Fillmore','Harding','Taft',
               'Truman','Nixon','Ford','Carter','Reagan','Bush','Clinton','Hancock'
               ] AS apellidos
) AS arrays
;


INSERT INTO dinamax.beneficiario
VALUES
    ((floor(random()*(20000000-1000000+1))+1000000), 'Ariel', 'Pinto', 'Flores', 'San esteban', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 1),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Jamnia', 'Rivera', 'Monje', 'Huanhuali', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 2),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Valeria', 'Flores', 'Quezada', 'San esteban', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 3),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Carlos', 'Zepeda', 'Rojas', 'San Agustin', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 4),
    ((floor(random()*(20000000-1000000+1))+1000000), 'Lucas', 'Pinto', 'Flores', 'San Felipe', (floor(random()*(3-1+1))+1), (floor(random()*(15-1+1))+1), 5)
;
