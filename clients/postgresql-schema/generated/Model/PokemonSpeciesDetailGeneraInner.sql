--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesDetail_genera_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_detail_genera_inner'
--
SELECT genus, "language" FROM pokemon_species_detail_genera_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_detail_genera_inner'
--
INSERT INTO pokemon_species_detail_genera_inner (genus, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_species_detail_genera_inner'
--
UPDATE pokemon_species_detail_genera_inner SET genus = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_detail_genera_inner'
--
DELETE FROM pokemon_species_detail_genera_inner WHERE 1=2;

