--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityDetail_pokemon_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_detail_pokemon_inner'
--
SELECT is_hidden, slot, pokemon FROM ability_detail_pokemon_inner WHERE 1=1;

--
-- INSERT template for table 'ability_detail_pokemon_inner'
--
INSERT INTO ability_detail_pokemon_inner (is_hidden, slot, pokemon) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ability_detail_pokemon_inner'
--
UPDATE ability_detail_pokemon_inner SET is_hidden = ?, slot = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'ability_detail_pokemon_inner'
--
DELETE FROM ability_detail_pokemon_inner WHERE 1=2;

