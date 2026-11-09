--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonEncounterResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_encounter_response'
--
SELECT location_area, version_details FROM pokemon_encounter_response WHERE 1=1;

--
-- INSERT template for table 'pokemon_encounter_response'
--
INSERT INTO pokemon_encounter_response (location_area, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_encounter_response'
--
UPDATE pokemon_encounter_response SET location_area = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_encounter_response'
--
DELETE FROM pokemon_encounter_response WHERE 1=2;

