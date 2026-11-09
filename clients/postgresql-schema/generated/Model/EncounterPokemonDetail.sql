--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterPokemonDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_pokemon_detail'
--
SELECT min_perfect_ivs, always_shiny, never_shiny, is_alpha FROM encounter_pokemon_detail WHERE 1=1;

--
-- INSERT template for table 'encounter_pokemon_detail'
--
INSERT INTO encounter_pokemon_detail (min_perfect_ivs, always_shiny, never_shiny, is_alpha) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'encounter_pokemon_detail'
--
UPDATE encounter_pokemon_detail SET min_perfect_ivs = ?, always_shiny = ?, never_shiny = ?, is_alpha = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_pokemon_detail'
--
DELETE FROM encounter_pokemon_detail WHERE 1=2;

