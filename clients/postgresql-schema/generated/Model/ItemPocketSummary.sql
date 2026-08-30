--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemPocketSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_pocket_summary'
--
SELECT "name", url FROM item_pocket_summary WHERE 1=1;

--
-- INSERT template for table 'item_pocket_summary'
--
INSERT INTO item_pocket_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'item_pocket_summary'
--
UPDATE item_pocket_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'item_pocket_summary'
--
DELETE FROM item_pocket_summary WHERE 1=2;

