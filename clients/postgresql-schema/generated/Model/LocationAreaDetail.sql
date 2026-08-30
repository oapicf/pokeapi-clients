--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail'
--
SELECT "id", "name", game_index, encounter_method_rates, "location", "names", pokemon_encounters FROM location_area_detail WHERE 1=1;

--
-- INSERT template for table 'location_area_detail'
--
INSERT INTO location_area_detail ("id", "name", game_index, encounter_method_rates, "location", "names", pokemon_encounters) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'location_area_detail'
--
UPDATE location_area_detail SET "id" = ?, "name" = ?, game_index = ?, encounter_method_rates = ?, "location" = ?, "names" = ?, pokemon_encounters = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail'
--
DELETE FROM location_area_detail WHERE 1=2;

