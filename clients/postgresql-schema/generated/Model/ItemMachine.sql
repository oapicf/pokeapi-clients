--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemMachine' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_machine'
--
SELECT machine, version_group FROM item_machine WHERE 1=1;

--
-- INSERT template for table 'item_machine'
--
INSERT INTO item_machine (machine, version_group) VALUES (?, ?);

--
-- UPDATE template for table 'item_machine'
--
UPDATE item_machine SET machine = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'item_machine'
--
DELETE FROM item_machine WHERE 1=2;

