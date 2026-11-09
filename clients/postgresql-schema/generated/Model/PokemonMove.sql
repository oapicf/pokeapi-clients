--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonMove' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_move'
--
SELECT "move", version_group_details FROM pokemon_move WHERE 1=1;

--
-- INSERT template for table 'pokemon_move'
--
INSERT INTO pokemon_move ("move", version_group_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_move'
--
UPDATE pokemon_move SET "move" = ?, version_group_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_move'
--
DELETE FROM pokemon_move WHERE 1=2;

