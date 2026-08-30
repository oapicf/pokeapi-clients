--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationGameIndex' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_game_index'
--
SELECT game_index, generation FROM location_game_index WHERE 1=1;

--
-- INSERT template for table 'location_game_index'
--
INSERT INTO location_game_index (game_index, generation) VALUES (?, ?);

--
-- UPDATE template for table 'location_game_index'
--
UPDATE location_game_index SET game_index = ?, generation = ? WHERE 1=2;

--
-- DELETE template for table 'location_game_index'
--
DELETE FROM location_game_index WHERE 1=2;

