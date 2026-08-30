--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveTargetDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_target_detail'
--
SELECT "id", "name", descriptions, moves, "names" FROM move_target_detail WHERE 1=1;

--
-- INSERT template for table 'move_target_detail'
--
INSERT INTO move_target_detail ("id", "name", descriptions, moves, "names") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_target_detail'
--
UPDATE move_target_detail SET "id" = ?, "name" = ?, descriptions = ?, moves = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'move_target_detail'
--
DELETE FROM move_target_detail WHERE 1=2;

