--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHeldItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_held_item'
--
SELECT pokemon, version_details FROM pokemon_held_item WHERE 1=1;

--
-- INSERT template for table 'pokemon_held_item'
--
INSERT INTO pokemon_held_item (pokemon, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_held_item'
--
UPDATE pokemon_held_item SET pokemon = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_held_item'
--
DELETE FROM pokemon_held_item WHERE 1=2;

