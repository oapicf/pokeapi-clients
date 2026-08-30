--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_abilities_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_abilities_inner'
--
SELECT ability, is_hidden, slot FROM pokemon_detail_abilities_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_abilities_inner'
--
INSERT INTO pokemon_detail_abilities_inner (ability, is_hidden, slot) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_detail_abilities_inner'
--
UPDATE pokemon_detail_abilities_inner SET ability = ?, is_hidden = ?, slot = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_abilities_inner'
--
DELETE FROM pokemon_detail_abilities_inner WHERE 1=2;

