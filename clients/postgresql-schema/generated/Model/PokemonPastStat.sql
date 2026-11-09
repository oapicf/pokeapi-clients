--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonPastStat' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_past_stat'
--
SELECT generation, stats FROM pokemon_past_stat WHERE 1=1;

--
-- INSERT template for table 'pokemon_past_stat'
--
INSERT INTO pokemon_past_stat (generation, stats) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_past_stat'
--
UPDATE pokemon_past_stat SET generation = ?, stats = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_past_stat'
--
DELETE FROM pokemon_past_stat WHERE 1=2;

