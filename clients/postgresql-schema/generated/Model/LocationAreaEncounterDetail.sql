--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaEncounterDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_encounter_detail'
--
SELECT min_level, max_level, chance, "method", condition_values, pokemon_details FROM location_area_encounter_detail WHERE 1=1;

--
-- INSERT template for table 'location_area_encounter_detail'
--
INSERT INTO location_area_encounter_detail (min_level, max_level, chance, "method", condition_values, pokemon_details) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'location_area_encounter_detail'
--
UPDATE location_area_encounter_detail SET min_level = ?, max_level = ?, chance = ?, "method" = ?, condition_values = ?, pokemon_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_encounter_detail'
--
DELETE FROM location_area_encounter_detail WHERE 1=2;

