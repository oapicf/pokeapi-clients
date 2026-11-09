--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonEncounterDetailResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_encounter_detail_response'
--
SELECT chance, condition_values, max_level, "method", min_level FROM pokemon_encounter_detail_response WHERE 1=1;

--
-- INSERT template for table 'pokemon_encounter_detail_response'
--
INSERT INTO pokemon_encounter_detail_response (chance, condition_values, max_level, "method", min_level) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_encounter_detail_response'
--
UPDATE pokemon_encounter_detail_response SET chance = ?, condition_values = ?, max_level = ?, "method" = ?, min_level = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_encounter_detail_response'
--
DELETE FROM pokemon_encounter_detail_response WHERE 1=2;

