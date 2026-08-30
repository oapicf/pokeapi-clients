--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesFlavorText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_flavor_text'
--
SELECT flavor_text, "language", "version" FROM pokemon_species_flavor_text WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_flavor_text'
--
INSERT INTO pokemon_species_flavor_text (flavor_text, "language", "version") VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_species_flavor_text'
--
UPDATE pokemon_species_flavor_text SET flavor_text = ?, "language" = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_flavor_text'
--
DELETE FROM pokemon_species_flavor_text WHERE 1=2;

