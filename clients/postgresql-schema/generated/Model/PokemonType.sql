--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonType' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_type'
--
SELECT slot, "type" FROM pokemon_type WHERE 1=1;

--
-- INSERT template for table 'pokemon_type'
--
INSERT INTO pokemon_type (slot, "type") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_type'
--
UPDATE pokemon_type SET slot = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_type'
--
DELETE FROM pokemon_type WHERE 1=2;

