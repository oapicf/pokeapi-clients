--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonStat' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_stat'
--
SELECT base_stat, effort, stat FROM pokemon_stat WHERE 1=1;

--
-- INSERT template for table 'pokemon_stat'
--
INSERT INTO pokemon_stat (base_stat, effort, stat) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_stat'
--
UPDATE pokemon_stat SET base_stat = ?, effort = ?, stat = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_stat'
--
DELETE FROM pokemon_stat WHERE 1=2;

