--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemAttributeName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_attribute_name'
--
SELECT "name", "language" FROM item_attribute_name WHERE 1=1;

--
-- INSERT template for table 'item_attribute_name'
--
INSERT INTO item_attribute_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'item_attribute_name'
--
UPDATE item_attribute_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_attribute_name'
--
DELETE FROM item_attribute_name WHERE 1=2;

