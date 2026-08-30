--
-- "PokéAPI"
-- Prepared SQL queries for 'StatDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_detail'
--
SELECT "id", "name", game_index, is_battle_only, affecting_moves, affecting_natures, "characteristics", move_damage_class, "names" FROM stat_detail WHERE 1=1;

--
-- INSERT template for table 'stat_detail'
--
INSERT INTO stat_detail ("id", "name", game_index, is_battle_only, affecting_moves, affecting_natures, "characteristics", move_damage_class, "names") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'stat_detail'
--
UPDATE stat_detail SET "id" = ?, "name" = ?, game_index = ?, is_battle_only = ?, affecting_moves = ?, affecting_natures = ?, "characteristics" = ?, move_damage_class = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'stat_detail'
--
DELETE FROM stat_detail WHERE 1=2;

