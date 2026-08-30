--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemFlavorText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_flavor_text'
--
SELECT "text", version_group, "language" FROM item_flavor_text WHERE 1=1;

--
-- INSERT template for table 'item_flavor_text'
--
INSERT INTO item_flavor_text ("text", version_group, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'item_flavor_text'
--
UPDATE item_flavor_text SET "text" = ?, version_group = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_flavor_text'
--
DELETE FROM item_flavor_text WHERE 1=2;

