--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemPocketDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_pocket_detail'
--
SELECT "id", "name", categories, "names" FROM item_pocket_detail WHERE 1=1;

--
-- INSERT template for table 'item_pocket_detail'
--
INSERT INTO item_pocket_detail ("id", "name", categories, "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'item_pocket_detail'
--
UPDATE item_pocket_detail SET "id" = ?, "name" = ?, categories = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'item_pocket_detail'
--
DELETE FROM item_pocket_detail WHERE 1=2;

