--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemAttributeSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_attribute_summary'
--
SELECT "name", url FROM item_attribute_summary WHERE 1=1;

--
-- INSERT template for table 'item_attribute_summary'
--
INSERT INTO item_attribute_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'item_attribute_summary'
--
UPDATE item_attribute_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'item_attribute_summary'
--
DELETE FROM item_attribute_summary WHERE 1=2;

