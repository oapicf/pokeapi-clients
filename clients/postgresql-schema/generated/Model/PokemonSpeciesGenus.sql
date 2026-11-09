--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesGenus' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_genus'
--
SELECT genus, "language" FROM pokemon_species_genus WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_genus'
--
INSERT INTO pokemon_species_genus (genus, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_genus'
--
UPDATE pokemon_species_genus SET genus = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_genus'
--
DELETE FROM pokemon_species_genus WHERE 1=2;

