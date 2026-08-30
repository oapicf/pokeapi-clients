--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_summary'
--
SELECT "name", url FROM item_summary WHERE 1=1;

--
-- INSERT template for table 'item_summary'
--
INSERT INTO item_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'item_summary'
--
UPDATE item_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'item_summary'
--
DELETE FROM item_summary WHERE 1=2;

