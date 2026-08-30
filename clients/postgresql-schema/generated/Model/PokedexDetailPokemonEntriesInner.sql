--
-- "PokéAPI"
-- Prepared SQL queries for 'PokedexDetail_pokemon_entries_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokedex_detail_pokemon_entries_inner'
--
SELECT entry_number, pokemon_species FROM pokedex_detail_pokemon_entries_inner WHERE 1=1;

--
-- INSERT template for table 'pokedex_detail_pokemon_entries_inner'
--
INSERT INTO pokedex_detail_pokemon_entries_inner (entry_number, pokemon_species) VALUES (?, ?);

--
-- UPDATE template for table 'pokedex_detail_pokemon_entries_inner'
--
UPDATE pokedex_detail_pokemon_entries_inner SET entry_number = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pokedex_detail_pokemon_entries_inner'
--
DELETE FROM pokedex_detail_pokemon_entries_inner WHERE 1=2;

