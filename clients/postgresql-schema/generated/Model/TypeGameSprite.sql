--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeGameSprite' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_game_sprite'
--
SELECT name_icon, symbol_icon FROM type_game_sprite WHERE 1=1;

--
-- INSERT template for table 'type_game_sprite'
--
INSERT INTO type_game_sprite (name_icon, symbol_icon) VALUES (?, ?);

--
-- UPDATE template for table 'type_game_sprite'
--
UPDATE type_game_sprite SET name_icon = ?, symbol_icon = ? WHERE 1=2;

--
-- DELETE template for table 'type_game_sprite'
--
DELETE FROM type_game_sprite WHERE 1=2;

