--
-- "PokéAPI"
-- Prepared SQL queries for 'NaturePokeathlonStat' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_pokeathlon_stat'
--
SELECT max_change, pokeathlon_stat FROM nature_pokeathlon_stat WHERE 1=1;

--
-- INSERT template for table 'nature_pokeathlon_stat'
--
INSERT INTO nature_pokeathlon_stat (max_change, pokeathlon_stat) VALUES (?, ?);

--
-- UPDATE template for table 'nature_pokeathlon_stat'
--
UPDATE nature_pokeathlon_stat SET max_change = ?, pokeathlon_stat = ? WHERE 1=2;

--
-- DELETE template for table 'nature_pokeathlon_stat'
--
DELETE FROM nature_pokeathlon_stat WHERE 1=2;

