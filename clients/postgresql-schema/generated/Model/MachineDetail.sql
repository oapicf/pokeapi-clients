--
-- "PokéAPI"
-- Prepared SQL queries for 'MachineDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'machine_detail'
--
SELECT "id", item, version_group, "move" FROM machine_detail WHERE 1=1;

--
-- INSERT template for table 'machine_detail'
--
INSERT INTO machine_detail ("id", item, version_group, "move") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'machine_detail'
--
UPDATE machine_detail SET "id" = ?, item = ?, version_group = ?, "move" = ? WHERE 1=2;

--
-- DELETE template for table 'machine_detail'
--
DELETE FROM machine_detail WHERE 1=2;

