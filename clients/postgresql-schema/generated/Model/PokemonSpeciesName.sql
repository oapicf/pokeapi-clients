--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_name'
--
SELECT "name", "language" FROM pokemon_species_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_name'
--
INSERT INTO pokemon_species_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_name'
--
UPDATE pokemon_species_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_name'
--
DELETE FROM pokemon_species_name WHERE 1=2;

