--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_detail_pokemon_encounters_inner'
--
SELECT pokemon, version_details FROM location_area_detail_pokemon_encounters_inner WHERE 1=1;

--
-- INSERT template for table 'location_area_detail_pokemon_encounters_inner'
--
INSERT INTO location_area_detail_pokemon_encounters_inner (pokemon, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'location_area_detail_pokemon_encounters_inner'
--
UPDATE location_area_detail_pokemon_encounters_inner SET pokemon = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_detail_pokemon_encounters_inner'
--
DELETE FROM location_area_detail_pokemon_encounters_inner WHERE 1=2;

