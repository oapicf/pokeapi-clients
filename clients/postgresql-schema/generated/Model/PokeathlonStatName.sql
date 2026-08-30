--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_name'
--
SELECT "name", "language" FROM pokeathlon_stat_name WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_name'
--
INSERT INTO pokeathlon_stat_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_name'
--
UPDATE pokeathlon_stat_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_name'
--
DELETE FROM pokeathlon_stat_name WHERE 1=2;

