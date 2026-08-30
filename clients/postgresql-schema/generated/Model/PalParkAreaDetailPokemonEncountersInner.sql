--
-- "PokéAPI"
-- Prepared SQL queries for 'PalParkAreaDetail_pokemon_encounters_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pal_park_area_detail_pokemon_encounters_inner'
--
SELECT base_score, pokemon_species, rate FROM pal_park_area_detail_pokemon_encounters_inner WHERE 1=1;

--
-- INSERT template for table 'pal_park_area_detail_pokemon_encounters_inner'
--
INSERT INTO pal_park_area_detail_pokemon_encounters_inner (base_score, pokemon_species, rate) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pal_park_area_detail_pokemon_encounters_inner'
--
UPDATE pal_park_area_detail_pokemon_encounters_inner SET base_score = ?, pokemon_species = ?, rate = ? WHERE 1=2;

--
-- DELETE template for table 'pal_park_area_detail_pokemon_encounters_inner'
--
DELETE FROM pal_park_area_detail_pokemon_encounters_inner WHERE 1=2;

