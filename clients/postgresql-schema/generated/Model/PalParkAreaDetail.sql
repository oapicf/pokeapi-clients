--
-- "PokéAPI"
-- Prepared SQL queries for 'PalParkAreaDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pal_park_area_detail'
--
SELECT "id", "name", "names", pokemon_encounters FROM pal_park_area_detail WHERE 1=1;

--
-- INSERT template for table 'pal_park_area_detail'
--
INSERT INTO pal_park_area_detail ("id", "name", "names", pokemon_encounters) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pal_park_area_detail'
--
UPDATE pal_park_area_detail SET "id" = ?, "name" = ?, "names" = ?, pokemon_encounters = ? WHERE 1=2;

--
-- DELETE template for table 'pal_park_area_detail'
--
DELETE FROM pal_park_area_detail WHERE 1=2;

