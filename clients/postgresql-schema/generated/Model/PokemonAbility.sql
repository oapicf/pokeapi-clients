--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonAbility' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_ability'
--
SELECT is_hidden, slot, ability FROM pokemon_ability WHERE 1=1;

--
-- INSERT template for table 'pokemon_ability'
--
INSERT INTO pokemon_ability (is_hidden, slot, ability) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_ability'
--
UPDATE pokemon_ability SET is_hidden = ?, slot = ?, ability = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_ability'
--
DELETE FROM pokemon_ability WHERE 1=2;

