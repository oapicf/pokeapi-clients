--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaEncounterVersionDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_encounter_version_detail'
--
SELECT rate, "version" FROM location_area_encounter_version_detail WHERE 1=1;

--
-- INSERT template for table 'location_area_encounter_version_detail'
--
INSERT INTO location_area_encounter_version_detail (rate, "version") VALUES (?, ?);

--
-- UPDATE template for table 'location_area_encounter_version_detail'
--
UPDATE location_area_encounter_version_detail SET rate = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_encounter_version_detail'
--
DELETE FROM location_area_encounter_version_detail WHERE 1=2;

