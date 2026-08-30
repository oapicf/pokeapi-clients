--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeGameIndex' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_game_index'
--
SELECT game_index, generation FROM type_game_index WHERE 1=1;

--
-- INSERT template for table 'type_game_index'
--
INSERT INTO type_game_index (game_index, generation) VALUES (?, ?);

--
-- UPDATE template for table 'type_game_index'
--
UPDATE type_game_index SET game_index = ?, generation = ? WHERE 1=2;

--
-- DELETE template for table 'type_game_index'
--
DELETE FROM type_game_index WHERE 1=2;

