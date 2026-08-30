--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
SELECT min_level, max_level, condition_values, chance, "method" FROM location_area_detail_pokemon_encounters_inner_version_details_i WHERE 1=1;

--
-- INSERT template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
INSERT INTO location_area_detail_pokemon_encounters_inner_version_details_i (min_level, max_level, condition_values, chance, "method") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
UPDATE location_area_detail_pokemon_encounters_inner_version_details_i SET min_level = ?, max_level = ?, condition_values = ?, chance = ?, "method" = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
DELETE FROM location_area_detail_pokemon_encounters_inner_version_details_i WHERE 1=2;

