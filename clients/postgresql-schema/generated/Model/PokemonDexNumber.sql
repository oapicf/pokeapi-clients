--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDexNumber' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_dex_number'
--
SELECT entry_number, pokemon_species FROM pokemon_dex_number WHERE 1=1;

--
-- INSERT template for table 'pokemon_dex_number'
--
INSERT INTO pokemon_dex_number (entry_number, pokemon_species) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_dex_number'
--
UPDATE pokemon_dex_number SET entry_number = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_dex_number'
--
DELETE FROM pokemon_dex_number WHERE 1=2;

