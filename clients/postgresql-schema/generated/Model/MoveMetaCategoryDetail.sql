--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaCategoryDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_category_detail'
--
SELECT "id", "name", descriptions, moves FROM move_meta_category_detail WHERE 1=1;

--
-- INSERT template for table 'move_meta_category_detail'
--
INSERT INTO move_meta_category_detail ("id", "name", descriptions, moves) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'move_meta_category_detail'
--
UPDATE move_meta_category_detail SET "id" = ?, "name" = ?, descriptions = ?, moves = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_category_detail'
--
DELETE FROM move_meta_category_detail WHERE 1=2;

