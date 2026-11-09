--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatAffectingNature' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_affecting_nature'
--
SELECT max_change, nature FROM pokeathlon_stat_affecting_nature WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_affecting_nature'
--
INSERT INTO pokeathlon_stat_affecting_nature (max_change, nature) VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_affecting_nature'
--
UPDATE pokeathlon_stat_affecting_nature SET max_change = ?, nature = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_affecting_nature'
--
DELETE FROM pokeathlon_stat_affecting_nature WHERE 1=2;

