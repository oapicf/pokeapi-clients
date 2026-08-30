--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_machines_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_machines_inner'
--
SELECT machine, version_group FROM move_detail_machines_inner WHERE 1=1;

--
-- INSERT template for table 'move_detail_machines_inner'
--
INSERT INTO move_detail_machines_inner (machine, version_group) VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_machines_inner'
--
UPDATE move_detail_machines_inner SET machine = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_machines_inner'
--
DELETE FROM move_detail_machines_inner WHERE 1=2;

