--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner_version_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
SELECT "version", max_chance, encounter_details FROM location_area_detail_pokemon_encounters_inner_version_details_i WHERE 1=1;

--
-- INSERT template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
INSERT INTO location_area_detail_pokemon_encounters_inner_version_details_i ("version", max_chance, encounter_details) VALUES (?, ?, ?);

--
-- UPDATE template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
UPDATE location_area_detail_pokemon_encounters_inner_version_details_i SET "version" = ?, max_chance = ?, encounter_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail_pokemon_encounters_inner_version_details_i'
--
DELETE FROM location_area_detail_pokemon_encounters_inner_version_details_i WHERE 1=2;

