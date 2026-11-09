--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationAreaPokemonEncounter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_area_pokemon_encounter'
--
SELECT pokemon, version_details FROM location_area_pokemon_encounter WHERE 1=1;

--
-- INSERT template for table 'location_area_pokemon_encounter'
--
INSERT INTO location_area_pokemon_encounter (pokemon, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'location_area_pokemon_encounter'
--
UPDATE location_area_pokemon_encounter SET pokemon = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'location_area_pokemon_encounter'
--
DELETE FROM location_area_pokemon_encounter WHERE 1=2;

