--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesDetail_varieties_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_detail_varieties_inner'
--
SELECT is_default, pokemon FROM pokemon_species_detail_varieties_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_detail_varieties_inner'
--
INSERT INTO pokemon_species_detail_varieties_inner (is_default, pokemon) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_detail_varieties_inner'
--
UPDATE pokemon_species_detail_varieties_inner SET is_default = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_detail_varieties_inner'
--
DELETE FROM pokemon_species_detail_varieties_inner WHERE 1=2;

