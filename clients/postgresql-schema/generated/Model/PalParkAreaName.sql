--
-- "PokéAPI"
-- Prepared SQL queries for 'PalParkAreaName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pal_park_area_name'
--
SELECT "name", "language" FROM pal_park_area_name WHERE 1=1;

--
-- INSERT template for table 'pal_park_area_name'
--
INSERT INTO pal_park_area_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pal_park_area_name'
--
UPDATE pal_park_area_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pal_park_area_name'
--
DELETE FROM pal_park_area_name WHERE 1=2;

