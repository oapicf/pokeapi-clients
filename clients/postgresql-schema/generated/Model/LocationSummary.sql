--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_summary'
--
SELECT "name", url FROM location_summary WHERE 1=1;

--
-- INSERT template for table 'location_summary'
--
INSERT INTO location_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'location_summary'
--
UPDATE location_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'location_summary'
--
DELETE FROM location_summary WHERE 1=2;

