--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemAttributeDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_attribute_detail'
--
SELECT "id", "name", descriptions, items, "names" FROM item_attribute_detail WHERE 1=1;

--
-- INSERT template for table 'item_attribute_detail'
--
INSERT INTO item_attribute_detail ("id", "name", descriptions, items, "names") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'item_attribute_detail'
--
UPDATE item_attribute_detail SET "id" = ?, "name" = ?, descriptions = ?, items = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'item_attribute_detail'
--
DELETE FROM item_attribute_detail WHERE 1=2;

