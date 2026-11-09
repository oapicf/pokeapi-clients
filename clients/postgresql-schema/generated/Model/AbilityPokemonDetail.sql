--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityPokemonDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_pokemon_detail'
--
SELECT is_hidden, slot, pokemon FROM ability_pokemon_detail WHERE 1=1;

--
-- INSERT template for table 'ability_pokemon_detail'
--
INSERT INTO ability_pokemon_detail (is_hidden, slot, pokemon) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ability_pokemon_detail'
--
UPDATE ability_pokemon_detail SET is_hidden = ?, slot = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'ability_pokemon_detail'
--
DELETE FROM ability_pokemon_detail WHERE 1=2;

