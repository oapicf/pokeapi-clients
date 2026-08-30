--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveBattleStyleName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_battle_style_name'
--
SELECT "name", "language" FROM move_battle_style_name WHERE 1=1;

--
-- INSERT template for table 'move_battle_style_name'
--
INSERT INTO move_battle_style_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_battle_style_name'
--
UPDATE move_battle_style_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_battle_style_name'
--
DELETE FROM move_battle_style_name WHERE 1=2;

