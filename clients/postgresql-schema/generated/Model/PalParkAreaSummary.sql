--
-- "PokéAPI"
-- Prepared SQL queries for 'PalParkAreaSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pal_park_area_summary'
--
SELECT "name", url FROM pal_park_area_summary WHERE 1=1;

--
-- INSERT template for table 'pal_park_area_summary'
--
INSERT INTO pal_park_area_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pal_park_area_summary'
--
UPDATE pal_park_area_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pal_park_area_summary'
--
DELETE FROM pal_park_area_summary WHERE 1=2;

