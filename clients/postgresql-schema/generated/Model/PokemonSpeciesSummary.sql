--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_summary'
--
SELECT "name", url FROM pokemon_species_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_summary'
--
INSERT INTO pokemon_species_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_summary'
--
UPDATE pokemon_species_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_summary'
--
DELETE FROM pokemon_species_summary WHERE 1=2;

