--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonAbilityPast' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_ability_past'
--
SELECT is_hidden, slot, ability FROM pokemon_ability_past WHERE 1=1;

--
-- INSERT template for table 'pokemon_ability_past'
--
INSERT INTO pokemon_ability_past (is_hidden, slot, ability) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_ability_past'
--
UPDATE pokemon_ability_past SET is_hidden = ?, slot = ?, ability = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_ability_past'
--
DELETE FROM pokemon_ability_past WHERE 1=2;

