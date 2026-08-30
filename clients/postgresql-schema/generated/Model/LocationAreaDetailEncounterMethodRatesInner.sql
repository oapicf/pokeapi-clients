--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail_encounter_method_rates_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail_encounter_method_rates_inner'
--
SELECT encounter_method, version_details FROM location_area_detail_encounter_method_rates_inner WHERE 1=1;

--
-- INSERT template for table 'location_area_detail_encounter_method_rates_inner'
--
INSERT INTO location_area_detail_encounter_method_rates_inner (encounter_method, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'location_area_detail_encounter_method_rates_inner'
--
UPDATE location_area_detail_encounter_method_rates_inner SET encounter_method = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail_encounter_method_rates_inner'
--
DELETE FROM location_area_detail_encounter_method_rates_inner WHERE 1=2;

