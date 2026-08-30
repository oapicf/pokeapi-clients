--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonGameIndex' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_game_index'
--
SELECT game_index, "version" FROM pokemon_game_index WHERE 1=1;

--
-- INSERT template for table 'pokemon_game_index'
--
INSERT INTO pokemon_game_index (game_index, "version") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_game_index'
--
UPDATE pokemon_game_index SET game_index = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_game_index'
--
DELETE FROM pokemon_game_index WHERE 1=2;

