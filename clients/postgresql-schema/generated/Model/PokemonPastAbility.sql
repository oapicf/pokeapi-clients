--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonPastAbility' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_past_ability'
--
SELECT abilities, generation FROM pokemon_past_ability WHERE 1=1;

--
-- INSERT template for table 'pokemon_past_ability'
--
INSERT INTO pokemon_past_ability (abilities, generation) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_past_ability'
--
UPDATE pokemon_past_ability SET abilities = ?, generation = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_past_ability'
--
DELETE FROM pokemon_past_ability WHERE 1=2;

