--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveBattleStyleSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_battle_style_summary'
--
SELECT "name", url FROM move_battle_style_summary WHERE 1=1;

--
-- INSERT template for table 'move_battle_style_summary'
--
INSERT INTO move_battle_style_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_battle_style_summary'
--
UPDATE move_battle_style_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_battle_style_summary'
--
DELETE FROM move_battle_style_summary WHERE 1=2;

