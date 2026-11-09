--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesVariety' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_variety'
--
SELECT is_default, pokemon FROM pokemon_species_variety WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_variety'
--
INSERT INTO pokemon_species_variety (is_default, pokemon) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_variety'
--
UPDATE pokemon_species_variety SET is_default = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_variety'
--
DELETE FROM pokemon_species_variety WHERE 1=2;

