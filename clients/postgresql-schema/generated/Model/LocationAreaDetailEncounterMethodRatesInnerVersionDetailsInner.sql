--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail_encounter_method_rates_inner_version_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail_encounter_method_rates_inner_version_detai'
--
SELECT rate, "version" FROM location_area_detail_encounter_method_rates_inner_version_detai WHERE 1=1;

--
-- INSERT template for table 'location_area_detail_encounter_method_rates_inner_version_detai'
--
INSERT INTO location_area_detail_encounter_method_rates_inner_version_detai (rate, "version") VALUES (?, ?);

--
-- UPDATE template for table 'location_area_detail_encounter_method_rates_inner_version_detai'
--
UPDATE location_area_detail_encounter_method_rates_inner_version_detai SET rate = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail_encounter_method_rates_inner_version_detai'
--
DELETE FROM location_area_detail_encounter_method_rates_inner_version_detai WHERE 1=2;

