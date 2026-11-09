--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesPalParkEncounter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_pal_park_encounter'
--
SELECT base_score, rate, area FROM pokemon_species_pal_park_encounter WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_pal_park_encounter'
--
INSERT INTO pokemon_species_pal_park_encounter (base_score, rate, area) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_species_pal_park_encounter'
--
UPDATE pokemon_species_pal_park_encounter SET base_score = ?, rate = ?, area = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_pal_park_encounter'
--
DELETE FROM pokemon_species_pal_park_encounter WHERE 1=2;

