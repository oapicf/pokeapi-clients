--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonEncounterVersionDetailResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_encounter_version_detail_response'
--
SELECT "version", max_chance, encounter_details FROM pokemon_encounter_version_detail_response WHERE 1=1;

--
-- INSERT template for table 'pokemon_encounter_version_detail_response'
--
INSERT INTO pokemon_encounter_version_detail_response ("version", max_chance, encounter_details) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_encounter_version_detail_response'
--
UPDATE pokemon_encounter_version_detail_response SET "version" = ?, max_chance = ?, encounter_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_encounter_version_detail_response'
--
DELETE FROM pokemon_encounter_version_detail_response WHERE 1=2;

