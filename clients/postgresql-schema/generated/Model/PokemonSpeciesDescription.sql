--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_description'
--
SELECT description, "language" FROM pokemon_species_description WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_description'
--
INSERT INTO pokemon_species_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_description'
--
UPDATE pokemon_species_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_description'
--
DELETE FROM pokemon_species_description WHERE 1=2;

