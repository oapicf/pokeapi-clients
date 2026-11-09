--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaEncounterRate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_encounter_rate'
--
SELECT encounter_method, version_details FROM location_area_encounter_rate WHERE 1=1;

--
-- INSERT template for table 'location_area_encounter_rate'
--
INSERT INTO location_area_encounter_rate (encounter_method, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'location_area_encounter_rate'
--
UPDATE location_area_encounter_rate SET encounter_method = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_encounter_rate'
--
DELETE FROM location_area_encounter_rate WHERE 1=2;

