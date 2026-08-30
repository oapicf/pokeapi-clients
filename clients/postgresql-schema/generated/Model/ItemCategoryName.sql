--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemCategoryName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_category_name'
--
SELECT "name", "language" FROM item_category_name WHERE 1=1;

--
-- INSERT template for table 'item_category_name'
--
INSERT INTO item_category_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'item_category_name'
--
UPDATE item_category_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_category_name'
--
DELETE FROM item_category_name WHERE 1=2;

