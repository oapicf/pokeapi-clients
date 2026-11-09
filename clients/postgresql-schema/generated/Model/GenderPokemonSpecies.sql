--
-- "PokéAPI"
-- Prepared SQL queries for 'GenderPokemonSpecies' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_pokemon_species'
--
SELECT rate, pokemon_species FROM gender_pokemon_species WHERE 1=1;

--
-- INSERT template for table 'gender_pokemon_species'
--
INSERT INTO gender_pokemon_species (rate, pokemon_species) VALUES (?, ?);

--
-- UPDATE template for table 'gender_pokemon_species'
--
UPDATE gender_pokemon_species SET rate = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'gender_pokemon_species'
--
DELETE FROM gender_pokemon_species WHERE 1=2;

