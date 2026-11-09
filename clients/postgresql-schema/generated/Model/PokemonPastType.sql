--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonPastType' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_past_type'
--
SELECT generation, "types" FROM pokemon_past_type WHERE 1=1;

--
-- INSERT template for table 'pokemon_past_type'
--
INSERT INTO pokemon_past_type (generation, "types") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_past_type'
--
UPDATE pokemon_past_type SET generation = ?, "types" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_past_type'
--
DELETE FROM pokemon_past_type WHERE 1=2;

