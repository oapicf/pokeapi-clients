--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemCategorySummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_category_summary'
--
SELECT "name", url FROM item_category_summary WHERE 1=1;

--
-- INSERT template for table 'item_category_summary'
--
INSERT INTO item_category_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'item_category_summary'
--
UPDATE item_category_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'item_category_summary'
--
DELETE FROM item_category_summary WHERE 1=2;

