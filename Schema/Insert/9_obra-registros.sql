CREATE OR REPLACE FUNCTION generate_random_date(starting_timeframe INTEGER, ending_timeframe INTEGER) RETURNS DATE AS
$func$
DECLARE
    starting_interval INTERVAL DEFAULT make_interval(years => starting_timeframe);
    ending_interval   INTERVAL DEFAULT make_interval(years => (ending_timeframe - starting_timeframe));
BEGIN
    RETURN now() + (random() * (now() - ending_interval - now())) - starting_interval;
END;
$func$ LANGUAGE plpgsql;



CREATE OR REPLACE FUNCTION random_between(low INT ,high INT)
    RETURNS INT AS
$$
BEGIN
    RETURN floor(random()* (high-low + 1) + low);
END;
$$ language 'plpgsql' STRICT;

CREATE OR REPLACE PROCEDURE generate_random() AS
$$
DECLARE
    fecha_inicio DATE;
    fecha_termino DATE;
    ano_i INTEGER;
    mes_i INTEGER;
    dia_i INTEGER;
    ano_t INTEGER;
    mes_t INTEGER;
    dia_t INTEGER;

    diferencia_entre_fechas DATE;

BEGIN
    FOR i in 1..5
        LOOP
            fecha_inicio = generate_random_date(6, 12);
            ano_i = EXTRACT(YEAR from fecha_inicio);
            mes_i = EXTRACT(MONTH from fecha_inicio);
            dia_i = EXTRACT(DAY from fecha_inicio);
            fecha_termino = generate_random_date(1, 2);
            ano_t = EXTRACT(YEAR from fecha_termino);
            mes_t = EXTRACT(MONTH from fecha_termino);
            dia_t = EXTRACT(DAY from fecha_termino);

            INSERT INTO dinamax.obra VALUES (i, dia_i, mes_i, ano_i, dia_t,mes_t,ano_t, 2, i);
            FOR j in 1..1000
                LOOP
                    INSERT INTO dinamax.registro(obra_id, ingreso_egreso) VALUES (i, (floor(random()*(2000000-10000+1))+10000));
                END LOOP;
        END LOOP;
END;
$$ LANGUAGE plpgsql;


CALL generate_random();


SELECT * FROM dinamax.registro;