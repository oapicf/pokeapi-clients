--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDexEntry' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_dex_entry'
--
SELECT entry_number, pokedex FROM pokemon_dex_entry WHERE 1=1;

--
-- INSERT template for table 'pokemon_dex_entry'
--
INSERT INTO pokemon_dex_entry (entry_number, pokedex) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_dex_entry'
--
UPDATE pokemon_dex_entry SET entry_number = ?, pokedex = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_dex_entry'
--
DELETE FROM pokemon_dex_entry WHERE 1=2;

