--
-- "PokéAPI"
-- Prepared SQL queries for 'RegionSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'region_summary'
--
SELECT "name", url FROM region_summary WHERE 1=1;

--
-- INSERT template for table 'region_summary'
--
INSERT INTO region_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'region_summary'
--
UPDATE region_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'region_summary'
--
DELETE FROM region_summary WHERE 1=2;

