--
-- "PokéAPI"
-- Prepared SQL queries for 'VersionDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_detail'
--
SELECT "id", "name", "names", version_group FROM version_detail WHERE 1=1;

--
-- INSERT template for table 'version_detail'
--
INSERT INTO version_detail ("id", "name", "names", version_group) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'version_detail'
--
UPDATE version_detail SET "id" = ?, "name" = ?, "names" = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'version_detail'
--
DELETE FROM version_detail WHERE 1=2;

