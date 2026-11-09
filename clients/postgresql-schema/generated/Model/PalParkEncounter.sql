--
-- "PokéAPI"
-- Prepared SQL queries for 'PalParkEncounter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pal_park_encounter'
--
SELECT base_score, rate, pokemon_species FROM pal_park_encounter WHERE 1=1;

--
-- INSERT template for table 'pal_park_encounter'
--
INSERT INTO pal_park_encounter (base_score, rate, pokemon_species) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pal_park_encounter'
--
UPDATE pal_park_encounter SET base_score = ?, rate = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pal_park_encounter'
--
DELETE FROM pal_park_encounter WHERE 1=2;

