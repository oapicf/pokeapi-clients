--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDamageClassDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_damage_class_detail'
--
SELECT "id", "name", descriptions, moves, "names" FROM move_damage_class_detail WHERE 1=1;

--
-- INSERT template for table 'move_damage_class_detail'
--
INSERT INTO move_damage_class_detail ("id", "name", descriptions, moves, "names") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_damage_class_detail'
--
UPDATE move_damage_class_detail SET "id" = ?, "name" = ?, descriptions = ?, moves = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'move_damage_class_detail'
--
DELETE FROM move_damage_class_detail WHERE 1=2;

