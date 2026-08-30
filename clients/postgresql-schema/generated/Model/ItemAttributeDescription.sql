--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemAttributeDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_attribute_description'
--
SELECT description, "language" FROM item_attribute_description WHERE 1=1;

--
-- INSERT template for table 'item_attribute_description'
--
INSERT INTO item_attribute_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'item_attribute_description'
--
UPDATE item_attribute_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_attribute_description'
--
DELETE FROM item_attribute_description WHERE 1=2;

