--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_past_abilities_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_past_abilities_inner'
--
SELECT abilities, generation FROM pokemon_detail_past_abilities_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_past_abilities_inner'
--
INSERT INTO pokemon_detail_past_abilities_inner (abilities, generation) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_past_abilities_inner'
--
UPDATE pokemon_detail_past_abilities_inner SET abilities = ?, generation = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_past_abilities_inner'
--
DELETE FROM pokemon_detail_past_abilities_inner WHERE 1=2;

