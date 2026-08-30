--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveBattleStyleDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_battle_style_detail'
--
SELECT "id", "name", "names" FROM move_battle_style_detail WHERE 1=1;

--
-- INSERT template for table 'move_battle_style_detail'
--
INSERT INTO move_battle_style_detail ("id", "name", "names") VALUES (?, ?, ?);

--
-- UPDATE template for table 'move_battle_style_detail'
--
UPDATE move_battle_style_detail SET "id" = ?, "name" = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'move_battle_style_detail'
--
DELETE FROM move_battle_style_detail WHERE 1=2;

