--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesDetail_pal_park_encounters_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_detail_pal_park_encounters_inner'
--
SELECT area, base_score, rate FROM pokemon_species_detail_pal_park_encounters_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_detail_pal_park_encounters_inner'
--
INSERT INTO pokemon_species_detail_pal_park_encounters_inner (area, base_score, rate) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_species_detail_pal_park_encounters_inner'
--
UPDATE pokemon_species_detail_pal_park_encounters_inner SET area = ?, base_score = ?, rate = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_detail_pal_park_encounters_inner'
--
DELETE FROM pokemon_species_detail_pal_park_encounters_inner WHERE 1=2;

