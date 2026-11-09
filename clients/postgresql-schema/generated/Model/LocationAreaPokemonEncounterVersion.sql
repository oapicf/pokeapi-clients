--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaPokemonEncounterVersion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_pokemon_encounter_version'
--
SELECT "version", max_chance, encounter_details FROM location_area_pokemon_encounter_version WHERE 1=1;

--
-- INSERT template for table 'location_area_pokemon_encounter_version'
--
INSERT INTO location_area_pokemon_encounter_version ("version", max_chance, encounter_details) VALUES (?, ?, ?);

--
-- UPDATE template for table 'location_area_pokemon_encounter_version'
--
UPDATE location_area_pokemon_encounter_version SET "version" = ?, max_chance = ?, encounter_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_pokemon_encounter_version'
--
DELETE FROM location_area_pokemon_encounter_version WHERE 1=2;

