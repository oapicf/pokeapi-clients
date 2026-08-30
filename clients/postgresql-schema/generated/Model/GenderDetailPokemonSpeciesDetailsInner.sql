--
-- "PokéAPI"
-- Prepared SQL queries for 'GenderDetail_pokemon_species_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_detail_pokemon_species_details_inner'
--
SELECT rate, pokemon_species FROM gender_detail_pokemon_species_details_inner WHERE 1=1;

--
-- INSERT template for table 'gender_detail_pokemon_species_details_inner'
--
INSERT INTO gender_detail_pokemon_species_details_inner (rate, pokemon_species) VALUES (?, ?);

--
-- UPDATE template for table 'gender_detail_pokemon_species_details_inner'
--
UPDATE gender_detail_pokemon_species_details_inner SET rate = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'gender_detail_pokemon_species_details_inner'
--
DELETE FROM gender_detail_pokemon_species_details_inner WHERE 1=2;

