--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveLearnMethodDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_learn_method_detail'
--
SELECT "id", "name", "names", descriptions, version_groups FROM move_learn_method_detail WHERE 1=1;

--
-- INSERT template for table 'move_learn_method_detail'
--
INSERT INTO move_learn_method_detail ("id", "name", "names", descriptions, version_groups) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_learn_method_detail'
--
UPDATE move_learn_method_detail SET "id" = ?, "name" = ?, "names" = ?, descriptions = ?, version_groups = ? WHERE 1=2;

--
-- DELETE template for table 'move_learn_method_detail'
--
DELETE FROM move_learn_method_detail WHERE 1=2;

