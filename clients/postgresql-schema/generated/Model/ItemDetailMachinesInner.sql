--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemDetail_machines_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_detail_machines_inner'
--
SELECT machine, version_group FROM item_detail_machines_inner WHERE 1=1;

--
-- INSERT template for table 'item_detail_machines_inner'
--
INSERT INTO item_detail_machines_inner (machine, version_group) VALUES (?, ?);

--
-- UPDATE template for table 'item_detail_machines_inner'
--
UPDATE item_detail_machines_inner SET machine = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'item_detail_machines_inner'
--
DELETE FROM item_detail_machines_inner WHERE 1=2;

