--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemCategoryDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_category_detail'
--
SELECT "id", "name", items, "names", pocket FROM item_category_detail WHERE 1=1;

--
-- INSERT template for table 'item_category_detail'
--
INSERT INTO item_category_detail ("id", "name", items, "names", pocket) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'item_category_detail'
--
UPDATE item_category_detail SET "id" = ?, "name" = ?, items = ?, "names" = ?, pocket = ? WHERE 1=2;

--
-- DELETE template for table 'item_category_detail'
--
DELETE FROM item_category_detail WHERE 1=2;

