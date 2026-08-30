--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemPocketName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_pocket_name'
--
SELECT "name", "language" FROM item_pocket_name WHERE 1=1;

--
-- INSERT template for table 'item_pocket_name'
--
INSERT INTO item_pocket_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'item_pocket_name'
--
UPDATE item_pocket_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_pocket_name'
--
DELETE FROM item_pocket_name WHERE 1=2;

